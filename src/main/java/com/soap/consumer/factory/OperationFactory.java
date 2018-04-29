/**
 * 
 */
package com.soap.consumer.factory;

import com.soap.consumer.operation.AddCommentOperation;
import com.soap.consumer.operation.SoapOperation;

/**
 * @author peremanent
 *
 */
public class OperationFactory {
	enum operations{AddComment};

	/**
	 * 
	 */
	public OperationFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static SoapOperation newInstanceForGet(String operation){
		SoapOperation soapOperation = null;
		
		return soapOperation;
	}
	public static SoapOperation newInstanceForPost(String operation){
		SoapOperation soapOperation = null;
		if(operation.equalsIgnoreCase(operations.AddComment.toString())){
			//generation of the SoapOperationInstance
			soapOperation = new AddCommentOperation();
			
		}
		return soapOperation;
	}
}
