package com.soap.consumer.factory;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.soap.consumer.operation.SoapOperation;


public class SoapOperationFactoryTest {

	@Test
	public void factoryGeneratorTest(){
		SoapOperation addCommentOperation = OperationFactory.newInstanceForPost("AddComment");
		
		Assert.assertNotNull("SoapOperation must be not null", addCommentOperation);
		Assert.assertTrue("Operations is not setted",addCommentOperation.getOperation().equals("AddComment"));

	}

}
