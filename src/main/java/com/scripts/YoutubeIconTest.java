package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class YoutubeIconTest {
	@Test
	public void youtubeIconClick()
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement version = driver.findElement(By.xpath("//div[text()[contains(.,'OrangeHRM 4.7')]]"));
	    System.out.println(version.getText());
	    driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
	
	}
}
