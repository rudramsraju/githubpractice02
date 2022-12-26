package com.Hub;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class ordertocheckinjenkins {
		
		static List<String> Order_Num_list=new ArrayList<String>(); 
		
		@Test(priority=1)
		
		public void OTFwithcod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajum\\OneDrive\\Desktop\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("http://rudra.nushop.kaip.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		// view all
		driver.findElement(By.xpath("//*[@id=\"main\"]/section[1]/div/div[1]/div[2]/a/button")).click();
		Thread.sleep(2000);
			
		// click on any product
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[4]/div[1]")).click();
		Thread.sleep(1000);
		
		// add to bag
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div/div[3]/section[3]/div/div/div[2]/div/div[1]/button")).click();
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		// checkout
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[3]/div[2]/div[2]/a/button")).click();
		Thread.sleep(2000);
		
		// whatsup number
	 	driver.findElement(By.xpath("//*[@class='css-r5asnw']")).sendKeys("8309333436");
	 	System.out.println("Whatsup Number");
	 	Thread.sleep(3000);
	 	
	 	// Conform whatsup number
	 	driver.findElement(By.xpath("//*[@id=\'root\']/div[2]/div[2]/form/div/div[2]/button")).click();
	 	System.out.println("Conform whatsup number");
	 	Thread.sleep(3000);
	 	// Conform name
	 	driver.findElement(By.xpath("//*[@id=\'root\']/div[2]/div[2]/form/div/div/div/div[1]/div/div/input")).sendKeys("rajurudra");
	 	System.out.println("Basic details_name");
	 	
	 	
	 	// Conform pincode number
	 	driver.findElement(By.xpath("//*[@id=\'root\']/div[2]/div[2]/form/div/div/div/div[2]/div/div/input")).sendKeys("517425");
	 	System.out.println("Pincode");
	 	
	 	// Conform house
	 	driver.findElement(By.xpath("//*[@id=\'root\']/div[2]/div[2]/form/div/div/div/div[3]/div/div/input")).sendKeys("10");
	 	System.out.println("House No");
	 	
	 	// Conform place of delivery
	 	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/form/div/div/div/div[4]/div/div/textarea")).sendKeys("esrtyuiugfdxdchjkjtyuiyfgghkhjgfuiy");
	 	System.out.println("Place of Delivery");
	 	Thread.sleep(1000);
	 	// Save and continue
	 	driver.findElement(By.xpath("//*[@id=\'root\']/div[2]/div[2]/form/div/div/div/div[5]/div/button")).click();
	 	System.out.println("Save and Continue");
	 	Thread.sleep(2000);
	 	// select cod
	 	driver.findElement(By.xpath("//*[@id=\'cod\']")).click();
	 	Thread.sleep(2000);
	 	// place order
	 	driver.findElement(By.xpath("//*[@id=\"place_order\"]")).click();
	 	System.out.println("Place order");
	 	Thread.sleep(2000);

	 	// entering otp1
	 	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/form/div/div[1]/div/div[1]/input")).sendKeys("0");
 			
	 	// entering otp2
	 	driver.findElement(By.xpath("//*[@id=\'root\']/div[2]/div[2]/form/div/div[1]/div/div[2]/input")).sendKeys("0");
	 	
	 	// entering otp3
	 	driver.findElement(By.xpath("//*[@id=\'root\']/div[2]/div[2]/form/div/div[1]/div/div[3]/input")).sendKeys("0");
	 	
	 	// entering otp4
	 	driver.findElement(By.xpath("//*[@id=\'root\']/div[2]/div[2]/form/div/div[1]/div/div[4]/input")).sendKeys("0");
	 	System.out.println("OTP");	
	 	Thread.sleep(2000);

	 	//confirm OTP
			
	 	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/form/div/div[2]/button")).click();
	 	System.out.println("Order Successfull");
	 	Thread.sleep(2000);
	
	
	 	// view bill
	 	
	 	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div[1]/div/div[2]/a")).click();
	 	Thread.sleep(2000);         
	 
	 	// order id          
	 	
	 	String orderid01 =driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div[1]/div[2]/div[5]/p[2]")).getText();
	 	//System.out.println(orderid01);
	 	Thread.sleep(2000);
	 
	 	Order_Num_list.add(orderid01);
	
	       //System.out.println(Order_Num_list);
}
	
	
	
	
	
	
	
	
	
}
