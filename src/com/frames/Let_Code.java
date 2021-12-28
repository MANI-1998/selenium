package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Let_Code {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\S.R\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		ChromeOptions c = new ChromeOptions();

		c.addArguments("incognito");

		WebDriver f = new ChromeDriver(c);

		f.manage().window().maximize();

		f.get("https://letcode.in/frame");
		
		f.switchTo().frame("firstFr");
		
		f.findElement(By.name("fname")).sendKeys("selenium");

		f.findElement(By.name("lname")).sendKeys("java");
		
		WebElement inner = f.findElement(By.xpath("//iframe[@src='innerFrame']"));
		
		f.switchTo().frame(inner);
		
		f.findElement(By.name("email")).sendKeys("gmail");
		
		f.switchTo().parentFrame().switchTo().defaultContent();
		
		WebElement default_text = f.findElement(By.xpath("//li[text()='parentFrame()']"));
		
		String text = default_text.getText();
		System.out.println("------------------------------------");
		System.out.println("text in the default content :" + text);
	}

}
