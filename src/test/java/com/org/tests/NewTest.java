package com.org.tests;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	@Test
	public void f() throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input#btnLogin")).click();
		WebElement pim=driver.findElement(By.cssSelector("a#menu_pim_viewPimModule"));
		WebElement conf=driver.findElement(By.cssSelector("a#menu_pim_Configuration"));
		Actions action=new Actions(driver);
		action.moveToElement(pim).moveToElement(conf).build().perform();
		driver.findElement(By.cssSelector("a#menu_admin_pimCsvImport")).click();
		Thread.sleep(5000);
		WebElement uploadFile = driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='content']/div[@id='pimCsvImport']/div[2]/form[1]/fieldset[1]/ol[1]/li[1]/label[1]"));
		uploadFile.click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\FileUploadScriptt.exe");
		Thread.sleep(4000);
		WebElement uploadFile2 = driver.findElement(By.xpath("//input[@id='btnSave']"));
		Thread.sleep(2000);
		System.out.println("Process got completed");
		uploadFile2.click();


		driver.close();


}
}
