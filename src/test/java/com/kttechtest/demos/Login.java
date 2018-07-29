package com.kttechtest.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// 1. define the webdriver
		System.setProperty("webdriver.chrome.driver", "/Users/Dell/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// 2. open browser and navigate to http://sdettraining.com/trguitransactions/AccountManagement.aspx
		driver.get("http://localhost/ayp-dev/signup.php");
		
		// Find elements: locate, determine action, pass params
		
		// 3. enter e-mail address
//		driver.findElement(By.name("ctl00$MainContent$txtUserName")).sendKeys("tim@testemail.com");
		driver.findElement(By.name("name")).sendKeys("test");
		
		// 4. enter password
//		driver.findElement(By.name("ctl00$MainContent$txtPassword")).sendKeys("trpass");
		
		// 5. click login
//		driver.findElement(By.name("ctl00$MainContent$btnLogin")).click();

		// 6. get confirmation
		//String message = driver.findElement(By.name("name")).getText();
		String message = driver.findElement(By.xpath("/html/body/section/div/div/h2")).getText();
		System.out.println("Confirmation: " + message);
		
		String pageTitle = driver.getTitle();
		System.out.println("Page title: " + pageTitle);
		
		// 7. close browser
		driver.quit();
	}

}
