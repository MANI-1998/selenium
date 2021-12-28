package com.incognito_take_screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Take_screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\S.R\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		ChromeOptions ch = new ChromeOptions();

		ch.addArguments("incognito");

		WebDriver a = new ChromeDriver(ch);

		a.manage().window().maximize();

		a.get("https://www.facebook.com/");

		a.findElement(By.xpath("//input[@type='text']")).sendKeys("9943039388");
		
		a.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		
		a.findElement(By.xpath("//button[@value='1']")).click();
		
		Thread.sleep(10000);
		
		//the below syntax is used to take screenshot
		TakesScreenshot ts = (TakesScreenshot) a;//narrow type casting
		
		//the below syntax is used to create source folder
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		////the below syntax is used to create folder destination and photo name
		File destination = new File("C:\\Users\\S.R\\eclipse-workspace\\Selenium\\Screenshot\\snap 1.png");//object creation		

		FileUtils.copyFile(source, destination);//add declaration//input output exception
		
	}

}
