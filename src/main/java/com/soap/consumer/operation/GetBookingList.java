/**
 * 
 */
package com.soap.consumer.operation;

import java.util.Map;

import javax.validation.ValidationException;
import javax.xml.datatype.XMLGregorianCalendar;

import com.soap.consumer.domain.BookingListCriteria;
import com.soap.consumer.domain.CredentialsNoLanguage;
import com.soap.consumer.domain.GetBookingListRQ;
import com.soap.utils.DateUtils;
import com.soap.utils.StringUtils;

/**
 * @author peremanent
 *
 */
public class GetBookingList extends SoapOperationImpl {

	private static final String OPERATION = "GetBookingList";

	public GetBookingList() {
		super(OPERATION);
		// TODO Auto-generated constructor stub
	}

	/**
	 * <xsd:GetBookingListRQ>
         <crs:Credentials>
            <crs:UserName>?</crs:UserName>
            <crs:Password>?</crs:Password>
         </crs:Credentials>
         <crs:Criteria>
            <!--Optional:-->
            <crs:StartDate>?</crs:StartDate>
            <!--Optional:-->
            <crs:EndDate>?</crs:EndDate>
            <!--Optional:-->
            <crs:Filter>?</crs:Filter>
            <!--Optional:-->
            <crs:LastUpdatedDate>?</crs:LastUpdatedDate>
            <!--Optional:-->
            <crs:ReturnInquiries>?</crs:ReturnInquiries>
         </crs:Criteria>
      </xsd:GetBookingListRQ>
	 */
	@Override
	public void validate() throws ValidationException {
		Map<String, String> params = this.getParams();
		String username = params.get(SoapOperationProperties.USERNAME_PARAM_LABEL);
		String password = params.get(SoapOperationProperties.PASSWORD_PARAM_LABEL);

		if (username == null) {
			throw new ValidationException("UserName is required");
		} else if (password == null) {
			throw new ValidationException("Password is required");
		}
	}

	/* (non-Javadoc)
	 * @see com.soap.consumer.operation.SoapOperation#createRequest()
	 */
	@Override
	public Object createRequest() {
		GetBookingListRQ request = new GetBookingListRQ();
		CredentialsNoLanguage credentials = new CredentialsNoLanguage();
		credentials.setUserName(this.params.get(SoapOperationProperties.USERNAME_PARAM_LABEL));
		credentials.setPassword(this.params.get(SoapOperationProperties.PASSWORD_PARAM_LABEL));
		
		request.setCredentials(credentials);
		
		BookingListCriteria criteria = new BookingListCriteria();
		request.setCriteria(criteria);
		
		String startDate = this.params.get(SoapOperationProperties.STARTDATE_PARAM_LABEL);
		String endDate = this.params.get(SoapOperationProperties.ENDDATE_PARAM_LABEL);
		String filter = this.params.get(SoapOperationProperties.FILTER_PARAM_LABEL);
		String lastUpdateDate = this.params.get(SoapOperationProperties.LASTUPDATEDATE_PARAM_LABEL);
		String ReturnInquiries = this.params.get(SoapOperationProperties.RETURN_INQUIRIES_PARAM_LABEL);
		
		
		XMLGregorianCalendar XMLstartDate= DateUtils.toXMLGregorianCalendar(startDate);
		XMLGregorianCalendar XMLendDate = DateUtils.toXMLGregorianCalendar(endDate);
		XMLGregorianCalendar lastUpdatedDate = DateUtils.toXMLGregorianCalendar(lastUpdateDate);
		Boolean returnInquiries=StringUtils.toBoolean(ReturnInquiries);
		
		criteria.setStartDate(XMLstartDate);
		criteria.setEndDate(XMLendDate);
		criteria.setFilter(filter);
		criteria.setLastUpdatedDate(lastUpdatedDate);
		criteria.setReturnInquiries(returnInquiries);
		return request;
	}
}
