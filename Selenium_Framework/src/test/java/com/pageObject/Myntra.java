package com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

final public class Myntra {
	
	
WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public Myntra(WebDriver driver){
		this.driver=driver;
	
	}
	
	//Declaring static for better memory mangement ( No need to create object because xpath is similar to all TC)
	private static final By login_Profile = By.xpath("//span[contains(text(),'Profile')]");  
	private static final By loginBt = By.xpath("//a[contains(text(),'login / Signup')]");
	private static final By inputMobileNuField=By.xpath("//input[@autocomplete='new-password']");
	private static final By submitButton=By.xpath("//div[@class='submitBottomOption']");
	private static final By searchToolbar=By.xpath("//input[@class='desktop-searchBar']");
	private static final By searchIcon=By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']");
	
	public void clickonSignin() {
		driver.findElement(login_Profile).click();
		driver.findElement(loginBt).click();
	}
	
	public void loginWithNumber(String number) {
		driver.findElement(inputMobileNuField).sendKeys(number);
	}
	
	public void searchProduct(String product) {
		driver.findElement(searchToolbar).sendKeys(product);
	}
	
	public void clickToSearch() {
		driver.findElement(searchIcon).click();
	}
	
	public void submitButton() {
		driver.findElement(submitButton).click();
	}
	
}

