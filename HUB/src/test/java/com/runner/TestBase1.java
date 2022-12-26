package com.runner;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestBase1 {
	protected ExtentSparkReporter htmlReporter;
	protected ExtentReports extent;
	protected  WebDriver driver=null;
	
    @BeforeClass
	public void Intiate_Report() throws InterruptedException {
   
		htmlReporter = new ExtentSparkReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
 
		
	}
	
	@Test
	 public void invalidcoupons() throws InterruptedException {
		
		        ExtentTest cupon = extent.createTest("Cupon","Invalid");
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajum\\OneDrive\\Desktop\\Chrome_Driver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				
				driver.get("http://rudra.nushop.kaip.in/");
				driver.manage().window().maximize();
				
				Thread.sleep(2000);
	         
				cupon.log(Status.PASS, "Website launched succefully");
			 try {
	           // All products view all
		       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"product_group__view_all__IwjUVbW4\"]"))).click();
		
		       // click on any product
		       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/section/div/div[4]/div[1]/a"))).click();
		     
		        // add to bag               
		       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"wa_reply_and_bag__add_to_bag__rLqwOR06\"]"))).click();
		      
		       cupon.log(Status.PASS, "Product added to bag ");
		       // checkout
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[3]/div[2]/div[2]/a/button"))).click();	
			
			   //whatsup number
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/form/div/div[1]/div/div/input"))).sendKeys("8309333437");
			 	System.out.println("Whatsup Number");
			 
	  	   
			 	//Conform whatsup number					 	
			 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/form/div/div[2]/button"))).click();
			 	System.out.println("Conform whatsup number");
			 	
			 	
			 	//Conform name	
			 
			 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'root\']/div[2]/div[2]/form/div/div/div/div[1]/div/div/input"))).sendKeys("rajurudra");
			 	System.out.println("Basic details_name");
			 	
			 	// Conform pincode number 
			 	
			 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'root\']/div[2]/div[2]/form/div/div/div/div[2]/div/div/input"))).sendKeys("517425");
			 	System.out.println("Pincode");
			 	
			 	// Conform house
			 	driver.findElement(By.xpath("//*[@id=\'root\']/div[2]/div[2]/form/div/div/div/div[3]/div/div/input")).sendKeys("10");
			 	System.out.println("House No");
			 	
			 	// Conform place of delivery
			 	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/form/div/div/div/div[4]/div/div/textarea")).sendKeys("esrtyuiugfdxdchjkjtyuiyfgghkhjgfuiy");
			 	System.out.println("Place of Delivery");
			 	Thread.sleep(1000);
			 	// Save and continue
			 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"save_and_continue\"]"))).click();
			 	System.out.println("Save and Continue");

			 	// cod
			 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cod\"]"))).click();
			 	Thread.sleep(2000);
			 	
			 	//offers                   
			 	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/section/div/div/div[2]/div/p")).click();
               //Thread.sleep(2000);
			 	cupon.log(Status.PASS, "Offer code entered");
			 	//placeholder
			 	driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div/div[2]/div/div/input")).sendKeys("rurhej");
			 	Thread.sleep(2000);
			 	
			 	// Apply 
			 	driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div/div[2]/p")).click();
			 	Thread.sleep(2000);
				
			
               // popup
			 	
			 	String pop= driver.findElement(By.xpath("//*[@class='Toastify']")).getText();
			 	Thread.sleep(2000);
			 	System.out.println(pop);
     
			 	cupon.log(Status.PASS,pop);
			 }
			 catch(Exception e) {
				 
				 cupon.log(Status.FAIL, "Cupon validation due to:"+e);
				
			 }
	
	}

	

	@AfterClass
	public void Flush_reports() {

		extent.flush();
	}
	
	 
	
}


