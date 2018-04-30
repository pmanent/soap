package com.soap.consumer.operation;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.soap.consumer.AvantioSoapClientProperties;
import com.soap.consumer.AvantioSoapConsumer;
import com.soap.controller.support.CustomServiceGateway;
import com.soap.utils.StringUtils;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class GetBookingListFunctionalTest {
	
	@Autowired
	private CustomServiceGateway gateway;

	@Test
	public void getBookingList(){
		Map<String,String> params = this.retrieveRequestMap();
		AvantioSoapConsumer client = new AvantioSoapConsumer(AvantioSoapClientProperties.END_POINT,
			       "GetBookingList",
			       params,
				   gateway);
		Object response = client.consumeSoap();
		Assert.assertNotNull("The server must response", response);
	}
	
	private Map<String,String> retrieveRequestMap(){
		Map<String,String> params = new HashMap<String,String>();
		params.put("UserName", StringUtils.loadStringKeyFile(AvantioSoapClientProperties.USERNAME_KEY_PROPERTIES));
		params.put("Password", StringUtils.loadStringKeyFile(AvantioSoapClientProperties.PASSWORD_KEY_PROPERTIES));
		params.put("StartDate", "2018-04-29");
		params.put("EndDate", "2018-06-29");
		params.put("Filter", "STAY_DATES");
		

		return params;
		
	}

}
