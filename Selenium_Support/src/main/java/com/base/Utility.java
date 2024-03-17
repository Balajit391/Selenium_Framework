package com.base;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Utility {
	
	public  WebDriver driver;
	
	public Utility(WebDriver driver){
		this.driver=driver;
	
	}
	
	public  void takeScreenCapture(String Function) {
		
		String localTime = localDateTime();
	    
	    String Path = System.getProperty("user.dir") + "/Output/" +Function+localTime+".png";
	    System.out.println(Path);
	    File DestFile =new File(Path);
		try {
			File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public String localDateTime() {
		
		LocalDateTime myDateObj = LocalDateTime.now();  
	    System.out.println("Before formatting: " + myDateObj);  
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss");  
	    String formattedDate = myDateObj.format(myFormatObj);  
	    return formattedDate;
	}

}
