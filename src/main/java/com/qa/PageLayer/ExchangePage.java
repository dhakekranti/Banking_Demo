package com.qa.PageLayer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class ExchangePage extends TestBase {


	
	public ExchangePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Click on buy button
	
	@FindBy(xpath="//a[contains(text(),'Buy')]")
	private WebElement buy_btn;
	
	//Provide Quantity
	@FindBy(xpath = "(//input[@class='form-control'])[3]")
	private WebElement quantity_box;
	
	//Click On final buy button
	@FindBy(xpath="//button[contains(text(),'Buy')]")
	private WebElement buy_fbtn;
	
	
	
	//check status
	@FindBy(xpath = "//div[text()='Order Created successfully']")
	private WebElement status;
	
	public void clickOnBuy()
	{
		buy_btn.click();
	}
	
	public void enterQuantity() 
	{
		quantity_box.sendKeys("3");
	}
	
	public void clickONBuyBtn() 
	{
		buy_fbtn.click();
	}
	
	public String getStatus()
	{
		String st = status.getText();
		return st;
	}
	
	
	
	
	
}
