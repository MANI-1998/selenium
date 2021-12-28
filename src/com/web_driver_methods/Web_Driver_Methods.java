package com.web_driver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Driver_Methods {
	
	
	public static void main(String[] args) throws Throwable {
		//the below four lines are mandatory for selenium
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\S.R\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//upcasting
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.get("https://www.youtube.com/");//override
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		//up to this
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		
		driver.navigate().to("https://www.youtube.com/");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		driver.close();
		
		driver.quit();
	
	}

}
