package com.soap.controller.support;

import org.springframework.ws.WebServiceMessageFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class CustomServiceGateway extends WebServiceGatewaySupport {

	public CustomServiceGateway() {
		// TODO Auto-generated constructor stub
	}

	public CustomServiceGateway(WebServiceMessageFactory messageFactory) {
		super(messageFactory);
		// TODO Auto-generated constructor stub
	}

}
