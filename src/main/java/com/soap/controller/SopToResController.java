/**
 * 
 */
package com.soap.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.soap.utils.GsonUtils;

/**
 * @author peremanent
 *
 */
@RestController
public class SopToResController {

	/**
	 * 
	 */
	public SopToResController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping(value = "/{operation}", 
				    method = RequestMethod.GET, 
				    produces = "application/json")
	public String searchByName(@PathVariable String operation){
		return GsonUtils.toJson(operation);
	}

}
