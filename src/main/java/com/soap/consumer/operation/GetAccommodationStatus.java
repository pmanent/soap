package com.soap.consumer.operation;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.regex.Pattern;

import javax.validation.ValidationException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.soap.consumer.domain.AccommodationCodeList;
import com.soap.consumer.domain.Credentials;
import com.soap.consumer.domain.GetAccommodationStatusRQ;
import com.soap.consumer.domain.Occupants;
import com.soap.consumer.domain.OnlineStateCriteria;
import com.soap.consumer.exception.BadRequestException;
import com.soap.utils.DateUtils;
import com.soap.utils.StringUtils;
import java.util.List;
import com.soap.consumer.domain.Localizer;


public class GetAccommodationStatus extends SoapOperationImpl {
	private static final String OPERATION = "GetAccommodationStatus";

	public GetAccommodationStatus() {
		super(OPERATION);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void validate() throws ValidationException {
		Map<String, String> params = this.getParams();
		String username = params.get(SoapOperationProperties.USERNAME_PARAM_LABEL);
		String password = params.get(SoapOperationProperties.PASSWORD_PARAM_LABEL);
		String accommodationCodeList = params.get(SoapOperationProperties.ACCOMMODATION_CODE_PARAM_LABEL);
		String dateFrom = params.get(SoapOperationProperties.DATEFROM_PARAM_LABEL);
		String dateTo = params.get(SoapOperationProperties.DATETO_PARAM_LABEL);
		String adults = params.get(SoapOperationProperties.ADULTS_PARAM_LABEL);

		if (username == null) {
			throw new BadRequestException("UserName is required");
		} else if (password == null) {
			throw new BadRequestException("Password is required");
		} else if (accommodationCodeList == null) {
			throw new BadRequestException("Accommodation code list is required");
		} else if (dateFrom == null) {
			throw new BadRequestException("Date from is required");
		} else if (dateTo == null) {
			throw new BadRequestException("Date to is required");
		} else if (adults == null) {
			throw new BadRequestException("Adults number is required");
		}
	}

	/* (non-Javadoc)
	 * @see com.soap.consumer.operation.SoapOperation#createRequest()
	 */
	@Override
	public Object createRequest() {
		GetAccommodationStatusRQ request = new GetAccommodationStatusRQ();
		Credentials credentials = super.retrieveCredentials();
		credentials.setUserName(this.params.get(SoapOperationProperties.USERNAME_PARAM_LABEL));
		credentials.setPassword(this.params.get(SoapOperationProperties.PASSWORD_PARAM_LABEL));
		
		request.setCredentials(credentials);
		
		OnlineStateCriteria criteria = new OnlineStateCriteria();
		request.setCriteria(criteria);
		
		String dateFrom = this.params.get(SoapOperationProperties.DATEFROM_PARAM_LABEL);
		String dateTo = this.params.get(SoapOperationProperties.DATETO_PARAM_LABEL);
		String adults = this.params.get(SoapOperationProperties.ADULTS_PARAM_LABEL);
		
		
		XMLGregorianCalendar XMLstartDate= DateUtils.toXMLGregorianCalendar(dateFrom);
		XMLGregorianCalendar XMLendDate = DateUtils.toXMLGregorianCalendar(dateTo);
		
		// Set accommodation
		String accommodationCodeList = this.params.get(SoapOperationProperties.ACCOMMODATION_CODE_PARAM_LABEL);
		String separator = Pattern.quote(",");
		String[] accommodationCodeListArray = accommodationCodeList.split(separator);
		
		AccommodationCodeList accommodationCodeListObject = new AccommodationCodeList();
		for (int x=0; x<accommodationCodeListArray.length; x++) {
			accommodationCodeListObject.getAccommodationCode().add(new BigInteger(accommodationCodeListArray[x]));
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
		
		
		criteria.setDateFrom(XMLstartDate);
		criteria.setDateTo(XMLendDate);
		criteria.setOccupants(occupants);
		criteria.setAccommodationList(accommodationCodeListObject);
		
		return request;
	}
}
