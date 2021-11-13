package com.sgtest.pamprog;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign7 {

	public static WebDriver oBrowser=null;
	public static ActiTimeMainPage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimize();
		createCustomer();
		createProject();
		createTask();
		deleteTask();
		deleteProject() ;
		deleteCustomer();
		logout();
		closeApplication();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Web-Automation\\library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimeMainPage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:82/login.do");
			oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogIn().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimize()
	{
		try
		{
			oPage.minimizeFlyoutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createCustomer()
	{
		try
		{
			oPage.getClickOnTasks().click();
			Thread.sleep(2000);
			oPage.getAddnewButton().click();
			Thread.sleep(2000);
			oPage.getCeateNewcustomer().click();
			Thread.sleep(2000);
			oPage.getWriteCustomerName().sendKeys("Rahul Dravid");
			oPage.getCreateButton().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createProject()
	{
		try
		{
			oPage.getAddnewButton().click();
			Thread.sleep(2000);
			oPage.getNewProjectButton().click();
			Thread.sleep(2000);
			oPage.getPNameField().sendKeys("ActiTime Project");
			oPage.getCreatePButton().click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createTask()
	{
		try
		{
			oPage.getAddTaskButton().click();
			Thread.sleep(2000);
			oPage.getCreateTask().click();
			Thread.sleep(2000);
			oPage.getTaskNameField().click();
			Thread.sleep(2000);
			oPage.getTaskNameField().sendKeys("Task1");
			oPage.getCreateTaskButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteTask()
	{
		try
		{
			oPage.getClickOnCheckBox().click();
			Thread.sleep(2000);
			oPage.getClickTask().click();
			Thread.sleep(2000);
			oPage.getTaskActionButton().click();
			Thread.sleep(2000);
			oPage.getTaskDelete().click();
			Thread.sleep(2000);
			oPage.getConfirmTaskDelete().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteProject() 
	{
		try 
		{
			oPage.getSettingButton().click();
			Thread.sleep(2000);
			oPage.getPActionButton().click();
			Thread.sleep(2000);
			oPage.getProjectDelete1().click();
			Thread.sleep(2000);
			oPage.getProjectDelete2().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteCustomer()
	{
		try
		{
			oPage.getDelete().click();
			Thread.sleep(2000);
			oPage.getActionsButton().click();
			Thread.sleep(2000);
			oPage.getDelete1().click();
			Thread.sleep(2000);
			oPage.getDelete2().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}