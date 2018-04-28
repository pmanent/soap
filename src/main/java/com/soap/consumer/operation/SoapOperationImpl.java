/**
 * 
 */
package com.soap.consumer.operation;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.soap.consumer.domain.Credentials;
import com.soap.controller.support.CustomServiceGateway;

/**
 * @author peremanent
 *
 */
public abstract class SoapOperationImpl implements SoapOperation{

	/**
	 * Request of the operation. Created by the user.
	 */
	protected Object request;
	
	/**
	 * Response if the request, created by the system.
	 */
	protected Object response;
	
	protected String endPoint;
	
	protected String operation;
	
	protected Map<String,String> params = new HashMap<String,String>();
	
	protected CustomServiceGateway gateway;
	
	public SoapOperationImpl(String operation) {
		this.operation=operation;
	}
	
	public Object execute(){		
		
		this.validate();
		
		this.request = this.createRequest();
		
		response = gateway.getWebServiceTemplate().marshalSendAndReceive(this.endPoint,
				this.request,
				new SoapActionCallback(this.operation));
		
		return response;
	}
	
	public Credentials retrieveCredentials(){
		Credentials credentials = new Credentials();
		credentials.setLanguage(this.params.get("Language"));
		credentials.setUserName(this.params.get("UserName"));
		credentials.setPassword(this.params.get("Password"));
		return credentials;
	}


	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public Map<String, String> getParams() {
		return params;
	}

	public void setParams(Map<String, String> params) {
		this.params = params;
	}

	public CustomServiceGateway getGateway() {
		return gateway;
	}

	public void setGateway(CustomServiceGateway gateway) {
		this.gateway = gateway;
	}

}
