package com.sgtesting.testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		Launch();
		navigate();
		Search();
		
		

	}
	
	public static void Launch()
	{
		try
		{
			System.setProperty("WebDriver.chrome.driver","D:\\ExampleAutomation\\Web-Automation\\library\\Drivers\\chromedriver.exe ");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void navigate()
	{
		try
		{
			oBrowser.navigate().to("https://www.youtube.com/");
			oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void Search()
	{
		try
		{
			oBrowser.findElement(By.id("search")).sendKeys("testing");
			oBrowser.findElement(By.xpath("//*[id='search-icon-legacy']/button")).click();
			//oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
		
	}

}
