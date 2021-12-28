package com.actions_mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class flipkart_move_click {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\S.R\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions c = new ChromeOptions();
		c.addArguments("incognito");
		WebDriver d = new ChromeDriver(c);
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		d.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		WebElement fashion = d.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
		Actions a = new Actions(d);
		a.moveToElement(fashion).build().perform();
		WebElement mens = d.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		a.moveToElement(mens).build().perform();
		Thread.sleep(2000);
		WebElement blazer = d.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[7]"));
		a.click(blazer).build().perform();
	}

}
