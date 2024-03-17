package com.bala.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bala.driver.Driver;
public final class LoginGoogle extends BaseClass {

	private LoginGoogle() {
		// I dont want to extend (Inherit my class)
	}
	
	
	@Test
	public static void pageLaunch() throws InterruptedException{
		Driver.getDriver().get("https://www.google.co.in");
		System.out.println(Driver.getDriver().getTitle());
		WebElement obj1 =Driver.getDriver().findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		obj1.sendKeys("BalajiBass");
		obj1.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);

	}
	
	

	
}
