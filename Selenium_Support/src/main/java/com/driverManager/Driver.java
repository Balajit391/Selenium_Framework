package com.driverManager;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

final public class Driver {
	
	private Driver() {}
	
	private static ThreadLocal<WebDriver> threadLocalDriver =new ThreadLocal<>();

	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		return threadLocalDriver.get();
	}
	
	public static void setDriver(WebDriver driver) {
		threadLocalDriver.set(driver);
	}
	
	public static void initDriver() {

		if (getDriver() == null) {
			driver = DriverFactory.getdriver();
			setDriver(driver);
			getDriver().manage().window().maximize();
			getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		else
			System.err.println("Error Messge: User try to open the driver even it open already");
	}

	public static void quitDriver() {
		if(getDriver()!= null)
				getDriver().quit();
		else
			System.err.println("Error Messge: User try to close the driver, it closed already");
	}

}
