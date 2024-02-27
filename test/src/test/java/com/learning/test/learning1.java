package com.learning.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learning1 {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 
	        // Maximize the browser
	        driver.manage().window().maximize();
	        driver.get("https://document-generator.hestawork.com/");
	    
	        WebElement button = driver.findElement(By.xpath("//a[@class=\"flex items-center gap-2 rounded-md border border-primary bg-transparent px-6 py-2 text-base font-bold text-primary \" and @href=\"/auth/signup\"]\r\n"	+ ""));
	        button.click();
	        
	        
	        	}

}
