package com.soap.consumer;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBElement;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ws.soap.client.SoapFaultClientException;

import com.soap.consumer.domain.GetCompaniesRS;
import com.soap.controller.support.CustomServiceGateway;
import com.soap.utils.StringUtils;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class AvantioSoapConsumerTest {
	
	@Autowired
	private CustomServiceGateway gateway;
	
	public AvantioSoapConsumerTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void sopaConsumerTest(){
		String operation = "GetCompanies";
		SoapConsumer consumer =  new AvantioSoapConsumer(AvantioSoapClientProperties.END_POINT,
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
		
		Assert.assertTrue("Response must be not null", response!=null);
	}
	private Map<String,String> retrieveRequestMap(){
		Map<String,String> params = new HashMap<String,String>();
		
		params.put("UserName", StringUtils.loadStringKeyFile(AvantioSoapClientProperties.USERNAME_KEY_PROPERTIES));
		params.put("Password", StringUtils.loadStringKeyFile(AvantioSoapClientProperties.PASSWORD_KEY_PROPERTIES));
				
		return params;
		
	}

}
