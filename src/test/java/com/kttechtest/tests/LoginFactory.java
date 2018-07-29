package com.kttechtest.tests;

import com.kttechtest.utilities.DriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import com.kttechtest.pages.DashboardPageFactory;
import com.kttechtest.pages.LoginPageFactory;

public class LoginFactory {
	WebDriver driver = DriverFactory.open("firefox");
	LoginPageFactory loginPage = new LoginPageFactory(driver);
	DashboardPageFactory dashboardPage = new DashboardPageFactory(driver);
	
	String username = "tim@testemail.com";
	String password = "trpass";
	
	@Test
	public void loginTestPageFactory() {
		
//		//1. Initialize driver
		WebDriver driver = DriverFactory.open("firefox");
		driver.get("http://localhost/ayp-dev/signup.php");
		
		//2. Enter login
		//LoginPageFactory loginPage = new LoginPageFactory(driver);
		loginPage.login(username, password);
		
		//3. Get confirmation
		//DashboardPageFactory dashboardPage = new DashboardPageFactory(driver);
		dashboardPage.assertDashboardPage();
	}
	
	@Test
	public void loginTestGlobalFactory() {
		LoginPageFactory loginPage = new LoginPageFactory(driver);
		loginPage.setUserName(username);
		loginPage.setPassword(password);
		loginPage.clickSubmit();
		
		dashboardPage.assertDashboardPage();
	}
	
	@Before
	public void setup() {
		driver.get("http://localhost/ayp-dev");
	}
	
	@After
	public void teardown() {
		driver.quit();
		}
}