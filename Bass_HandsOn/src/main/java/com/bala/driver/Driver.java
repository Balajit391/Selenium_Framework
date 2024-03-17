package com.bala.driver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.constant.FrameWorkConstant;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	public static WebDriver dr;
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
		
	public static  void setDriver() {
		WebDriverManager.chromedriver().setup();
		driver.set(new ChromeDriver());
	}

	public static WebDriver getDriver()
	{
		return driver.get();
	}

	public static void setDriver(WebDriver driverRef)
	{
		driver.set(driverRef);
	}
	
	public static void closeBrowser()
	{
		driver.get().close();
		driver.remove();
	}
	public static void initializeChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balaj\\eclipse-workspace\\Bass_HandsOn\\src\\test\\resources\\DriverList\\chromedriver.exe");
		dr=new ChromeDriver();
		setDriver(dr);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		getDriver().manage().window().maximize();
	}

	/*private static void bRowserFetch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}  */

	public static void driverClose() {
		dr.close();
	}

}
