package com.sgtesting.tests;

import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImportTasks {
	 public static   WebDriver oBrowser=null;
	
		public static void main(String[] args) {
			LaunchBrowser();
			Navigate();
			login();
			minimizewindow();
			importtask();
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
		 Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		//oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
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
	private static void importtask()
	{
		
		try 
		{
		oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")).click();
		Thread.sleep(1500);
		oBrowser.findElement(By.xpath("/html/body/div[13]/div[2]")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.id("dropzoneClickableArea")).click();
		Thread.sleep(1000);
		String filename="E:\\EXAMPLE\\Sample.csv";
		copyFile(filename);
		Thread.sleep(1000);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id=\'loadTasksFromCSVPopup_commitBtn\']/div/span")).click();
		
		Thread.sleep(1000);
		oBrowser.findElement(By.id("closeLoadTasksFromCSVPopupButton")).click();
		 Thread.sleep(1000);
		
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void copyFile(String filename)
	{
		StringSelection strselection=new StringSelection(filename);
	//	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		Clipboard clipboard=toolkit.getSystemClipboard();
		clipboard.setContents(strselection, null);
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