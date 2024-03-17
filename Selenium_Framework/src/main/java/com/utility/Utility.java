package com.utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.driverManager.Driver;

final public class Utility {
	
	private Utility() {}
	
	public static String getScreenCapture() {
		
		return ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BASE64);
	}
	
	
	public static void takeScreenCapture(String Function) {
		
		String localTime = localDateTime();
	    
	    String Path = System.getProperty("user.dir") + "/Output/" +Function+localTime+".png";
	    System.out.println(Path);
	    File DestFile =new File(Path);
		try {
			File SrcFile=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);  
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public static void ClickFunctionwithJS(By element) {
		JavascriptExecutor jexecutor = (JavascriptExecutor) Driver.getDriver();
		jexecutor.executeScript("arguments[0].click();", Driver.getDriver().findElement(element));
	}
	
	public static WebElement WaitUntilElementPresent(By by) {
		
		WebDriverWait WaitforWebElement =new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
		return WaitforWebElement.until(ExpectedConditions.presenceOfElementLocated(by));
		
	}
	
	public static void WebElementClick(By by) {

		WebElement ele = WaitUntilElementPresent(by);
		ele.click();
	}
	
	public static void SendKeys(By by, String val) {

		WebElement ele = WaitUntilElementPresent(by);
		ele.sendKeys(val);
	}
	
	
	public static String localDateTime() {
		
		LocalDateTime myDateObj = LocalDateTime.now();  
	    System.out.println("Before formatting: " + myDateObj);  
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss");  
	    String formattedDate = myDateObj.format(myFormatObj);  
	    return formattedDate;
	}

}
