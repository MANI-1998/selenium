package com.actions_mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Actions_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\S.R\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		ChromeOptions ch = new ChromeOptions();

		ch.addArguments("incognito");

		WebDriver driver = new ChromeDriver(ch);

		driver.get("http://automationpractice.com/index.php");

		driver.manage().window().maximize();

		WebElement dress = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));

		Actions ac = new Actions(driver);
		
		ac.moveToElement(dress).build().perform();
		
		WebElement summerdress = driver.findElement(By.xpath("(//a[text()='Summer Dresses'])[2]"));

		ac.click(summerdress).build().perform();
		
		

	}

}
