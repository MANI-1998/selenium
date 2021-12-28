package com.rough;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Alert_1 {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\S.R\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions c = new ChromeOptions();
		c.addArguments("incognito");
		WebDriver d = new ChromeDriver(c);
		d.manage().window().maximize();
		//Thread.sleep(1000);
		d.get("http://www.leafground.com/pages/Alert.html");
		
		//d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(1000);

		// simple alert
		WebElement simple_alert = d.findElement(By.xpath("//button[text()='Alert Box']"));
		
		//noalertpresentexception
		//d.switchTo().alert();
		
		simple_alert.click();

		Thread.sleep(1000);

		// getting text of the alert box
		org.openqa.selenium.Alert alert = d.switchTo().alert();

		String text = alert.getText();

		System.out.println("------------------------------------");

		System.out.println("simple alert text :" + text);

		alert.accept();

		Thread.sleep(1000);

		// confirm alert

		d.findElement(By.xpath("//button[text()='Confirm Box']")).click();

		Thread.sleep(1000);

		org.openqa.selenium.Alert alert2 = d.switchTo().alert();

		alert2.dismiss();

		Thread.sleep(1000);

		// prompt alert

		d.findElement(By.xpath("//button[text()='Prompt Box']")).click();

		Thread.sleep(1000);
		
		//unhandled alert exception
		//System.out.println(d.getCurrentUrl());
		
		org.openqa.selenium.Alert alert3 = d.switchTo().alert();

		Thread.sleep(1000);

		alert3.sendKeys("selenium");

		Thread.sleep(1000);

		alert3.accept();

		WebElement findElement = d.findElement(By.id("result1"));

		System.out.println("------------------------------------");

		String text2 = findElement.getText();

		System.out.println("prompt alert :" + text2);
	}

}
