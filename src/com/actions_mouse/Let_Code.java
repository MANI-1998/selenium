package com.actions_mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Let_Code {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\S.R\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions c = new ChromeOptions();
		c.addArguments("incognito");
		WebDriver d = new ChromeDriver(c);
		d.manage().window().maximize();
		d.get("https://letcode.in/dropable");
		WebElement source = d.findElement(By.id("draggable"));
		WebElement target = d.findElement(By.id("droppable"));
		Actions a = new Actions(d);
		a.dragAndDrop(source, target).build().perform();
	}

}
