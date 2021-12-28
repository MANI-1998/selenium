package com.window_handling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling_Amazon {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\S.R\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions c = new ChromeOptions();

		c.addArguments("incognito");

		WebDriver d = new ChromeDriver(c);

		d.manage().window().maximize();

		d.get("https://www.amazon.in/");

		WebElement mobile = d.findElement(By.xpath("//a[text()='Mobiles']"));

		Actions a = new Actions(d);

		a.contextClick(mobile).build().perform();

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement best = d.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));

		a.contextClick(best).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement electronics = d.findElement(By.xpath("//a[text()=' Electronics ']"));

		a.contextClick(electronics).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement cus_care = d.findElement(By.xpath("(//a[text()='Customer Service'])[1]"));

		a.contextClick(cus_care).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement fash = d.findElement(By.xpath("//a[text()='Fashion']"));

		a.contextClick(fash).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		String asd = d.getWindowHandle();
		System.out.println(asd);
		
		Set<String> window = d.getWindowHandles();

		for (String title : window) {

			String title_of_the_pages = d.switchTo().window(title).getTitle();

			System.out.println(title_of_the_pages);
		}

		String w = "Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids";

		for (String title : window) {

			if (d.switchTo().window(title).getTitle().equals(w)) {

				break;

			} else {

				d.close();

			}

		}

	}

}
