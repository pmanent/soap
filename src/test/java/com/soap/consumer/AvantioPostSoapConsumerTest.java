package com.soap.consumer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ws.soap.client.SoapFaultClientException;

import com.soap.controller.support.CustomServiceGateway;
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class AvantioPostSoapConsumerTest {
	
	@Autowired
	private CustomServiceGateway gateway;
	
	public AvantioPostSoapConsumerTest() {
		// TODO Auto-generated constructor stub
	}
	@Test
	public void sopaConsumerTest(){
		String operation = "AddComment";
		SoapConsumer consumer =  new AvantioPostSoapConsumer(AvantioSoapClientProperties.END_POINT,
			       operation,
			       retrieveRequestMap(),
			       gateway);
		Object response = null;
		SoapFaultClientException exception = null;
		try {
			response = consumer.consumeSoap();
		} catch (SoapFaultClientException e) {
			exception = e;
			
		}
		Assert.assertTrue("Response must be not null", exception!=null);
	}
	private Map<String,String> retrieveRequestMap(){
		Map<String,String> params = new HashMap<String,String>();
		params.put("Language", "ES");
		params.put("UserName", "sssss");
		params.put("Password", "ssssss");
		params.put("Comments", "Comentario de calidad!");
		params.put("BookingCode", null);
		params.put("Localizator", "1");
		params.put("AgentLocalizator", null);
		
		return params;
		
	}

}