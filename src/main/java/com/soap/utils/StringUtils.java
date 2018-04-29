package com.soap.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class StringUtils {
	
	public static String loadStringKeyFile(String key){
		String value="";
		try {
			Properties prop=loadProperties("/soap.properties");
			value = loadKeyFromProperties(prop,key);
		} catch (IOException e) {
			
		}
		return value;
	}
	/**
	 * Load the current system properties from the crawler.properties.
	 * @return
	 * @throws IOException
	 */
	public static Properties loadProperties(String filePath) throws IOException{
		Properties prop= new Properties();
		InputStream input = null;
		input = StringUtils.class.getResourceAsStream(filePath);
		// load a properties file
		prop.load(input);
		return prop;
	}
	
	/**
	 * Load the value of a key inside a Properties object.
	 * @param properties
	 * @param key
	 * @return
	 */
	public static String loadKeyFromProperties(Properties properties,String key){
		String value = "";
		if(properties!=null){
			value=properties.getProperty(key, "");
		}
		return value;
	}
	
	public static Boolean toBoolean(String booleanString){
		Boolean retValue=null;
		if(booleanString != null && !"".equals(booleanString)){
			if("true".equalsIgnoreCase(booleanString)){
				retValue = true;
			}else if("false".equalsIgnoreCase(booleanString)){
				retValue = false;
			}
			
		}
		return retValue;
	}

}
