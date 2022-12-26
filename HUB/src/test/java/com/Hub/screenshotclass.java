package com.Hub;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.runner.TestBase1;

public class screenshotclass extends TestBase1{


@Test
public void screenshot() {
	 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajum\\OneDrive\\Desktop\\Chrome_Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	ExtentTest cupon = extent.createTest("Cupon","Invalid");
	System.out.println("rudra");
	
	driver.get("http://nushop-dashboard.kaip.in/");
	
	
	
	
	
     }


public static String capture(WebDriver driver) throws IOException {
    
    File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    File Dest = new File("src/../BStackImages/" + System.currentTimeMillis()
    + ".png");
    String errflpath = Dest.getAbsolutePath();
    FileUtils.copyFile(scrFile, Dest);
    return errflpath;
    }
}