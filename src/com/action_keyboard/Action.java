package com.action_keyboard;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Action {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\S.R\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions c = new ChromeOptions();
		c.addArguments("incognito");
		WebDriver d = new ChromeDriver(c);
		d.manage().window().maximize();
		d.get("https://www.google.com/");
		
		WebElement mail = d.findElement(By.xpath("//a[text()='Gmail']"));
		Actions a = new Actions(d);
		a.contextClick(mail).build().perform();
		
		Robot q = new Robot();
		
		q.keyPress(KeyEvent.VK_DOWN);
		q.keyRelease(KeyEvent.VK_DOWN);
		
		q.keyPress(KeyEvent.VK_DOWN);
		q.keyRelease(KeyEvent.VK_DOWN);
		
		q.keyPress(KeyEvent.VK_ENTER);
		q.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(7000);
		
		d.quit();

	}

}
