package com.qa.PageLayer;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class DashBoardPage extends TestBase {

	
	public DashBoardPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Search Box
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	
	private WebElement search_box;
	
	public void enterCompanyName(String companyname)
	{
		search_box.sendKeys(companyname);
	}
	
	//Company Name Click
	
	@FindBy(linkText="WIPRO")
	
	private WebElement company_name;
	
	public void clickOnCompanyName() {
		Actions act = new Actions(driver);
		act.moveToElement(company_name).click().build().perform();
	}
	
}
