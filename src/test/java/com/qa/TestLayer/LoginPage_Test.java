package com.qa.TestLayer;

import org.testng.annotations.Test;
import com.qa.TestBase.TestBase;

public class LoginPage_Test extends TestBase {

@Test
public void verifyLoginPage()  {
	login.enterEmailId("dhakekranti@gmail.com");
	login.enterPassword("mh195119");
	login.clickOnLoginbtn();
	
	
}

}
