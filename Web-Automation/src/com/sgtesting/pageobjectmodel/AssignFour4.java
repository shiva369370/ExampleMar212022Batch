package com.sgtesting.pageobjectmodel;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignFour4 {
public static WebDriver oBrowser = null;
public static ActiTimePage1 oPage = null;
	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
		Login();
		minimizeFlyoutWindow();
		CreateCustomer();
		modifyCustomer();
		deleteCustomer();
		logout();
		closeApplication();
	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser = new ChromeDriver();
			oPage = new ActiTimePage1(oBrowser);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void navigateURL()
	{
		try
		{
			
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(4000);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void Login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(3000);
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyoutWindow()
	{
		try
		{
			
			oPage.getFlyoutWindow().click();
			Thread.sleep(2000);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void CreateCustomer()
	{
		try
		{
		   
			oPage.getClickOnTask().click();
			Thread.sleep(2000);
			oPage.getClickOnAddNew().click();
			Thread.sleep(3000);
			oPage.getClickOnAddCustomer().click();
			Thread.sleep(3000);
			oPage.getClickOnCustomerName().sendKeys("Nokia");
			Thread.sleep(2000);
			oPage.getClickOnCreateCustomer().click();
			Thread.sleep(3000);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyCustomer()
	{
		try
		{
		   oPage.getClickOnModifyCustomer().click();
		   Thread.sleep(3000);
		   oPage.getClickOnDescription().sendKeys("Development of The Software Application For Nokia Customrer");
		   Thread.sleep(4000);
		   oPage.getClickOnCustomer().click();
		   Thread.sleep(2000);
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteCustomer()
	{
		try
		{
		   
			  oPage.getClickOnModifyCustomer().click();
			 Thread.sleep(2000);
			 oPage.getClickOnAction().click();
			 Thread.sleep(2000);
			 oPage.getClickOnDeleteCustomerOrProject().click();
			 Thread.sleep(2000);
			 oPage.getClickOnDeletePermanantly().click();
			 Thread.sleep(2000);
			 
			 
			 
			 
			 
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try
		{
		   
			oPage.getLogout().click();
			Thread.sleep(2000);
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApplication()
	{
		try 
		{
			
			oBrowser.close();
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}


}

