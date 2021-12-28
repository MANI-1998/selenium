package com.javaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll_Amazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\S.R\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions c = new ChromeOptions();
		c.addArguments("incognito");
		WebDriver d = new ChromeDriver(c);
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		WebElement amazon_logo = d.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		JavascriptExecutor j = (JavascriptExecutor)d;
		j.executeScript("arguments[0].scrollIntoView();",amazon_logo);
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,-2100);");
		Thread.sleep(3000);
		j.executeScript("window.scrollBy(0,1000);");
	}

}
