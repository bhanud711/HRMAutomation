package com.scripts;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class CrossBrowserTest {
@Test
	public void nonFunction()
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		
	}
}
