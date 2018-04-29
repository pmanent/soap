/**
 * 
 */
package com.soap.consumer;

import com.soap.consumer.operation.SoapOperation;

/**
 * @author peremanent
 *
 */
public interface SoapConsumer {
	
	public Object consumeSoap();
	
	public SoapOperation getSoapOperation();
}
