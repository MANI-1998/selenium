package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frames_Task {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\S.R\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	ChromeOptions ch = new ChromeOptions();
	ch.addArguments("incognito");
	WebDriver driver = new ChromeDriver(ch);
	driver.get("http://www.leafground.com/pages/frame.html");
	driver.manage().window().maximize();
	WebElement sf = driver.findElement(By.xpath("//iframe[1]"));
	driver.switchTo().frame(sf);
	driver.findElement(By.id("Click")).click();
	driver.switchTo().defaultContent();
	WebElement of = driver.findElement(By.xpath("//iframe[@src='page.html']"));
	driver.switchTo().frame(of);
	WebElement iframe = driver.findElement(By.xpath("//iframe[@src='nested.html']"));
	driver.switchTo().frame(iframe);
	driver.findElement(By.id("Click1")).click();
	driver.switchTo().parentFrame();
	driver.switchTo().defaultContent();
	WebElement of1 = driver.findElement(By.xpath("//iframe[@src='countframes.html']"));
	driver.switchTo().frame(of1);
	WebElement if1 = driver.findElement(By.xpath("//iframe[@src='count.html']"));
	driver.switchTo().frame(if1);
	boolean contains = driver.getPageSource().contains("Find total number of frames.");
	System.out.println("content inside the box : " + contains);
	
}

}
