/**
 * 
 */
package com.soap.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.soap.consumer.AvantioSoapClientProperties;
import com.soap.consumer.AvantioSoapConsumer;
import com.soap.consumer.AvantioPostSoapConsumer;
import com.soap.controller.support.CustomServiceGateway;
import com.soap.utils.GsonUtils;

/**
 * @author peremanent
 *
 */
@RestController
public class SopToResController {
	@Autowired
	private CustomServiceGateway gateway;
	/**
	 * 
	 */
	public SopToResController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping(value = "/{operation}", 
				    method = RequestMethod.GET, 
				    produces = "application/json")
	public String getOperation(@PathVariable String operation,
							   @RequestParam Map<String,String> allRequestParams){
		
		AvantioSoapConsumer client = new AvantioSoapConsumer(AvantioSoapClientProperties.END_POINT,
			       operation,
				   allRequestParams,
				   gateway);

		return GsonUtils.toJson(client.consumeSoap());
	}
	@RequestMapping(value = "/{operation}", 
		    method = RequestMethod.POST, 
		    produces = "application/json")
	public String postOperation(@PathVariable String operation,
								@RequestBody Map<String,String> allRequestParams){
		AvantioPostSoapConsumer client = new AvantioPostSoapConsumer(AvantioSoapClientProperties.END_POINT,
											       operation,
												   allRequestParams,
												   gateway);
		
		return GsonUtils.toJson(client.consumeSoap());

	}

}
