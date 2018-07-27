package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AjaxClass {
@Test
public void test()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\a07208trng_b4b.04.24\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	WebElement from = driver.findElement(By.xpath())
	WebElement to = driver.findElement(By.id("ctl00_ContentPlaceholder1_priceChecker"));
	
	Actions act1 = new Actions(driver);
	act1.dragAndDrop(from,to).perform();
	
	WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("ctl00_ContentPlaceholder1_priceChecker")));
	String price = driver.findElement(By.id("The price of 'Weekend Package' is : $3999")).getText();
	System.out.println(price);
	
	
	
	
}

}
