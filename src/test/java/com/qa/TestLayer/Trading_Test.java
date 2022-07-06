package com.qa.TestLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.TestBase.TestBase;

public class Trading_Test extends TestBase {

 @Test
 
 public void verifyBuyShare() throws InterruptedException 
 {
	 login.enterEmailId("dhakekranti@gmail.com");
	 login.enterPassword("mh195119");
	 login.clickOnLoginbtn();
	
	 //..........................................................
	 //Thread.sleep(2000);
	 Thread.sleep(2000);
		dash.enterCompanyName("Wipro");
		Thread.sleep(2000);
		dash.clickOnCompanyName();
		Thread.sleep(3000);
 //...........................................................
//		ex.clickOnBuy();
//		ex.enterQuantity();
//	    Thread.sleep(2000);
//	    JavascriptExecutor j = ((JavascriptExecutor)driver);
//		j.executeScript("scroll(982, 602)");
//	    ex.clickONBuyBtn(); 
//	    Thread.sleep(2000);
//		Assert.assertEquals("Order Created successfully", ex.getStatus());
		//.........................................................
		sell.clickOnsell();
		sell.enterQuantity1();
		Thread.sleep(2000);
		sell.fsellButton();
		Thread.sleep(2000);
		Assert.assertEquals("Order Created successfully", ex.getStatus());
		
 }
}

