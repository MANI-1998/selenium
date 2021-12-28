package com.javaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll_By_Flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\S.R\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions c = new ChromeOptions();
		c.addArguments("incognito");
		WebDriver d = new ChromeDriver(c);
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement about = d.findElement(By.xpath("(//div[@class='_3-dnWo'])[1]"));
		JavascriptExecutor j = (JavascriptExecutor) d;
		j.executeScript("arguments[0].scrollIntoView();", about);
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,-3000);");
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,-2000);");
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,3000);");
	}

}
