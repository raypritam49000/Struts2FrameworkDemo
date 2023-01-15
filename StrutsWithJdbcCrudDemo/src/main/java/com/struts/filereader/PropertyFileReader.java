package com.struts.filereader;

import java.io.InputStream;
import java.util.Properties;

public class PropertyFileReader {

	public static String getKeyValue(String key) {
		Properties properties = new Properties();
		try {
			InputStream in = PropertyFileReader.class.getClassLoader().getResourceAsStream("application.properties");
			properties.load(in);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return properties.getProperty(key);
	}

}
