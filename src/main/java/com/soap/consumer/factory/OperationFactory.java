/**
 * 
 */
package com.soap.consumer.factory;

import com.soap.consumer.operation.AddCommentOperation;
import com.soap.consumer.operation.GetCompanies;
import com.soap.consumer.operation.SoapOperation;

/**
 * @author peremanent
 *
 */
public class OperationFactory {
	enum operations {
		AddComment, GetCompanies
	};

	public static SoapOperation newInstanceForGet(String operation) {
		SoapOperation soapOperation = null;

		if (operation.equalsIgnoreCase(operations.GetCompanies.toString())) {
			// generation of the SoapOperationInstance
			soapOperation = new GetCompanies();

		}
		return soapOperation;
	}

	public static SoapOperation newInstanceForPost(String operation) {
		SoapOperation soapOperation = null;
		if (operation.equalsIgnoreCase(operations.AddComment.toString())) {
			// generation of the SoapOperationInstance
			soapOperation = new AddCommentOperation();

		}
		return soapOperation;
	}
}
