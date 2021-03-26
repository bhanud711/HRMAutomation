package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class LoginWithIE {
	@Test
	public void loginWithIE() throws InterruptedException
	{  DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
	capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
	capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
	capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
	System.setProperty("webdriver.chrome.driver", ".//drivers//IEDriverServer.exe");
	WebDriver driver=new InternetExplorerDriver(capabilities);
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	Thread.sleep(10000);
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	}

}
