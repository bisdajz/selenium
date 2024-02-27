package com.learning.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.sdk.metrics.data.Data;
import junit.framework.Assert;



public class learning1 {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 
	        // Maximize the browser
	        driver.manage().window().maximize();
	        driver.get("https://document-generator.hestawork.com/");
	    
	        WebElement button = driver.findElement(By.xpath("//a[@class=\"flex items-center gap-2 rounded-md border border-primary bg-transparent px-6 py-2 text-base font-bold text-primary \" and @href=\"/auth/signup\"]\r\n"	+ ""));
	        button.click();
	        String ActualTitle = driver.getTitle();
	        String ExpectedTitle = "Docukng";
	        Assert.assertEquals(ExpectedTitle, ActualTitle);
  	        System.out.println("Title Matched");
  	        Thread.sleep(3000);
  	     //  driver.findElement(By.xpath("//a[@class=\"font-bold text-primary\" and @href=\"/auth/login\"]\r\n"
  	     //   		+ ""));
  	        driver.findElement(By.xpath("//button[contains(@class, 'mx-auto') and contains(@class, 'flex') and contains(@class, 'items-center') and contains(@class, 'justify-center') and contains(@class, 'gap-2') and contains(@class, 'text-[14px]') and contains(@class, 'font-bold') and contains(@class, 'text-darkColor')]\r\n"
  	        		+ "")).click();
  	        System.out.println("Returned to Dashboard successfully");
        	}
	     
	      
	        	}


