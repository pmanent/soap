package com.soap.consumer.operation;
import java.math.BigInteger;
import java.util.GregorianCalendar;
import java.util.Map;

import javax.validation.ValidationException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.soap.consumer.domain.Accommodation;
import com.soap.consumer.domain.Credentials;
import com.soap.consumer.domain.CriteriaAccommodationPages;
import com.soap.consumer.domain.GetAvailabilitiesRQ;
import com.soap.consumer.exception.BadRequestException;
import com.soap.utils.DateUtils;
import com.soap.utils.StringUtils;

import com.soap.consumer.domain.Localizer;

public class GetAvailabilities extends SoapOperationImpl {
	private static final String OPERATION = "GetAvailabilites";

	public GetAvailabilities() {
		super(OPERATION);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * <xsd:GetAvailabilitiesRQ>
         <crs:Credentials>
            <!--Optional:-->
            <crs:Language>?</crs:Language>
            <crs:UserName>?</crs:UserName>
            <crs:Password>?</crs:Password>
         </crs:Credentials>
         <crs:Criteria>
            <!--Optional:-->
            <crs:Accommodation>
               <crs:AccommodationCode>?</crs:AccommodationCode>
               <crs:UserCode>?</crs:UserCode>
               <!--Optional:-->
               <crs:AccommodationMasterCode>?</crs:AccommodationMasterCode>
               <crs:LoginGA>?</crs:LoginGA>
            </crs:Accommodation>
            <!--Optional:-->
            <crs:DateFrom>?</crs:DateFrom>
            <!--Optional:-->
            <crs:DateTo>?</crs:DateTo>
            <!--Optional:-->
            <crs:ReturnOnRequest>?</crs:ReturnOnRequest>
            <!--Optional:-->
            <crs:Page>?</crs:Page>
            <!--Optional:-->
            <crs:ReturnAccommodationUnits>?</crs:ReturnAccommodationUnits>
         </crs:Criteria>
      </xsd:GetAvailabilitiesRQ>
	 */
	
	@Override
	public void validate() throws ValidationException {
		Map<String, String> params = this.getParams();
		String username = params.get(SoapOperationProperties.USERNAME_PARAM_LABEL);
		String password = params.get(SoapOperationProperties.PASSWORD_PARAM_LABEL);
		String accommodationCode = params.get(SoapOperationProperties.ACCOMMODATION_CODE_PARAM_LABEL);
		String loginGA = params.get(SoapOperationProperties.LOGINGA_PARAM_LABEL);
		String userCode = params.get(SoapOperationProperties.USER_CODE_PARAM_LABEL);

		if (username == null) {
			throw new BadRequestException("UserName is required");
		} else if (password == null) {
			throw new BadRequestException("Password is required");
		} else if (accommodationCode == null) {
			throw new BadRequestException("Accommodation code is required");
		} else if (loginGA == null) {
			throw new BadRequestException("LoginGA is required");
		} else if (userCode == null) {
			throw new BadRequestException("UserCode is required");
		}
	}
	
	@Override
	public Object createRequest() {
		GetAvailabilitiesRQ request = new GetAvailabilitiesRQ();
		Credentials credentials = super.retrieveCredentials();
		credentials.setUserName(this.params.get(SoapOperationProperties.USERNAME_PARAM_LABEL));
		credentials.setPassword(this.params.get(SoapOperationProperties.PASSWORD_PARAM_LABEL));
		
		request.setCredentials(credentials);
		
		CriteriaAccommodationPages criteria = new CriteriaAccommodationPages();
		request.setCriteria(criteria);
		
		String accommodationCode = this.params.get(SoapOperationProperties.ACCOMMODATION_CODE_PARAM_LABEL);
		String userCode = this.params.get(SoapOperationProperties.USER_CODE_PARAM_LABEL);
		String loginGA = this.params.get(SoapOperationProperties.LOGINGA_PARAM_LABEL);
		
		// Optionals
		String dateFrom = this.params.get(SoapOperationProperties.DATEFROM_PARAM_LABEL);
		String dateTo = this.params.get(SoapOperationProperties.DATETO_PARAM_LABEL);
		XMLGregorianCalendar XMLdateFrom= DateUtils.toXMLGregorianCalendar(dateFrom);
		XMLGregorianCalendar XMLdateTo = DateUtils.toXMLGregorianCalendar(dateTo);
		
		Boolean returnOnRequest = new Boolean(this.params.get(SoapOperationProperties.RETURN_ONREQUEST_PARAM_LABEL));		
		if (this.params.get(SoapOperationProperties.PAGE_PARAM_LABEL) != null) {
			BigInteger pageBI = new BigInteger(this.params.get(SoapOperationProperties.PAGE_PARAM_LABEL));
			criteria.setPage(pageBI);
		}
		Boolean returnAccommodationUnits = new Boolean (this.params.get(SoapOperationProperties.RETURN_ACCOMMODATION_UNITS_CODE_PARAM_LABEL));
		
		// Set accommodation
		Accommodation accommodation = new Accommodation();
		BigInteger accommodationCodeBI = new BigInteger(accommodationCode);
		BigInteger userCodeBI = new BigInteger(userCode);
		accommodation.setAccommodationCode(accommodationCodeBI);
		accommodation.setLoginGA(loginGA);
		accommodation.setUserCode(userCodeBI);
		// Optionals
		if (this.params.get(SoapOperationProperties.ACCOMMODATION_MASTER_CODE_PARAM_LABEL) != null) {
			BigInteger accommodationMasterCodeBI = new BigInteger(this.params.get(SoapOperationProperties.ACCOMMODATION_MASTER_CODE_PARAM_LABEL));
			accommodation.setAccommodationMasterCode(accommodationMasterCodeBI);
		}
		
		criteria.setAccommodation(accommodation);
		criteria.setDateFrom(XMLdateFrom);
		criteria.setDateTo(XMLdateTo);
		criteria.setReturnAccommodationUnits(returnAccommodationUnits);
		criteria.setReturnOnRequest(returnOnRequest);
		
		return request;
	}
}
