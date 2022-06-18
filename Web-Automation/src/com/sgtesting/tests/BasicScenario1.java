package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScenario1 {
     public static   WebDriver oBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		Navigate();
		login();
		minimizewindow();
		createuser();
		deleteuser();
		logout();
		closeAplication();
		

	}
	private static void LaunchBrowser()
	{
		try
		{
		
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
private static void Navigate()
{
	try 
	{
		oBrowser.get("http://localhost:81/login.do");
	} catch (Exception e) {
		e.printStackTrace();
	}
}
private static void login()             
{
	try 
	{
	oBrowser.findElement(By.id("username")).sendKeys("admin");
	Thread.sleep(1000);
	oBrowser.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(1000);
	oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
	Thread.sleep(1000);
	
} catch (Exception e) {
		e.printStackTrace();
	}
}
private static void minimizewindow()
{
	try {
		oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
private static void createuser()
{
	try {
		oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.name("firstName")).sendKeys("user1");
		oBrowser.findElement(By.name("lastName")).sendKeys("user1");
		oBrowser.findElement(By.name("email")).sendKeys("user1@gmail.com");
		oBrowser.findElement(By.name("username")).sendKeys("user3");
		Thread.sleep(1000);
		oBrowser.findElement(By.name("password")).sendKeys("user1");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("user1");
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
		} catch (Exception e) {
		e.printStackTrace();
	}
}
private static void deleteuser()
{
	try {
		oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
		Thread.sleep(1000);
		Alert oalert=oBrowser.switchTo().alert();
		String content=oalert.getText();
        System.out.println(content);
		oalert.accept();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
private static void logout()
{
	try {
		oBrowser.findElement(By.id("logoutLink")).click();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
private static void closeAplication()
{
	try
	{
		oBrowser.quit();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}

