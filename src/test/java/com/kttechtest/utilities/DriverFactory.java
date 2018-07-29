package com.kttechtest.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {
	//this method will return a webdriver object
	public static WebDriver open(String browserType) {
		if (browserType.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/Dell/geckodriver.exe");
			return new FirefoxDriver();
		}
		else {
			System.setProperty("webdriver.chrome.driver", "/Users/Dell/chromedriver.exe");
			return new ChromeDriver();
		}
	}
}
