package com.frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\S.R\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		ChromeOptions ch = new ChromeOptions();

		ch.addArguments("incognito");

		WebDriver driver = new ChromeDriver(ch);

		driver.get("http://demo.automationtesting.in/Frames.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		driver.switchTo().frame("singleframe");

		WebElement singleframe = driver.findElement(By.xpath("(//input[@type='text'])[1]"));

		singleframe.sendKeys("single frame");

		// it will exit from the frame

		driver.switchTo().defaultContent();

		WebElement multiframe = driver.findElement(By.xpath("(//a[contains(text(),'Iframe')])[2]"));

		multiframe.click();

		WebElement outerframe = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));

		driver.switchTo().frame(outerframe);

		WebElement innerframe = driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])[1]"));

		driver.switchTo().frame(innerframe);

		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("multiple frames");
        //the below method is used to come to outer frame
		driver.switchTo().parentFrame();

		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Video']")).click();

	}

}
