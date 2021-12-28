package com.rough;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rough_1 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\S.R\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("GREENS TECHNOLOGY");
		System.out.println("**********links of the given web element*************");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("(//ul[@role='listbox'])[1]"));
		for (WebElement we : links) {
			System.out.println(we.getText());
		}
	}
}
