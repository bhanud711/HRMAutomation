package com.scripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static String parent,child;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		parent=driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		Iterator<String> i = all.iterator();
		while(i.hasNext())
		{
			child=i.next();
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
			}
		}
		
		System.out.println("Title of the Linked in Page"+driver.getTitle());
		System.out.println("Child Window URL"+driver.getCurrentUrl());
		
	}

}
