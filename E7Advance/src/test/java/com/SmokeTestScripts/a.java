package com.SmokeTestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button")).click();
	List<WebElement> all = driver.findElements(By.xpath("//a[@class='oxd-main-menu-item']"));
	for(WebElement e:all) {
		System.out.println(e.getText());
	}
	}

}
