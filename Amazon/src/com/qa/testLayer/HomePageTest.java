package com.qa.testLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pageLayer.HomePage;
public class HomePageTest extends HomePage{
	HomePage home = new HomePage();
	WebDriver driver = new ChromeDriver();
     driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
     driver.sendKeys("leno perries bag");
}
