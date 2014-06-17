package com.rhino.auto.stepsDef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.rhino.pages.ContactPage;
import com.rhino.pages.ContactResultPage;
import com.rhino.pages.HomePage;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactMessgeTest {
	
	WebDriver driver = new FirefoxDriver();
	HomePage onHomepage = new HomePage(driver);;
	ContactPage onContactPage = new ContactPage(driver);
	ContactResultPage onContactResultPage = new ContactResultPage(driver);

	@Given("^I am on home page$")
	public void i_am_on_home_page() throws Throwable {
	  //driver.get("http://freelancer.geekngamer.com/webapp/index.html");
		onHomepage.navigateToWebApp();
	}

	@When("^I navigate to Contact page$")
	public void i_navigate_to_Contact_page() throws Throwable {
	  // driver.findElement(By.id("contact_link")).click();
		 onContactPage = onHomepage.clickOnContact();
	}

	@When("^I fill form with data$")
	public void i_fill_form_with_data() throws Throwable {
//		  driver.findElement(By.name("name_field")).sendKeys("linh.vu");
//		  driver.findElement(By.name("address_field")).sendKeys("HCMC Vietnam");
//		  driver.findElement(By.name("postcode_field")).sendKeys("20000");
//		  driver.findElement(By.name("email_field")).sendKeys("vuthelinh@gmail.com");
		  onContactPage.fillFormWithData();
	}

	@When("^I submit my information$")
	public void i_submit_my_information() throws Throwable {
		//driver.findElement(By.id("submit_message")).click();
		onContactResultPage =  onContactPage.submitForm();
	}

	@Then("^I get confirmation message$")
	public void i_get_confirmation_message() throws Throwable {
//		String confirmMsg = driver.findElement(By.tagName("p")).getText();
//		Assert.assertTrue(confirmMsg.contains("Many thanks for your message. We will contact you about your query as soon as possible"));
		Assert.assertTrue(onContactResultPage.getConfirmationMessage().contains("Many thanks for your message. We will contact you about your query as soon as possible"));
	}
	
	@After
	public void Shutdown(){
		driver.quit();
	}
}
