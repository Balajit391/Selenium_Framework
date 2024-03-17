package com.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.Base;
import com.dataio.ConfigurationFactory;
import com.driverManager.Driver;
import com.pageObject.Myntra;
import com.utility.Utility;

import dev.failsafe.internal.util.Assert;



public class TestRunnerMyntra extends Base {
	
	
	
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
	
	//@Test(priority=2)
	public void loginPageValidation() throws Exception {
		Driver.getDriver().get(ConfigurationFactory.getconfig().URL());
		Myntra myPom=new Myntra(Driver.getDriver());
		myPom.clickonSignin();
		myPom.loginWithNumber(ConfigurationFactory.getconfig().User_MobileNumber());
		myPom.submitButton();
		Thread.sleep(2000);
		Utility.takeScreenCapture("OTP_Messagefn");
				
	}
	

	
	@DataProvider (name = "data-provider",parallel = true)
    public Object[][] dpMethod(){
	 return new Object[][] {{"wallet"}, {"Walker"}, {"Chudi"}};
    }
	
	@Test( priority=1, dataProvider = "data-provider")
	public void searchValidation(String val) throws Exception {
		
		Driver.getDriver().get(ConfigurationFactory.getconfig().URL());
		Myntra myPom=new Myntra(Driver.getDriver());
		myPom.searchProduct(val);
		//myPom.searchProduct(ConfigurationFactory.getconfig().ProductDetails());
		myPom.clickToSearch();
		Thread.sleep(2000);
		Utility.takeScreenCapture(ConfigurationFactory.getconfig().ProductDetails());
				
	} 


}
