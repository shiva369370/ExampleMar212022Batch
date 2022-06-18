package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutDemo1 {
	 public static   WebDriver obrowser=null;
	 public static ActiTimePage opage=null;
	public static void main(String[] args) {
		
		LaunchBrowser();
		Navigate();
		login();
		 minimizefltoutwindow();
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
		obrowser=new ChromeDriver();
		opage=new ActiTimePage(obrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
private static void Navigate()
{
	try 
	{
		obrowser.get("http://localhost:81/login.do");
	} catch (Exception e) {
		e.printStackTrace();
	}
}
private static void login()             
{
	try {

	opage.getusername().sendKeys("admin");
	Thread.sleep(1000);
	opage.getpassword().sendKeys("manager");
	Thread.sleep(2000);
	
	opage.getlogin().click();
	Thread.sleep(1000);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
private static void minimizefltoutwindow()
{
	try {
		opage.getflyoutwindow().click();
		Thread.sleep(2000);
		} catch (Exception e) {
	e.printStackTrace();
	}
}
private static void createuser()
{
	try {
		opage.getuser().click();
		Thread.sleep(2000);
		opage.getadduser().click();
		Thread.sleep(2000);
		opage.getfirstnamer().sendKeys("user1");
		Thread.sleep(2000);
		opage.getlastnamer().sendKeys("user1");
		Thread.sleep(2000);
		opage.getemail().sendKeys("user1@email.com");
		Thread.sleep(2000);
		opage.getusername1().sendKeys("use");
		Thread.sleep(2000);
		opage.getpassword1().sendKeys("sss");
		Thread.sleep(2000);
		opage.getpasswordcopy().sendKeys("sss");
		Thread.sleep(2000);
		opage.getcreateuser().click();
		Thread.sleep(1000);
		} catch (Exception e) {
		e.printStackTrace();
	}
	
}
private static void deleteuser()
{
	try {
		opage.getclickonuser().click();
		Thread.sleep(1000);
		opage.getclickondelete().click();
		Thread.sleep(1000);
		Alert oalert=obrowser.switchTo().alert();
		String content=oalert.getText();
		oalert.accept();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
private static void logout()
{
	try {
		opage.getlogout().click();
		Thread.sleep(2000);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
private static void closeAplication()
{
	try
	{
		obrowser.quit();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
