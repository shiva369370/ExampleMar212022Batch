package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScenario5 {
	public static WebDriver obrowser=null;
	public static void main(String[] args) {
		
		
			LaunchBrowser();
			navigate();
			login();
			minimizewindow();
			createcustomer();
			createproject();
			deleteproject();
			deletecustomer();
			logout();
			closeapp();
		}
	private static void LaunchBrowser()
	{
		try 
		{
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
		obrowser=new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			obrowser.get("http://localhost:81/login.do");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
private static void login()
{
	try 
	{
		obrowser.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(1000);
		obrowser.findElement(By.name("pwd")).sendKeys("manager");
		obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
		Thread.sleep(1000);
	
	} catch (Exception e) {
		e.printStackTrace();
	}
}
private static void minimizewindow()
{
	try 
	{
	obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();	
	} catch (Exception e) {
		e.printStackTrace();
	}
}

private static void createcustomer()
{
	try
	{
	obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a")).click();
	Thread.sleep(1000);
	obrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
	Thread.sleep(1000);
	obrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
	Thread.sleep(1000);
	obrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("cust1");
	Thread.sleep(1000);
	obrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
	Thread.sleep(1000);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	private static void createproject()
	{
		try 
		{
			obrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("proj1");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'projectPopup_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void deleteproject()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.id("projectPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
private static void deletecustomer()
{
	try {
		obrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
		Thread.sleep(2000);
		obrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
		Thread.sleep(2000);
		obrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
		Thread.sleep(2000);
		obrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
	} catch (Exception e) {
		e.printStackTrace();
	}
}

private static void logout()
{
	try {
		obrowser.findElement(By.id("logoutLink")).click();
		} catch (Exception e) {
		e.printStackTrace();
	}
}
	
private static void closeapp()
{
	try {
		obrowser.quit();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	
	
	

	}


