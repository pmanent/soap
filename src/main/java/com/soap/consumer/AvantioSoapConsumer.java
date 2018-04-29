/**
 * 
 */
package com.soap.consumer;

import java.util.Map;

import com.soap.consumer.factory.OperationFactory;
import com.soap.consumer.operation.SoapOperation;

/**
 * @author peremanent
 *
 */
public class AvantioSoapConsumer implements SoapConsumer {

	/**
	 * Class responsible to execute the call to the SOAP service
	 */
	private SoapOperation operation;
	
	public AvantioSoapConsumer(String endpoint,String operation,Map<String,String> allRequestParams) {
		// TODO Auto-generated constructor stub
		this.operation = OperationFactory.newInstanceForGet(operation);
		this.operation.setEndPoint(endpoint);
		this.operation.setParams(allRequestParams);
	}
	
	public Object consumeSoap(){
		
		return operation.execute();
	}

	@Override
	public SoapOperation getSoapOperation() {
		return operation;
	}

}
