package com.window_handling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Window_Handle {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\S.R\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions c = new ChromeOptions();

		c.addArguments("incognito");

		WebDriver d = new ChromeDriver(c);

		d.manage().window().maximize();

		d.get("https://www.amazon.in/");
		
//it will return the unique id of the current tab
		
		String wh = d.getWindowHandle();

		System.out.println(wh);

	}
}
