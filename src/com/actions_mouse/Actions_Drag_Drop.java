package com.actions_mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Actions_Drag_Drop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\S.R\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		ChromeOptions ch = new ChromeOptions();

		ch.addArguments("incognito");

		WebDriver driver = new ChromeDriver(ch);

		driver.get("http://www.leafground.com/pages/drop.html");
		
		WebElement from = driver.findElement(By.id("draggable"));

		WebElement to = driver.findElement(By.id("droppable"));
		
		Actions ac =new Actions(driver);
		
		ac.dragAndDrop(from, to).build().perform();
		
		//below line is interview question
		//dragAndDrop(WebElement source,WebElement Target).build().perform():
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
