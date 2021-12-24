package com.org.tests;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.spi.NumberFormatProvider;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable {


	@Test
	public  void DWT() throws ParseException, InterruptedException {
		WebDriver wd;
		WebDriverManager.chromedriver().setup();
		wd= new ChromeDriver();
		wd.get("http://demo.guru99.com/test/web-table-element.php"); 
		String max;
		double m=0,r=0;
		List  col = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("Total No of columns are : " +col.size());
		List  rows1 = wd.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("Total No of rows are : " + rows1.size());
		for (int i =1;i<rows1.size();i++)
		{    
			max= wd.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[" + (i+1)+ "]/td[4]")).getText();
			NumberFormat f =NumberFormat.getNumberInstance(); 
			Number num = f.parse(max);
			max = num.toString();
			m = Double.parseDouble(max);
			if(m>r)
			{    
				r=m;
			}}
		System.out.println("Maxmium current price is:"+r);

		double m1=0,r1=0;
		List  col1 = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("Total No of columns are : " +col1.size());
		List  rows2 = wd.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("Total No of rows are : " + rows2.size());
		for (int i =1;i<rows2.size();i++)
		{    
			max= wd.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[" + (i+1)+ "]/td[3]")).getText();
			NumberFormat f =NumberFormat.getNumberInstance(); 
			Number num = f.parse(max);
			max = num.toString();
			m1 = Double.parseDouble(max);
			if(m1>r1)
			{    
				r1=m1;
			}
		}
		System.out.println("Maxmium Prev close  is:"+r1);
   
//	      double m2=0,r2=0;	
//		List  col2 = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
//		System.out.println("Total No of columns are : " +col2.size());
//		List  rows3 = wd.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
//		System.out.println("Total No of rows are : " + rows3.size());
//		for (int i =1;i<rows3.size();i++)
//		{    
//			max= wd.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[" + (i+1)+ "]/td[5]")).getText();
//			NumberFormat f =NumberFormat.getNumberInstance();
//			Number num = f.parse(max);
//			max = num.toString();
//			m2 =Double.parseDouble(max);
//			if(m2>r2)
//			{    
//				r2=m2;
//			}
//		}
//
//		System.out.println("Maxmium %change  is:"+ r2);

	}

}

