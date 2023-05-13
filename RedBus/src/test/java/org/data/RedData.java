package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedData {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/online-booking/tsrtc?gclid=EAIaIQobChMI-abFx5DK_QIViA4rCh01lwpqEAAYASAAEgKrtfD_BwE");
		
		WebElement txtfrom = driver.findElement(By.id("txtSource"));
		txtfrom.sendKeys("tenkasi");
		
		WebElement txtto = driver.findElement(By.id("txtDestination"));
		txtto.sendKeys("chennai");
	}

}
