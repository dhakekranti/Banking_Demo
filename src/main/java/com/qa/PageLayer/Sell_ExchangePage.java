package com.qa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class Sell_ExchangePage extends TestBase {

	public Sell_ExchangePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Click on Sell button
	
	@FindBy(xpath ="//a[contains(text(),'Sell')]")
	private WebElement sell_btn;
	
	//Provide Quantity
	@FindBy(xpath = "(//input[@class=\"form-control form-control\"])[1]")
	private WebElement quantity_box1;
	
	//Click on final Sell button
	@FindBy(xpath = "//button[contains(text(),'Sell')]")
	private WebElement sell_fbtn;
	
	//check status
	@FindBy(xpath = "//div[text()='Order Created successfully']")
	private WebElement status1;
	
	public void clickOnsell()
	{
		sell_btn.click();
	}
	
	public void enterQuantity1()
	{
		quantity_box1.sendKeys("2");
	}
	
	public void fsellButton()
	{
		sell_fbtn.click();
	}
	
	public String getStatus()
	{
		String st = status1.getText();
		return st;
	}
	
}
