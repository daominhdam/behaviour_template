package com.rhino.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractPage {
	
protected WebDriver driver;
	
	public AbstractPage(WebDriver driver){
		this.driver=driver;
	}
	
	public WebDriver getDriver(){
		return driver;
	}
	
	public HomePage navigateToWebApp(){
		//driver.navigate().to("http://freelancer.geekngamer.com/webapp/");
		driver.get("http://freelancer.geekngamer.com/webapp/");
		return PageFactory.initElements(driver,HomePage.class);
		
	}

}
