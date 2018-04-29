/**
 * 
 */
package com.soap.consumer.operation;

import java.util.Map;

import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;

import com.soap.consumer.domain.AddCommentRQ;
import com.soap.consumer.domain.Credentials;
import com.soap.consumer.domain.Localizer;

/**
 * @author peremanent
 *
 */
public class AddCommentOperation extends SoapOperationImpl {

	private static final String OPERATION = "AddComment";

	public AddCommentOperation() {
		super(OPERATION);
	}

	/**
	 * Control of the params needed in the Soap Request. <crs:Credentials>
	 * <!--Optional:--> <crs:Language>?</crs:Language>
	 * <crs:UserName>?</crs:UserName> <crs:Password>?</crs:Password>
	 * </crs:Credentials> <crs:Localizer> <!--Optional:-->
	 * <crs:BookingCode>?</crs:BookingCode> <!--Optional:-->
	 * <crs:Localizator>?</crs:Localizator> <!--Optional:-->
	 * <crs:AgentLocalizator>?</crs:AgentLocalizator> </crs:Localizer>
	 * <crs:Comments>?</crs:Comments>
	 */
	@Override
	public void validate() throws ValidationException {
		Map<String, String> params = this.getParams();
		String username = params.get(SoapOperationProperties.USERNAME_PARAM_LABEL);
		String password = params.get(SoapOperationProperties.PASSWORD_PARAM_LABEL);
		String comments = params.get(SoapOperationProperties.COMMENTS_PARAM_LABEL);

		if (username == null) {
			throw new ValidationException("UserName is required");
		} else if (password == null) {
			throw new ValidationException("Password is required");
		} else if (comments == null) {
			throw new ValidationException("Comments is required");
		}
	}

	@Override
	public Object createRequest() {
		Map<String, String> params = this.getParams();

		AddCommentRQ request = new AddCommentRQ();

		Credentials credentials = super.retrieveCredentials();

		Localizer localizer = new Localizer();
		String agentLocalizatior = params.get(SoapOperationProperties.AGENT_LOCALIZATOR_PARAM_LABEL);
		String bookingCode = params.get(SoapOperationProperties.BOOKING_CODE_PARAM_LABEL);
		String localizator = params.get(SoapOperationProperties.LOCALIZATOR_PARAM_LABEL);

		localizer.setAgentLocalizator(agentLocalizatior);
		localizer.setBookingCode(bookingCode);
		localizer.setLocalizator(localizator);

		request.setCredentials(credentials);
		if (agentLocalizatior != null || bookingCode != null || localizator != null) {
			
		}
		request.setLocalizer(localizer);
		
		request.setComments(params.get(SoapOperationProperties.COMMENTS_PARAM_LABEL));

		return request;
	}
}
