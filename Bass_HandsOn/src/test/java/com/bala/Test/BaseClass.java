package com.bala.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.bala.driver.Driver;

public class BaseClass {

	protected BaseClass() {

	}


	
	@BeforeClass
	public static void setup() throws InterruptedException {		

		Driver.initializeChromeDriver();
		System.out.println("AT Browser setup");
	}


	@AfterClass
	public static void tearDown() {
		Driver.driverClose();
	}


}
