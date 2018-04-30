package com.soap.utils;

import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilsTest {

	public DateUtilsTest() {
		// TODO Auto-generated constructor stub
	}
	@Test
	public void toXMLDateOKTest(){
		String date="2018-01-01";
		XMLGregorianCalendar xmlDate = DateUtils.toXMLGregorianCalendar(date);
		Assert.assertTrue("The date is not ok", xmlDate.isValid());
		
	}

	@Test
	public void toXMLDateKOTest(){
		String date="01-01-2018";
		XMLGregorianCalendar xmlDate = DateUtils.toXMLGregorianCalendar(date);
		Assert.assertTrue("The date is not ok", xmlDate.isValid());
		
	}

}
