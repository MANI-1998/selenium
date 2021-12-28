 package com.single_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\S.R\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();

		d.get("https://www.facebook.com/");

		d.manage().window().maximize();

		d.findElement(By.xpath("(//a[@role='button'])[2]")).click();

		Thread.sleep(5000);

		d.findElement(By.name("firstname")).sendKeys("mani");

		d.findElement(By.name("lastname")).sendKeys("lastname");

		d.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9943039388");

		d.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("9943qwerty8");

		WebElement date = d.findElement(By.id("day"));

		Select s = new Select(date);

		s.selectByValue("10");

		WebElement mon = d.findElement(By.id("month"));

		Select s1 = new Select(mon);

		s1.selectByIndex(10);

		WebElement yr = d.findElement(By.id("year"));

		Select s2 = new Select(yr);

		s2.selectByVisibleText("2021");

		boolean multi = s.isMultiple();

		System.out.println("is multiple or not :" + multi);
//the below list is not collection list
		List<WebElement> opt = s1.getOptions();

		for (WebElement webElement : opt) {

			String text = webElement.getText();

			System.out.println(text);
		}

		WebElement fso = s2.getFirstSelectedOption();
		
		System.out.println(fso.getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
