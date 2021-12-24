package com.org.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;




public class JavaSE {
	
	
	
	@Test

	public  void DAD() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		JavascriptExecutor jse=((JavascriptExecutor)driver);
		jse.executeScript("document.getElementById('txtUsername').value='Admin'");
		jse.executeScript("document.getElementById('txtPassword').value='admin123'");
		jse.executeScript("document.getElementById('btnLogin').click();");
		jse.executeScript("alert('enter correct login credentials to continue').click()");
		System.out.println("alert is accepted");
		driver.quit();
		

		Thread.sleep(3000);

	}

}
