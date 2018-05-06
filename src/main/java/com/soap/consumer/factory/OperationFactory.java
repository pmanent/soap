/**
 * 
 */
package com.soap.consumer.factory;

import com.soap.consumer.operation.AddCommentOperation;
import com.soap.consumer.operation.GetBookingList;
import com.soap.consumer.operation.GetCompanies;
import com.soap.consumer.operation.IsAvailable;
import com.soap.consumer.operation.GetAccommodationStatus;
import com.soap.consumer.operation.SoapOperation;

/**
 * @author peremanent
 *
 */
public class OperationFactory {
	enum operations {
		AddComment, GetCompanies, GetBookingList, IsAvailable, GetAccommodationStatus
	};

	public static SoapOperation newInstanceForGet(String operation) {
		SoapOperation soapOperation = null;

		if (operation.equalsIgnoreCase(operations.GetCompanies.toString())) {
			soapOperation = new GetCompanies();
		} else if(operation.equalsIgnoreCase(operations.GetBookingList.toString())) {
			soapOperation = new GetBookingList();
		} else if(operation.equalsIgnoreCase(operations.IsAvailable.toString())) {
			soapOperation = new IsAvailable();
		} else if(operation.equalsIgnoreCase(operations.GetAccommodationStatus.toString())) {
			soapOperation = new GetAccommodationStatus();
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
