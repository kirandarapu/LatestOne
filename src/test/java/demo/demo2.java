package demo;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class demo2 {

		WebDriver dr;
		  @Test(priority=1)
		  public void url() {
			  System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Chrome driver\\chromedriver.exe");
				 dr = new ChromeDriver();
				dr.get("https://adactinhotelapp.com/");
				  }
		  @Test(priority=2)
		  public void login(){
			  dr.findElement(By.id("username")).sendKeys("Abdulla222");
			  dr.findElement(By.id("password")).sendKeys("Baji123@");
			  dr.findElement(By.id("login")).click();
			  
		  }
		  
		  @Test(priority=3)
		  public void inspect(){
			  dr.getTitle();
			  System.out.println(dr.getTitle());
			  
		
		}
			
		@Test(priority=4)
		public void screenshort() throws Exception {
			
			TakesScreenshot Screenshort = (TakesScreenshot)dr;
			File sourcefile = Screenshort.getScreenshotAs(OutputType.FILE);
			File Destfile = new File("./Screenshorts/img1.jpg");
			//Files.copy(sourcefile, Destfile);
			FileUtils.copyFile(sourcefile, Destfile);
			System.out.println("ScreenShort taken");
		}
		
		
	}
