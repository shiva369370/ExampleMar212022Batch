package com.sgtesting.pageobjectmodel;

		
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Pageobjectmodel3 {

			 public static   WebDriver obrowser=null;
			 public static ActiTimePage opage=null;
			public static void main(String[] args) {
				
				LaunchBrowser();
				Navigate();
				login();
				 minimizefltoutwindow();
				 createcustomer();
				 deletecustomer();
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
		private static void createcustomer()
		{
			try {
				opage.getclicktask().click();
				Thread.sleep(1000);
				opage.getclickaddnew().click();
				Thread.sleep(1000);
				opage.getclickcustomer().click();
				Thread.sleep(1000);
				opage.getclickcustomername().sendKeys("custome1");
				Thread.sleep(2000);
				opage.getclickcreatecust().click();
				
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void deletecustomer()
		{
			try {
				opage.getclickcreatecustsettingbutton().click();
				Thread.sleep(2000);
				opage.getclickactionbutton().click();
				Thread.sleep(1000);
				opage.getclickdeletebutton().click();
				Thread.sleep(1000);
				opage.getclickdeletepermanentlybutton().click();
				Thread.sleep(1000);
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
