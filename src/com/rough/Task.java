package com.rough;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Task {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\S.R\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions c = new ChromeOptions();
		c.addArguments("incognito");
		WebDriver d = new ChromeDriver(c);
		d.get("https://www.instagram.com/accounts/login/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		d.findElement(By.xpath("//span[@class='_7UhW9   xLCgt       qyrsm      gtFbE      se6yk        ']")).click();
		Thread.sleep(3000);
		d.findElement(By.name("emailOrPhone")).sendKeys("919943039388");
		Thread.sleep(1000);
		d.findElement(By.name("fullName")).sendKeys("MANIKANDAN");
		Thread.sleep(1000);
		d.findElement(By.name("username")).sendKeys("MANI_1998_07");
		Thread.sleep(1000);
		d.findElement(By.name("password")).sendKeys("QWERTY12345");
		Thread.sleep(3000);
		d.findElement(By.xpath("(//button[@class='sqdOP  L3NKy   y3zKF     '])[2]")).click();
		Thread.sleep(2000);
		TakesScreenshot s = (TakesScreenshot) d;
		File source = s.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\S.R\\eclipse-workspace\\Selenium\\Screenshots\\insta_page_1.png");
		FileUtils.copyFile(source, des);
		WebElement month = d.findElement(By.xpath("(//select[@class='h144Z  '])[1]"));
		Select s1 = new Select(month);
		s1.selectByIndex(6);
		Thread.sleep(1000);
		System.out.println("---------------------");
		System.out.println("get options");
		List<WebElement> opt = s1.getOptions();
		for (WebElement webElement : opt) {
			String text = webElement.getText();
			System.out.println(text);
		}
		Thread.sleep(2000);
		WebElement date = d.findElement(By.xpath("(//select[@class='h144Z  '])[2]"));
		Select s2 = new Select(date);
		s2.selectByValue("25");
		Thread.sleep(1000);
		System.out.println("---------------------");
		System.out.println("first selected option");
		WebElement fso = s2.getFirstSelectedOption();
		System.out.println(fso.getText());
		Thread.sleep(1000);
		WebElement year = d.findElement(By.xpath("(//select[@class='h144Z  '])[3]"));
		Select s3 = new Select(year);
		s3.selectByValue("1998");
		d.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		Thread.sleep(5000);
		TakesScreenshot ss = (TakesScreenshot) d;
		File source1 = ss.getScreenshotAs(OutputType.FILE);
		File des1 = new File("C:\\Users\\S.R\\eclipse-workspace\\Selenium\\Screenshots\\insta_page_2.png");
		FileUtils.copyFile(source1, des1);
		

	}

}
