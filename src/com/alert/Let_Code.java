package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Let_Code {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\S.R\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions c = new ChromeOptions();
		c.addArguments("incognito");
		WebDriver d = new ChromeDriver(c);
		d.manage().window().maximize();
		d.get("https://letcode.in/alert");
		d.findElement(By.id("accept")).click();
		Alert simple_alert = d.switchTo().alert();
		simple_alert.accept();
		WebElement simple_text = d.findElement(By.xpath("//label[text()='Accept the Alert']"));
		String text1 = simple_text.getText();
		System.out.println("----------------------------------");
		System.out.println(text1);
		d.findElement(By.id("confirm")).click();
		Alert confirrm_alert = d.switchTo().alert();
		confirrm_alert.dismiss();
		WebElement confirm_text = d.findElement(By.xpath("//label[contains(text(),'Dismiss')]"));
		String text2 = confirm_text.getText();
		System.out.println("-----------------------------");
		System.out.println(text2);
		d.findElement(By.id("prompt")).click();
		Alert prompt_alert = d.switchTo().alert();
		prompt_alert.sendKeys("kaushik");
		prompt_alert.accept();
		WebElement prompt_text = d.findElement(By.xpath("//label[contains(text(),'name')]"));
		String text3 = prompt_text.getText();
		System.out.println("-------------------------");
		System.out.println(text3);
		d.findElement(By.id("modern")).click();
		WebElement sweat_inner_text = d.findElement(By.xpath("//p[contains(text(),'Some')]"));
		String text4 = sweat_inner_text.getText();
		System.out.println("-------------------------");
		System.out.println(text4);
		d.findElement(By.xpath("//button[@aria-label='close']")).click();
		WebElement sweat_outer_text = d.findElement(By.xpath("//label[contains(text(),'Sweet')]"));
		String text5 = sweat_outer_text.getText();
		System.out.println("-----------------------------");
		System.out.println(text5);
		
	}

}
