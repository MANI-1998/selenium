package com.xpath_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\S.R\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver  d  = new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		
		d.manage().window().maximize();
		
		System.out.println("   ");
		
		////using  text syntax i had printed in the console
		WebElement FE1 = d.findElement(By.xpath("//a[text()='Create a Page']"));
		
		String text2 = FE1.getText();
		
		System.out.println(text2);
		
		//using contains text syntax i had printed in the console
		WebElement FE = d.findElement(By.xpath("//h2[contains(text(),'helps')]"));
		
		System.out.println("     ");
		
		String text = FE.getText();
		
		System.out.println(text);
		
		//using attribute name attribute value i had passed senkeys in emailbox
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("9943039388");
		
		Thread.sleep(2000);
		
		//using contains attribute name attribute value 
		//i had removed the passed senkeys in emailbox
		d.findElement(By.xpath("//input[contains(@placeholder,'Email address or phone number')]")).clear();
		
		//Thread.sleep(2000);
		
		//syntax for index (//tag name[])[]
		
		//d.quit();
		
		
		
}

}
