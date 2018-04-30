package com.soap.consumer.operation;

import java.util.Map;

import javax.validation.ValidationException;

import com.soap.controller.support.CustomServiceGateway;

public interface SoapOperation {
	public Object execute();

	public void validate() throws ValidationException;

	public Object createRequest();
	
	public String getEndPoint();

	public void setEndPoint(String endPoint);

	public String getOperation();
	
	public void setOperation(String operation);

	public Map<String, String> getParams();

	public void setParams(Map<String, String> params);
	
	public CustomServiceGateway getGateway() ;
	
	public void setGateway(CustomServiceGateway gateway);
}
