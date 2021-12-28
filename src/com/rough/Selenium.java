package com.rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\S.R\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	
	WebDriver d = new ChromeDriver();
	
	d.get("https://www.facebook.com/");
	
	d.manage().window().maximize();
	
	String title = d.getTitle();
	
	System.out.println(title);
	
	String currentUrl = d.getCurrentUrl();
	
	System.out.println(currentUrl);
	
	}

}
