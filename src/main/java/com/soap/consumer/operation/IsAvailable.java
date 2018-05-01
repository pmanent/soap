package com.soap.consumer.operation;
import java.math.BigInteger;
import java.util.GregorianCalendar;
import java.util.Map;

import javax.validation.ValidationException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.soap.consumer.domain.Accommodation;
import com.soap.consumer.domain.AvailableCriteria;
import com.soap.consumer.domain.Credentials;
import com.soap.consumer.domain.CredentialsNoLanguage;
import com.soap.consumer.domain.IsAvailableRQ;
import com.soap.consumer.domain.Occupants;
import com.soap.utils.DateUtils;
import com.soap.utils.StringUtils;

import com.soap.consumer.domain.Localizer;

public class IsAvailable extends SoapOperationImpl {
	
	private static final String OPERATION = "IsAvailable";

	public IsAvailable() {
		super(OPERATION);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 <xsd:IsAvailableRQ>
         <crs:Credentials>
            <!--Optional:-->
            <crs:Language>ES</crs:Language>
            <crs:UserName>itsatentoapi_test</crs:UserName>
            <crs:Password>testapixml</crs:Password>
         </crs:Credentials>
         <crs:Criteria>
            <crs:Accommodation>
               <crs:AccommodationCode>1</crs:AccommodationCode>
               <crs:UserCode>1</crs:UserCode>
               <!--Optional:-->
               <crs:AccommodationMasterCode>?</crs:AccommodationMasterCode>
               <crs:LoginGA>?</crs:LoginGA>
            </crs:Accommodation>
            <crs:Occupants>
               <crs:AdultsNumber>1</crs:AdultsNumber>
               <!--Optional:-->
               <crs:Child1_Age>?</crs:Child1_Age>
               <!--Optional:-->
               <crs:Child2_Age>?</crs:Child2_Age>
               <!--Optional:-->
               <crs:Child3_Age>?</crs:Child3_Age>
               <!--Optional:-->
               <crs:Child4_Age>?</crs:Child4_Age>
               <!--Optional:-->
               <crs:Child5_Age>?</crs:Child5_Age>
               <!--Optional:-->
               <crs:Child6_Age>?</crs:Child6_Age>
            </crs:Occupants>
            <crs:DateFrom>2018-10-01</crs:DateFrom>
            <crs:DateTo>2018-12-30</crs:DateTo>
         </crs:Criteria>
      </xsd:IsAvailableRQ>
	 * 
	 */

	@Override
	public void validate() throws ValidationException {
		Map<String, String> params = this.getParams();
		String username = params.get(SoapOperationProperties.USERNAME_PARAM_LABEL);
		String password = params.get(SoapOperationProperties.PASSWORD_PARAM_LABEL);
		String accommodationCode = params.get(SoapOperationProperties.ACCOMMODATION_CODE_PARAM_LABEL);
		String dateFrom = params.get(SoapOperationProperties.DATEFROM_PARAM_LABEL);
		String dateTo = params.get(SoapOperationProperties.DATETO_PARAM_LABEL);
		String adults = params.get(SoapOperationProperties.ADULTS_PARAM_LABEL);
		String loginGA = params.get(SoapOperationProperties.LOGINGA_PARAM_LABEL);
		String userCode = params.get(SoapOperationProperties.USER_CODE_PARAM_LABEL);

		if (username == null) {
			throw new ValidationException("UserName is required");
		} else if (password == null) {
			throw new ValidationException("Password is required");
		} else if (accommodationCode == null) {
			throw new ValidationException("Accommodation code is required");
		} else if (dateFrom == null) {
			throw new ValidationException("Date from is required");
		} else if (dateTo == null) {
			throw new ValidationException("Date to is required");
		} else if (adults == null) {
			throw new ValidationException("Adults number is required");
		} else if (loginGA == null) {
			throw new ValidationException("LoginGA is required");
		} else if (userCode == null) {
			throw new ValidationException("UserCode is required");
		}
	}

	/* (non-Javadoc)
	 * @see com.soap.consumer.operation.SoapOperation#createRequest()
	 */
	@Override
	public Object createRequest() {
		IsAvailableRQ request = new IsAvailableRQ();
		Credentials credentials = super.retrieveCredentials();
		credentials.setUserName(this.params.get(SoapOperationProperties.USERNAME_PARAM_LABEL));
		credentials.setPassword(this.params.get(SoapOperationProperties.PASSWORD_PARAM_LABEL));
		
		request.setCredentials(credentials);
		
		AvailableCriteria criteria = new AvailableCriteria();
		request.setCriteria(criteria);
		
		String accommodationCode = this.params.get(SoapOperationProperties.ACCOMMODATION_CODE_PARAM_LABEL);
		String dateFrom = this.params.get(SoapOperationProperties.DATEFROM_PARAM_LABEL);
		String dateTo = this.params.get(SoapOperationProperties.DATETO_PARAM_LABEL);
		String userCode = this.params.get(SoapOperationProperties.USER_CODE_PARAM_LABEL);
		String loginGA = this.params.get(SoapOperationProperties.LOGINGA_PARAM_LABEL);
		String adults = this.params.get(SoapOperationProperties.ADULTS_PARAM_LABEL);
		
		
		XMLGregorianCalendar XMLstartDate= DateUtils.toXMLGregorianCalendar(dateFrom);
		XMLGregorianCalendar XMLendDate = DateUtils.toXMLGregorianCalendar(dateTo);
		
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
		
		// Set Occupants
		Occupants occupants = new Occupants();
		BigInteger adultsBI = new BigInteger(adults);
		occupants.setAdultsNumber(adultsBI);
		// Optionals
		if (this.params.get(SoapOperationProperties.CHILD1AGE_PARAM_LABEL) != null) {
			BigInteger child1AgeBI = new BigInteger(this.params.get(SoapOperationProperties.CHILD1AGE_PARAM_LABEL));
			occupants.setChild1Age(child1AgeBI);
		}
		if (this.params.get(SoapOperationProperties.CHILD2AGE_PARAM_LABEL) != null) {
			BigInteger child2AgeBI = new BigInteger(this.params.get(SoapOperationProperties.CHILD2AGE_PARAM_LABEL));
			occupants.setChild1Age(child2AgeBI);
		}
		if (this.params.get(SoapOperationProperties.CHILD3AGE_PARAM_LABEL) != null) {
			BigInteger child3AgeBI = new BigInteger(this.params.get(SoapOperationProperties.CHILD3AGE_PARAM_LABEL));
			occupants.setChild1Age(child3AgeBI);
		}
		if (this.params.get(SoapOperationProperties.CHILD4AGE_PARAM_LABEL) != null) {
			BigInteger child4AgeBI = new BigInteger(this.params.get(SoapOperationProperties.CHILD4AGE_PARAM_LABEL));
			occupants.setChild1Age(child4AgeBI);
		}
		if (this.params.get(SoapOperationProperties.CHILD5AGE_PARAM_LABEL) != null) {
			BigInteger child5AgeBI = new BigInteger(this.params.get(SoapOperationProperties.CHILD5AGE_PARAM_LABEL));
			occupants.setChild1Age(child5AgeBI);
		}
		if (this.params.get(SoapOperationProperties.CHILD6AGE_PARAM_LABEL) != null) {
			BigInteger child6AgeBI = new BigInteger(this.params.get(SoapOperationProperties.CHILD6AGE_PARAM_LABEL));
			occupants.setChild1Age(child6AgeBI);
		}
		
		
		criteria.setAccommodation(accommodation);
		criteria.setDateFrom(XMLstartDate);
		criteria.setDateTo(XMLendDate);
		criteria.setOccupants(occupants);
		
		return request;
	}
}
