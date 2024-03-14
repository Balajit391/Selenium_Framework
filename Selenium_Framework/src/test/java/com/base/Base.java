package com.base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.driverManager.Driver;




public class Base {

			
	@BeforeMethod
	public void browserInit() {
		Driver.initDriver();
	}
	
	
	@AfterMethod
	public void TearDown() {
		Driver.quitDriver();
		
	}
	
	
	


}
