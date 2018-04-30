package com.soap.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DateUtils {
	private static final Logger logger = LoggerFactory.getLogger(DateUtils.class);
	private static final String MAIN_DATE_PATTERN = "yyyy-MM-dd";
 
	public DateUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static final Date toDate(String date, String pattern){
		logger.info("toDate "+date+". Pattern "+pattern);
		Date retDate = null;
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		try {
			if(date != null){
				retDate = sdf.parse(date);
			}
			
		} catch (ParseException e) {
			logger.error("Error parsing a date "+date+", with this pattern "+pattern,e);
		}
		return retDate;
	}
	
	public static XMLGregorianCalendar toXMLGregorianCalendar(String date) {
		XMLGregorianCalendar xmlGregorian=null;
		Date dateValue=toDate(date,MAIN_DATE_PATTERN);
		if(dateValue!=null){
			GregorianCalendar c = new GregorianCalendar();
			c.setTime(dateValue);
			try {
				xmlGregorian = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			} catch (DatatypeConfigurationException e) {
				logger.error("Error toXMLGregorianCalendar a date "+date,e);
			}
		}
		return xmlGregorian;
	}

}
