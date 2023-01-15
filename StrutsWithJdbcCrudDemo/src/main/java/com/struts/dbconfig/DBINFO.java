package com.struts.dbconfig;

import com.struts.filereader.PropertyFileReader;

public interface DBINFO {
	public static final String DRIVER = PropertyFileReader.getKeyValue("db.driver");
	public static final String URL = PropertyFileReader.getKeyValue("db.url");
	public static final String USERNAME = PropertyFileReader.getKeyValue("db.user");
	public static final String PASSWORD = PropertyFileReader.getKeyValue("db.pass");
}
