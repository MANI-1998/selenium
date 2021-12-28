package com.multiple_dropdown;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\S.R\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		ChromeOptions ch = new ChromeOptions();

		ch.addArguments("incognito");

		WebDriver a = new ChromeDriver(ch);

		a.get("http://www.leafground.com/pages/Dropdown.html");

		a.manage().window().maximize();

		WebElement multidrop = a.findElement(By.xpath("(//select)[6]"));

		Select s = new Select(multidrop);

		s.selectByIndex(2);

		s.selectByValue("3");

		s.selectByVisibleText("Loadrunner");

		Thread.sleep(2000);

		s.deselectByValue("3");

		Thread.sleep(2000);

		s.selectByValue("1");

		s.selectByValue("3");
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		for (WebElement webElement : allSelectedOptions) {
			
			System.out.println(webElement.getText());
			
		}

		

		System.out.println("-----------------------");

		List<WebElement> opt = s.getOptions();

		for (WebElement webElement : opt) {
			
			System.out.println(webElement.getText());
			
		}
		WebElement fso = s.getFirstSelectedOption();
		
		System.out.println(fso.getText());
		
		s.deselectAll();
		
		boolean multiple = s.isMultiple();
		
		System.out.println("is multiple or not : "+multiple);
	}

}
