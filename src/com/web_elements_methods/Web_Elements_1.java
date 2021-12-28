package com.web_elements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Elements_1 {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\S.R\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();//upcasting
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	 
	WebElement email = driver.findElement(By.id("email"));
	//email is reference name
	//but here it is a web element
	//so we had use email.
	//we cannot use web driver methods for web elements
	// try with .get it will not come
	//because it is a web driver method
	email.sendKeys("9943039388");
	
	WebElement pass = driver.findElement(By.name("pass"));
	
	pass.sendKeys("1234");
	
	String attribute = pass.getAttribute("password");
	System.out.println(attribute);
	
	pass.sendKeys("1234");
	
	System.out.println("email box");
	
	boolean dis = pass.isDisplayed();
	System.out.println("is displayed : "+dis);//concordination
	
	boolean ena = pass.isEnabled();
	System.out.println("IS ENABLED : "+ ena);
	
	//the below program will come as false only
	//it will come true when there is radio button or check box
	boolean sel = pass.isSelected();
	System.out.println("is selected : "+ sel);
	
	
	System.out.println("password");
	
	boolean disp = email.isDisplayed();
	System.out.println("is displayed : "+disp);
	
	boolean enab = email.isEnabled();
	System.out.println("IS ENABLED : "+ enab);
	
	
	boolean sele = email.isSelected();
	System.out.println("is selected : "+ sele);
	
	//we can also use click method without taking return type
	//not only for click but also for send keys etc
	//return type is not necessary
	driver.findElement(By.name("login")).click();
	
	
	
	}	
}
