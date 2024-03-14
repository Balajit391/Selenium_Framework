package com.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.Base;
import com.base.Utility;
import com.driverManager.Driver;
import com.pageObject.Parisera;

public class TestRunnerPerisera extends Base {

	@DataProvider(name = "data-provider", parallel = true)
	public Object[][] dpMethod() {
		return new Object[][] { { "balajithangaraj391@gmail.com", "qwertyuiop" } };
	}

	// Class chaining and Method chaining example

	//@Test(dataProvider = "data-provider")
	public void LoginAndHomePage(String UserID, String Pswd) {

		try {
			Parisera pariseraObj = new Parisera();
			Driver.getDriver().get("https://www.parisera.com");
			pariseraObj.NavigateToSingInPage();
			pariseraObj.EntertheLoginCredential(UserID, Pswd);
			pariseraObj.ClickOnSignIn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

//	@DataProvider(name = "data-provider2", parallel = true)
//	public Object[][] dpMethod2() {
//		return new Object[][] { { "balajithangaraj391@gmail.com", "qwertyuiop", "Wallet" } };
//	}
//	@Test(dataProvider = "data-provider2")
//	public void SearchItems(String UserID, String Pswd,String itm) {
//
//		Parisera pariseraObj = new Parisera();
//		Driver.getDriver().get("https://www.parisera.com");
//		try {
//			pariseraObj.NavigateToSingInPage();
//			pariseraObj.EntertheLoginCredential(UserID, Pswd);
//			Thread.sleep(2000);
//			pariseraObj.ClickOnSignIn();
//		
//		PariseraHomepage PariseraHomepageObj = new PariseraHomepage();
//		Thread.sleep(1000);
//		PariseraHomepageObj.SelectSearchTextBox();				
//		PariseraHomepageObj.SearchObject(itm);
//		PariseraHomepageObj.SubscribeIframehandle();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		Utility.takeScreenCapture(itm);
//
//	}
	
	
	
	//Please compare this with above method for Chaining
	//@DataProvider(name = "data-provider2", parallel = true)
	public Object[][] dpMethod2() {
		return new Object[][] { { "balajithangaraj391@gmail.com", "qwertyuiop", "Wallet" } };
	}
	//@Test(dataProvider = "data-provider2")
	public void SearchItems(String UserID, String Pswd,String itm) {

		Parisera pariseraObj = new Parisera();
		Driver.getDriver().get("https://www.parisera.com");
		try {
			pariseraObj
			.NavigateToSingInPage()
			.EntertheLoginCredential(UserID, Pswd)
			.ClickOnSignIn().SelectSearchTextBox()
			.SearchObject(itm)
			.SubscribeIframehandle();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Utility.takeScreenCapture(itm);

	}
	
	
	
	@DataProvider(name = "data-provider3", parallel = true)
	public Object[][] dpMethod3() {
		return new Object[][] { { "balajithangaraj391@gmail.com", "qwertyuiop", "Mobile" } };
	}
	//@Test(dataProvider = "data-provider3")
	public void SearchItems3(String UserID, String Pswd,String itm) {

		Parisera pariseraObj = new Parisera();
		Driver.getDriver().get("https://www.parisera.com");
		try {
			pariseraObj
			.NavigateToSingInPage()
			.EntertheLoginCredential(UserID, Pswd)
			.ClickOnSignIn().SelectSearchTextBox()
			.SearchObject(itm)
			.SubscribeIframehandle();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Utility.takeScreenCapture(itm);

	}

	@DataProvider(name = "data-provider4", parallel = true)
	public Object[][] dpMethod4() {
		return new Object[][] { { "balajithangaraj391@gmail.com", "qwertyuiop", "Scale" },
			{ "balajithangaraj391@gmail.com", "qwertyuiop", "Pen" },
			{ "balajithangaraj391@gmail.com", "qwertyuiop", "Rubber" }};
	}
	@Test(dataProvider = "data-provider4", invocationCount =4)
	public void SearchItems4(String UserID, String Pswd,String itm) {

		Parisera pariseraObj = new Parisera();
		Driver.getDriver().get("https://www.parisera.com");
		try {
			pariseraObj
			.NavigateToSingInPage()
			.EntertheLoginCredential(UserID, Pswd)
			.ClickOnSignIn().SelectSearchTextBox()
			.SearchObject(itm)
			.SubscribeIframehandle();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Utility.takeScreenCapture(itm);

	}

}
