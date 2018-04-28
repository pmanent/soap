/**
 * 
 */
package com.soap.consumer.operation;

import java.util.HashMap;
import java.util.Map;

import javax.validation.ValidationException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.soap.consumer.AvantioSoapClientProperties;

/**
 * @author peremanent
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class AddCommentOperationTest {

	/**
	 * 
	 */
	public AddCommentOperationTest() {
		// TODO Auto-generated constructor stub
	}
	@Test
	public void addCommentValidationOKTest(){
		Map<String,String> params = this.retrieveRequestMap();
		
		SoapOperation operation = new AddCommentOperation();
		operation.setParams(params);
		boolean isValid=true;
		String message="Is Valid";
		try {
			operation.validate();
		} catch (ValidationException e) {
			isValid = false;
			message = e.getMessage();
		}
		Assert.assertTrue(message, isValid);
	}
	
	@Test
	public void addCommentValidationNoUsernameTest(){
		Map<String,String> params = this.retrieveRequestMap();
		params.remove("UserName");
		
		SoapOperation operation = new AddCommentOperation();
		operation.setParams(params);
		boolean isValid=true;
		String message="Is Valid";
		try {
			operation.validate();
		} catch (ValidationException e) {
			isValid = false;
			message = e.getMessage();
		}
		Assert.assertFalse(message, isValid);
	}
	
	@Test
	public void addCommentValidationNoPasswordTest(){
		Map<String,String> params = this.retrieveRequestMap();
		params.remove("Password");
		
		SoapOperation operation = new AddCommentOperation();
		operation.setParams(params);
		boolean isValid=true;
		String message="Is Valid";
		try {
			operation.validate();
		} catch (ValidationException e) {
			isValid = false;
			message = e.getMessage();
		}
		Assert.assertFalse(message, isValid);
	}
	
	@Test
	public void addCommentValidationNoCommentsTest(){
		Map<String,String> params = this.retrieveRequestMap();
		params.remove("Comments");
		
		SoapOperation operation = new AddCommentOperation();
		operation.setParams(params);
		boolean isValid=true;
		String message="Is Valid";
		try {
			operation.validate();
		} catch (ValidationException e) {
			isValid = false;
			message = e.getMessage();
		}
		Assert.assertFalse(message, isValid);
	}
	
	@Test
	public void addCommentCreateRequestOKTest(){
		Map<String,String> params = this.retrieveRequestMap();
		params.put("BookingCode", "1");
		params.put("Localizator", "1");
		params.put("AgentLocalizator", "1");
        
		SoapOperation operation = new AddCommentOperation();
		operation.setParams(params);
		Object request = null;
		try {
			operation.validate();
			request = operation.createRequest();
		} catch (ValidationException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull("The request is null", request);
	}
	
	private Map<String,String> retrieveRequestMap(){
		Map<String,String> params = new HashMap<String,String>();
		params.put("Language", "ES");
		params.put("UserName", "pere");
		params.put("Password", "pere");
		params.put("Comments", "Comentario de calidad!");

		return params;
		
	}

}
