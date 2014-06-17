package com.rhino.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends AbstractPage{
	
	@FindBy(how = How.NAME, using = "name_field")
	WebElement nameField;

	@FindBy(how = How.NAME, using = "address_field")
	WebElement addressField;

	@FindBy(how = How.NAME, using = "postcode_field")
	WebElement postCodeField;

	@FindBy(how = How.NAME, using = "email_field")
	WebElement emailField;

	@FindBy(how = How.ID, using = "submit_message")
	WebElement submitBtn;

	public ContactPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public ContactPage fillFormWithData() {
		nameField.sendKeys("linh.vu");
		addressField.sendKeys("HCMC Vietnam");
		postCodeField.sendKeys("20000");
		emailField.sendKeys("vuthelinh@outlook.com");

		return new ContactPage(driver);
	}

	public ContactResultPage submitForm() {
		submitBtn.click();
		return new ContactResultPage(driver);

	}

}
