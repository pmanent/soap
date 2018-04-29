package com.soap.consumer;

import java.util.Map;

import com.soap.consumer.factory.OperationFactory;
import com.soap.consumer.operation.SoapOperation;
import com.soap.controller.support.CustomServiceGateway;

public class AvantioPostSoapConsumer implements SoapConsumer {
	/**
	 * Class responsible to execute the call to the SOAP service
	 */
	private SoapOperation operation;

	public AvantioPostSoapConsumer(String endpoint, String operation, Map<String, String> allRequestParams,
			CustomServiceGateway gateway) {
		this.operation = OperationFactory.newInstanceForPost(operation);
		this.operation.setEndPoint(endpoint);
		this.operation.setParams(allRequestParams);
		this.operation.setGateway(gateway);
	}

	public Object consumeSoap() {

		return operation.execute();
	}

	@Override
	public SoapOperation getSoapOperation() {
		return operation;
	}
}
