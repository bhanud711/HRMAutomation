package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HRMProductVersionTest {
	@Test
	public void productVersion()
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement version = driver.findElement(By.xpath("//div[text()[contains(.,'OrangeHRM 4.7')]]"));
	    System.out.println(version.getText());
	    driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
	
	}

}
