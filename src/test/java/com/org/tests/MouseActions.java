package com.org.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {
	
	
	@Test
	public void MAC() throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement usename=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		WebElement	pswd =driver.findElement(By.cssSelector("input#txtPassword"));
		WebElement login_button=driver.findElement(By.cssSelector("input#btnLogin"));
		Actions action=new Actions(driver);
		action.moveToElement(usename).build().perform();
		usename.sendKeys("Admin");
		pswd.sendKeys("admin123");
		login_button.click();
		System.out.println("Login successful");
		driver.quit();

	}

}
