package com.sgtesting.testscripts;



import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advancedselenim2 {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		deleteUser3();
	    deleteUser2();
	    deleteUser1();
	    closeApplication();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Web-Automation\\library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
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
			oBrowser.findElement(By.xpath("//*[@id=\"username\"]\r\n")).sendKeys("admin");
			
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
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
			oBrowser.findElement(By.linkText("Logout")).click();
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
	
	static void createUser()
	{
		try
		{
//createUser1
			
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("demo1");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("User1");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("demoUser1");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcome1234");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Welcome1234");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
			
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
             oBrowser.findElement(By.xpath("//*[@id=\"username\"]\r\n")).sendKeys("demoUser1");
			
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome1234");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div")).click();
			Thread.sleep(2000);
          
//createuser2
			
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("demo2");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("User2");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("demoUser2");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcome1234");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Welcome1234");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
			
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
             oBrowser.findElement(By.xpath("//*[@id=\"username\"]\r\n")).sendKeys("demoUser2");
			
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome1234");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div")).click();
			Thread.sleep(2000);
			
			
//createuser3
			
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("demo3");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("User3");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("demoUser3");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcome1234");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Welcome1234");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
			
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
             oBrowser.findElement(By.xpath("//*[@id=\"username\"]\r\n")).sendKeys("demoUser3");
			
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome1234");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
// modifypassword user3  
			
            oBrowser.findElement(By.xpath("//*[@id=\"username\"]\r\n")).sendKeys("demoUser2");
			
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome1234");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			
			
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id=\"pager\"]/a[1]")).click();
			Thread.sleep(2000);
            
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("12345");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("12345");
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]")).click();
			
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
             oBrowser.findElement(By.xpath("//*[@id=\"username\"]\r\n")).sendKeys("demoUser3");
			
			oBrowser.findElement(By.name("pwd")).sendKeys("12345");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
// modifypassword user2
			
            oBrowser.findElement(By.xpath("//*[@id=\"username\"]\r\n")).sendKeys("demoUser1");
			
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome1234");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
            
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[10]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("12345");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("12345");
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();

			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
            oBrowser.findElement(By.xpath("//*[@id=\"username\"]\r\n")).sendKeys("demoUser2");
			
			oBrowser.findElement(By.name("pwd")).sendKeys("12345");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
// modifypassword user3
			
           oBrowser.findElement(By.xpath("//*[@id=\"username\"]\r\n")).sendKeys("admin");
			
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[9]/td[1]/table/tbody/tr/td/div[2]/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("12345");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("12345");
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();

			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
            oBrowser.findElement(By.xpath("//*[@id=\"username\"]\r\n")).sendKeys("demoUser1");
			
			oBrowser.findElement(By.name("pwd")).sendKeys("12345");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

			 
			
			static void deleteUser3()
			{
						try
					{
//deleteuser3
							
         oBrowser.findElement(By.xpath("//*[@id=\"username\"]\r\n")).sendKeys("demoUser2");
			
			oBrowser.findElement(By.name("pwd")).sendKeys("12345");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id=\"pager\"]/a[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(2000);
			Alert cAlert=oBrowser.switchTo().alert();
			String str=cAlert.getText();
			System.out.println(str);
			cAlert.accept();
			Thread.sleep(3000);
			
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
			
			
			static void deleteUser2()
			{
						try
					{
//deleteusers2		
							
			 oBrowser.findElement(By.xpath("//*[@id=\"username\"]\r\n")).sendKeys("demoUser1");
								
		     oBrowser.findElement(By.name("pwd")).sendKeys("12345");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
								
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
								
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[10]/td[1]/table")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);		
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
							
					}catch(Exception e)
						{
							e.printStackTrace();		
						}
					}
					
			
     static void deleteUser1()
    {
			try
		{
// deleteusers1	
				
         oBrowser.findElement(By.xpath("//*[@id=\"username\"]\r\n")).sendKeys("admin");
					
         oBrowser.findElement(By.name("pwd")).sendKeys("manager");
         oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
         Thread.sleep(4000);
					
         oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
         Thread.sleep(2000);
					
         oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[9]/td[1]/table/tbody/tr/td/div[2]")).click();
         Thread.sleep(2000);
         oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
         Thread.sleep(2000);
         Alert dAlert=oBrowser.switchTo().alert();
         String str=dAlert.getText();
         System.out.println(str);
         dAlert.accept();
         Thread.sleep(3000);		
        oBrowser.findElement(By.linkText("Logout")).click();
        Thread.sleep(2000);
				
		}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		}