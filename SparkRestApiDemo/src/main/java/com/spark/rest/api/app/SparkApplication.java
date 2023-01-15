package com.spark.rest.api.app;

import static spark.Spark.port;

import com.spark.rest.api.controllers.EmployeeController;

public class SparkApplication {

	public static void main(String[] args) {
		port(9999);
		EmployeeController.init();
		
	}
}