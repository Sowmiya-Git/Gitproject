package com.omrbranch.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.base.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement txtuserName;
	@FindBy(id="pass")
	private WebElement txtpassword;
	@FindBy(xpath="//button[@Value='login]'")
	private WebElement btnlogin;
	@FindBy(id="errorMessage")
	private WebElement txterrormsg;
	//select getters
	
	public WebElement getTxtuserName() {
		return txtuserName;
	}
	public WebElement getTxtpassword() {
		return txtpassword;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	public WebElement getTxterrormsg() {
		return txterrormsg;
	}
	public void login(String username,String password) {
		insertValue(getTxtuserName(), username);
		insertValue(getTxtpassword(), password);
		clickButton(getBtnlogin());

	}
//2.	
	public void loginEnterKey(String username,String password) throws AWTException {
		insertValue(getTxtuserName(), username);
		insertValue(getTxtpassword(), password);
		enterkey();

	}
	
	//3.
	public String getLoginErrorMsg() {
		String text = getText(getTxterrormsg());
		return text;

	}


}
