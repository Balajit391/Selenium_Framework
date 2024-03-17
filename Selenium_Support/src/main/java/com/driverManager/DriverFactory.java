package com.driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.dataio.ConfigurationFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

final public class DriverFactory {
	private DriverFactory(){}
	
	public static WebDriver getdriver() {
		WebDriver driver = null;
		try {
			if (ConfigurationFactory.getconfig().Driver_Data().contains("DriverManager")) {
				if(ConfigurationFactory.getconfig().Browser_name().equalsIgnoreCase("chrome")) {
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
				}else if(ConfigurationFactory.getconfig().Browser_name().equalsIgnoreCase("edge")) {
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
				}else if(ConfigurationFactory.getconfig().Browser_name().equalsIgnoreCase("firefox")) {
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
				}else {
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
				}
				
				
			} else {
				System.setProperty("webdriver.chrome.driver", (System.getProperty("user.dir")+ConfigurationFactory.getconfig().ChromeDriver_Path()));
				driver = new ChromeDriver();
				System.out.println("Local driver through resource folder");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;

	}

}
