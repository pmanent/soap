/**
 * 
 */
package com.soap.consumer.operation;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

/**
 * @author peremanent
 *
 */
public abstract class SoapOperationImpl {

	/**
	 * Request of the operation. Created by the user.
	 */
	protected Object request;
	
	/**
	 * Response if the request, created by the system.
	 */
	protected Object response;
	
	protected WebServiceGatewaySupport webService;
	
	public SoapOperationImpl(Object request) {
		this.request=request;
	}
	
	public Object execOperation(){		
		
		response = webService.getWebServiceTemplate().marshalSendAndReceive("http://ws.avantio.com/soap/vrmsConnectionServices.php",
				request,
				new SoapActionCallback("IsAvailable"));
		
		return response;
	}

}
