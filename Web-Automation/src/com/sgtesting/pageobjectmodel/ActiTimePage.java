package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {

	public ActiTimePage(WebDriver obrowser)
	{
		PageFactory.initElements(obrowser, this);
	}

//username text field
private WebElement username;
public WebElement getusername()
{
	return username;
}

//password text field
private WebElement pwd;
public WebElement getpassword()
{
	return pwd;
}

//login button field
@FindBy(xpath="//*[@id=\'loginButton\']/div")																																		
private WebElement oligin;
public WebElement getlogin()
{
	return oligin;
}

//minimigeflyoutwindow field
private WebElement gettingStartedShortcutsPanelId;
public WebElement getflyoutwindow()
{
	return gettingStartedShortcutsPanelId;
}

//getusers field
@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")
private WebElement ouser;
public WebElement getuser()
{
	return ouser;
}
//add users field
@FindBy(xpath="//*[@id=\'createUserDiv\']/div")
private WebElement oadduser;
public WebElement getadduser()
{
	return oadduser;
}
//firstname field
private WebElement firstName;
public WebElement getfirstnamer()
{
	return firstName;
}

//lastname field
private WebElement lastName;
public WebElement getlastnamer()
{
	return lastName;
}

//email field
private WebElement email;
public WebElement getemail()
{
	return email;
}


//usernam field
private WebElement userDataLightBox_usernameField;
public WebElement getusername1()
{
	return userDataLightBox_usernameField;
}


//password field
private WebElement password;
public WebElement getpassword1()
{
	return password;
}
//copypassword field
private WebElement passwordCopy;
public WebElement getpasswordcopy()
{
	return passwordCopy;
}

//create user field

@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div")
private WebElement createuser;
public WebElement getcreateuser()
{
	return createuser;
}
//click on user
@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]")
private WebElement clickuser;
public WebElement getclickonuser()
{
	return clickuser;
}
//click on savechanges

@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
private WebElement savechange;
public WebElement getsavechanger()
{
	return savechange;
}
//click on delete
private WebElement userDataLightBox_deleteBtn;
public WebElement getclickondelete()
{
	return userDataLightBox_deleteBtn;
}

//logout field
private WebElement logoutLink;
public WebElement getlogout()
{
	return logoutLink;
}


//click on task


//click on task
@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a")
private WebElement clicktask;
public WebElement getclicktask()
{
	return clicktask;
}

//click on addnew
@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")
private WebElement clickaddnew;
public WebElement getclickaddnew()
{
	return clickaddnew;
}
//click on customer


		@FindBy(xpath="/html/body/div[14]/div[1]")
		private WebElement clickcustomer;
		public WebElement getclickcustomer()
		{
			return clickcustomer;
		}


//click on customername field
				

		private WebElement customerLightBox_nameField;
		public WebElement getclickcustomername()
		{
			return customerLightBox_nameField;
		}
	//click on create customer
		
		@FindBy(xpath="//*[@id=\'customerLightBox_commitBtn\']/div/span")
		private WebElement clickcreatecust;
		public WebElement getclickcreatecust()
		{
			return clickcreatecust;
		}
		

//clickon customer setting button
		
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
		private WebElement clickcreatecustsettingbutton;
		public WebElement getclickcreatecustsettingbutton()
		{
			return clickcreatecustsettingbutton;
		}
		
		//click on action button
		
		
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")
		private WebElement clickaction;
		public WebElement getclickactionbutton()
		{
			return clickaction;
		}
		
		
		
		//customer delete option
		
		//click on delete
		
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
		private WebElement clickdelete;
		public WebElement getclickdeletebutton()
		{
			return clickdelete;
		}
		
		
		//click on deletepermanentlybutton
		
		private WebElement customerPanel_deleteConfirm_submitTitle;
		public WebElement getclickdeletepermanentlybutton()
		{
			return customerPanel_deleteConfirm_submitTitle;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}


