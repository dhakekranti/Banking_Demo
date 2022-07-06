package com.qa.TestBase;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.PageLayer.DashBoardPage;
import com.qa.PageLayer.ExchangePage;
import com.qa.PageLayer.LoginPage;
import com.qa.PageLayer.Sell_ExchangePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public LoginPage login;
	public DashBoardPage dash;
	public ExchangePage ex;
	public Sell_ExchangePage sell;
	
	
    @BeforeMethod
	public void setup() {
		String br ="Chrome";	
		if(br.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		
		else if(br.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else if(br.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		else {
			System.out.println("Please Enter Valid Browser");
		}
		
		driver.get("https://www.apps.dalalstreet.ai/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		 login = new LoginPage();
		 dash = new DashBoardPage();
		 ex = new ExchangePage();
		 sell = new Sell_ExchangePage();
		 
		 JavascriptExecutor j = ((JavascriptExecutor)driver);
			j.executeScript("scroll(0, 602)");
	}
    
    @AfterMethod
   public void teardown()
    {
       // this is to quit the drive
   	driver.quit();
  }
}
