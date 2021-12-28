package com.rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Revision {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\S.R\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions c = new ChromeOptions();

		c.addArguments("incognito");

		WebDriver d = new ChromeDriver(c);

		d.manage().window().maximize();

		d.get("https://www.amazon.in/");
		
		d.findElement(By.xpath("//h2[text()='Shop by Category']//following::img[@alt='Electronics']")).click();
		
		Thread.sleep(3000);
		
		d.findElement(By.xpath("//img[@alt='Headphones']//following::img[@alt='Fitness trackers & smartwatches']")).click();
	}

}
