package com.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Web_Table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\S.R\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		ChromeOptions c = new ChromeOptions();
		c.addArguments("incognito");
		WebDriver d = new ChromeDriver(c);
		d.get("http://www.leafground.com/pages/table.html");
		d.manage().window().maximize();
		System.out.println("------------------headings----------------------");
		List<WebElement> header = d.findElements(By.xpath("//table/tbody/tr/th"));
		for (WebElement head : header) {
			String text = head.getText();
			System.out.println(text);
		}
		System.out.println("-------------all data-------------------------------");
		List<WebElement> all_data = d.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement all_text : all_data) {
			String text = all_text.getText();
			System.out.println(text);

		}
		System.out.println("--------------learn locators data---------------");
		List<WebElement> first_row = d.findElements(By.xpath("//table/tbody/tr[2]"));
		for (WebElement fr : first_row) {
			String text = fr.getText();
			System.out.println(text);
		}
		System.out.println("-----------------mentor name------------------");
		List<WebElement> mn = d.findElements(By.xpath("//table/tbody/tr/td[5]"));
		for (WebElement mentor_name : mn) {
			String text = mentor_name.getText();
			System.out.println(text);
		}
		System.out.println("-------------sarath-----------------");
		List<WebElement> sr = d.findElements(By.xpath("//table/tbody/tr[2]/td[5]"));
		for (WebElement individual_name : sr) {
			String text = individual_name.getText();
			System.out.println(text);

		}
		d.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		d.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		d.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		d.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
	}

}
