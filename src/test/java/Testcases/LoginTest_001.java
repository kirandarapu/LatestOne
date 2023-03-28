package Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import PageObjects.LoginPage;

@Test
public class LoginTest_001 extends BaseClass {

	public void logintest() throws InterruptedException{
		
		//open URL
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(baseURL);
		//create object for the Loginpage
		LoginPage lp=new LoginPage(driver);
		
		lp.setusermail(useremail);
		//System.out.println("username is enetered");
		logger.info("username");
		
		Thread.sleep(2000);
		
		lp.setPassword(upassword);
		logger.info("password");
		Thread.sleep(2000);
		lp.clickLoginbtn();
		logger.info("login button");
		
	}
	
	
	
	

	
	
}
