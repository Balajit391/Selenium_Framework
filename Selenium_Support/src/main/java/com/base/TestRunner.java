package com.base;

import org.testng.annotations.Test;

import com.dataio.ConfigurationFactory;
import com.driverManager.Driver;
import com.pageObject.Myntra;

import dev.failsafe.internal.util.Assert;



public class TestRunner extends Base {
	
	
	//@Test(priority=1)
	public void HomePageValidation() {
			
		Driver.getDriver().get(ConfigurationFactory.getconfig().URL());
		String actualString = Driver.getDriver().getTitle();
		System.out.println("Actual Title: "+actualString);
		System.out.println("Expected Title: "+ConfigurationFactory.getconfig().Expected_String_Title());
		if(actualString.equalsIgnoreCase(ConfigurationFactory.getconfig().Expected_String_Title())) 
			Assert.isTrue(true, "Title is Matching with Ref");
		else
			Assert.isTrue(false, "Expected string is Not matching");					
	} 
	
	@Test(priority=2)
	public void loginPageValidation() throws Exception {
		Driver.getDriver().get(ConfigurationFactory.getconfig().URL());
		Myntra myPom=new Myntra(Driver.getDriver());
		Utility utility =new Utility(Driver.getDriver());
		myPom.clickonSignin();
		myPom.loginWithNumber(ConfigurationFactory.getconfig().User_MobileNumber());
		myPom.submitButton();
		Thread.sleep(2000);
		utility.takeScreenCapture("OTP_Messagefn");
				
	}
	
	//@Test(priority=1)
	public void searchValidation() throws Exception {
		
		Driver.getDriver().get(ConfigurationFactory.getconfig().URL());
		Myntra myPom=new Myntra(Driver.getDriver());
		Utility utility =new Utility(Driver.getDriver());
		myPom.searchProduct(ConfigurationFactory.getconfig().ProductDetails());
		myPom.clickToSearch();
		Thread.sleep(2000);
		utility.takeScreenCapture(ConfigurationFactory.getconfig().ProductDetails());
				
	} 


}
