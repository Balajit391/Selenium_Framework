package com.pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Utility;
import com.driverManager.Driver;

public class PariseraHomepage {

	private final static By HomeLinkText = By.linkText("Home");
	private final static By SearchIcon = By.xpath("//summary[@aria-label='Search']/span");
	private final static By SearchTextBox = By.xpath("//input[@id='Search-In-Modal']");
	private final static By SearchIConOnTextBoxs = By.xpath("//button[@class='search__button field__button']");
	private final static By SubscribewindowIframe = By.id("ba-widget-iframe");
	private final static By FrameCloseIcon = By.xpath("//a[@id='close_ba_widget']");

	public PariseraHomepage SelectSearchTextBox() {

		Utility.WebElementClick(HomeLinkText);
		//Driver.getDriver().findElement(HomeLinkText).click();
		Utility.ClickFunctionwithJS(SearchIcon);
		//Driver.getDriver().findElement(SearchIcon).click();
		return this;
	}

	public PariseraHomepage SearchObject(String Value) {

		Utility.SendKeys(SearchTextBox, Value);
		Utility.ClickFunctionwithJS(SearchIConOnTextBoxs);
		//Driver.getDriver().findElement(SearchTextBox).sendKeys(Value);
		//Driver.getDriver().findElement(SearchIConOnTextBoxs).click();	
		return this;
		
	}
	
	public void SubscribeIframehandle() throws InterruptedException {
		//Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(SubscribewindowIframe));
		//Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(SubscribewindowIframe));		
		Utility.ClickFunctionwithJS(FrameCloseIcon);
		Driver.getDriver().switchTo().defaultContent();
		
	}
	
}
