package com.hooks;

import java.lang.System.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	public static WebDriver driver;
	
	@Before 
	public void setUp() {
		driver = new ChromeDriver();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	
	public static void tearDown() {
		driver.quit();
	}
}
