package com.qa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class LoginPage extends TestBase {

	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
//	Email
	@FindBy(xpath = "//input[@name='email']")
	private WebElement email_box;
	
	public void enterEmailId(String EmailID) {
		email_box.sendKeys(EmailID);
	}
	
	//Password
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password_box;
	
	public void enterPassword(String pass) {
		password_box.sendKeys(pass);
	}
	
	//Login Button
 
	@FindBy(xpath= "//button[contains(text(),'Log In')]")
	WebElement login_btn;
	
	public void clickOnLoginbtn() {
		login_btn.click();
	}
}
