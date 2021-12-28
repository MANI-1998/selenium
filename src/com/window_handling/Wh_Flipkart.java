package com.window_handling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Wh_Flipkart {
	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\S.R\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions c = new ChromeOptions();

		c.addArguments("incognito");

		WebDriver q = new ChromeDriver(c);

		q.manage().window().maximize();

		q.get("https://www.flipkart.com/");

		q.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		WebElement grocery = q.findElement(By.xpath("//div[text()='Grocery']"));

		Actions a = new Actions(q);

		a.contextClick(grocery).build().perform();

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement offer = q.findElement(By.xpath("//div[text()='Top Offers']"));

		a.contextClick(offer).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement mobile = q.findElement(By.xpath("//div[text()='Mobiles']"));

		a.contextClick(mobile).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement travel = q.findElement(By.xpath("//div[text()='Travel']"));

		a.contextClick(travel).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Set<String> wh = q.getWindowHandles();
		
		for (String titles : wh) {
			
			String tit = q.switchTo().window(titles).getTitle();
			
			System.out.println(tit);
			
		}
		
		String s = "Flipkart Grocery Store - Buy Groceries Online & Get Rs.1 Deals at Flipkart.com";
		// the below line is used to close the exact tab alone
		for (String titles : wh) {
			if (q.switchTo().window(titles).getTitle().equals(s)) {
				
				q.close();
				
			}
			
			
		}

	}

}
