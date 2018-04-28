package com.soap.consumer;

import java.util.Map;

import com.soap.consumer.factory.OperationFactory;
import com.soap.consumer.operation.SoapOperation;

public class PostSoapClient implements SoapClient {
	/**
	 * Class responsible to execute the call to the SOAP service
	 */
	private SoapOperation operation;

	public PostSoapClient(String endpoint, String operation, Map<String, String> allRequestParams) {
		this.operation = OperationFactory.newInstanceForPost(operation);
		this.operation.setEndPoint(endpoint);
		this.operation.setParams(allRequestParams);
	}

	public Object consumeSoap() {

		return operation.execute();
	}
}
