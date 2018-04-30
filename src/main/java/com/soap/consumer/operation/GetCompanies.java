/**
 * 
 */
package com.soap.consumer.operation;

import java.util.Map;

import javax.validation.ValidationException;

import com.soap.consumer.domain.AddCommentRQ;
import com.soap.consumer.domain.Credentials;
import com.soap.consumer.domain.CredentialsNoLanguage;
import com.soap.consumer.domain.GetCompaniesRQ;
import com.soap.consumer.domain.Localizer;

/**
 * @author peremanent
 *
 */
public class GetCompanies extends SoapOperationImpl {
	private static final String OPERATION = "GetCompanies";

	/**
	 * @param operation
	 */
	public GetCompanies() {
		super(OPERATION);
	}

	/* (non-Javadoc)
	 * @see com.soap.consumer.operation.SoapOperation#validate()
	 * <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:xsd="ws.avantio.com/crsConnectionServices/xsd" xmlns:crs="ws.avantio.com/crsConnectionServices">
   <soapenv:Header/>
   <soapenv:Body>
      <xsd:GetCompaniesRQ>
         <crs:Credentials>
            <crs:UserName>itsatentoapi_test</crs:UserName>
            <crs:Password>testapixml</crs:Password>
         </crs:Credentials>
      </xsd:GetCompaniesRQ>
   </soapenv:Body>
</soapenv:Envelope>
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
		Map<String, String> params = this.getParams();

		GetCompaniesRQ request = new GetCompaniesRQ();

		CredentialsNoLanguage credentials = new CredentialsNoLanguage();
		credentials.setUserName(this.params.get(SoapOperationProperties.USERNAME_PARAM_LABEL));
		credentials.setPassword(this.params.get(SoapOperationProperties.PASSWORD_PARAM_LABEL));
		
		request.setCredentials(credentials);
		
		return request;
	}

}
