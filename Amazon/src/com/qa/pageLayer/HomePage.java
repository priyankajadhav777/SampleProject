package com.qa.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
	}

}
