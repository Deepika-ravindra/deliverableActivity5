package com.org.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClass { 
	
	
	
	@Test
	 public  void RC() throws AWTException, InterruptedException  {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();	
			driver.get("http://www.edureka.co");
			driver.manage().window().maximize();
			driver.findElement(By.cssSelector("a.ga_corporate_click")).click();
			Robot robot = new Robot();
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[contains(text(),'CONNECT WITH US')]")).click();
			robot.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			System.out.println("Name");
			robot.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			System.out.println("company name");
			robot.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			System.out.println("Training need");
			robot.mouseMove(30,100);
			Thread.sleep(2000);
			System.out.println("Email id");
			driver.quit();	

		}

	}
