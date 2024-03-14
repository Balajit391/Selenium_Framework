package com.pageObject;

import org.openqa.selenium.By;

import com.base.Utility;

public class Parisera {
	
	private final static By login_Pg=By.xpath("//details-modal/following-sibling::a[@href='/account/login']");
	private final static By Login_id = By.xpath("//input[@id='CustomerEmail']");
	private final static By Login_Pswd = By.id("CustomerPassword");
	private final static By SingIn_btn=By.xpath("//button[contains(text(),'Sign in')]");
	
	public Parisera NavigateToSingInPage() {
		//Driver.getDriver().findElement(login_Pg).click();
		Utility.WebElementClick(login_Pg);
		return this; //Achieve method chaining Advantage no need to create Object
	}
	
	
	public Parisera EntertheLoginCredential(String userID, String pswd) {
		
		Utility.SendKeys(Login_id, userID);
		Utility.SendKeys(Login_Pswd, pswd);
		//Driver.getDriver().findElement(Login_id).sendKeys(userID);
		//Driver.getDriver().findElement(Login_Pswd).sendKeys(pswd);
		return this;
	}
	
	public PariseraHomepage ClickOnSignIn() throws InterruptedException {
		Thread.sleep(2000);
		Utility.WebElementClick(SingIn_btn);
		//Driver.getDriver().findElement(SingIn_btn).click();
		return new PariseraHomepage();      //Class chaining Advantage no need to create Object
	}

}
