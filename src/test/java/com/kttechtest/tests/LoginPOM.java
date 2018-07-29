package com.kttechtest.tests;

import com.kttechtest.utilities.DriverFactory;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.kttechtest.pages.DashboardPage;
import com.kttechtest.pages.LoginPage;

public class LoginPOM {
	
	@Test
	public void loginTestPOM() {
		
		//1. Initialize driver
		WebDriver driver = DriverFactory.open("firefox");
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		
		//2. Enter login information (Login page)
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUserName("tim@testemail.com");
		loginPage.setPassword("trpass");
		loginPage.clickSubmit();
		
		//3. Get Confirmation (Dashboard page)
		DashboardPage dashboardPage = new DashboardPage(driver);
		String conf = dashboardPage.confirmationMessage();
		Assert.assertTrue(conf.contains("Logged in successfully"));
		
		//3.5 Check title
		String title = dashboardPage.title();
		Assert.assertTrue(title.contains("Account"));
		
		//4. Close the driver
		driver.quit();

	}

}
