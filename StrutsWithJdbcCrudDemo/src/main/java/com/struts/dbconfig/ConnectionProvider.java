package com.struts.dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	public static Connection connection = null;

	public static Connection getConnection() {
		try {
			if (connection == null) {
				Class.forName(DBINFO.DRIVER);
				String unicode="useSSL=false&autoReconnect=true&useUnicode=yes&characterEncoding=UTF-8";
				connection = DriverManager.getConnection(DBINFO.URL+"?"+unicode, DBINFO.USERNAME, DBINFO.PASSWORD);
				return connection;
			} else {
				return connection;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}
