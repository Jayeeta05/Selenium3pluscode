package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest3 {
  @Test
  public void f()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\a07208trng_b4b.04.24\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.hdfcbank.com/");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//a[@href ='/personal/products']"))).perform();
	act.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/demat']" ))).perform();
	act.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/demat/demat-account']" ))).click().perform();
	
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	Assert.assertTrue(driver.getTitle().startsWith("Demat"));
	
	
	
}

}
