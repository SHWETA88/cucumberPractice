package com.step_defination;



import javax.xml.xpath.XPath;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.hooks.Hooks;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {

	Logger log = LogManager.getLogger(LoginStepDefination.class);
	WebDriver driver = Hooks.getDriver();
	
	@Given("open browser")
	public void open_browser() {
		log.info("open");
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	@When("enter valid {string} and {string}")
	public void enter_valid_username_and_password(String username, String password) {
	    driver.findElement(By.name("username")).sendKeys(username);
	    driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@And("click on login button")
	public void click_on_login_button() {
	    driver.findElement(By.id("submit")).click();
	}
	
	@Then("user should navigate to dashboard page {string}")
	public void user_should_navigate_to_dashboard_page(String expectedText) {
		String actualText = driver.findElement(By.cssSelector("#loop-container > div > article > div.post-header > h1")).getText();
		System.out.println(actualText);
		if(expectedText.equals(actualText)) {
			System.out.println("inside if");
			driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();
		}
	}
	
	@And("broswer should close")
	public void broswer_should_close() {
	    Hooks.tearDown();d
	}


}
