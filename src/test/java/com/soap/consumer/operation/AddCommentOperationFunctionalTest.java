package com.soap.consumer.operation;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.soap.consumer.AvantioSoapClientProperties;
import com.soap.controller.support.CustomServiceGateway;
import com.soap.utils.StringUtils;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class AddCommentOperationFunctionalTest {
	@org.springframework.beans.factory.annotation.Autowired
	private CustomServiceGateway gateway;
	@Test
	public void addCommandConsumeSoapTest(){
		Map<String,String> params = this.retrieveRequestMap();
		params.put("BookingCode", "1");
		params.put("Localizator", "1");
		params.put("AgentLocalizator", "1");
		SoapOperation operation = new AddCommentOperation();
		operation.setGateway(this.gateway);
		operation.setParams(params);
		operation.setEndPoint(AvantioSoapClientProperties.END_POINT);
		Exception error=null;
		Object response;
		try {
			response = operation.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			error=e;
		}
		Assert.assertNotNull(error.getMessage(), error);
	}
	
	
	private Map<String,String> retrieveRequestMap(){
		Map<String,String> params = new HashMap<String,String>();
		params.put("Language", "ES");
		
		params.put("UserName", StringUtils.loadStringKeyFile(AvantioSoapClientProperties.USERNAME_KEY_PROPERTIES));
		params.put("Password", StringUtils.loadStringKeyFile(AvantioSoapClientProperties.PASSWORD_KEY_PROPERTIES));
		params.put("Comments", "Comentario de calidad!");

		return params;
		
	}
}
