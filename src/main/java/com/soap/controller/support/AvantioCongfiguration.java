package com.soap.controller.support;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class AvantioCongfiguration {

	public AvantioCongfiguration() {
		// TODO Auto-generated constructor stub
	}
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this package must match the package in the <generatePackage> specified in
		// pom.xml
		marshaller.setContextPath("com.soap.consumer.domain");
		return marshaller;
	}

	@Bean
	public CustomServiceGateway countryClient(Jaxb2Marshaller marshaller) {
		
		CustomServiceGateway client = new CustomServiceGateway();
		client.setDefaultUri("http://ws.avantio.com/soap/vrmsConnectionServices.php?wsdl");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
}
