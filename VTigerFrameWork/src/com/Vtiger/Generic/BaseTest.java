package com.Vtiger.Generic;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Vtiger.Generic.Screenshot;

public class BaseTest implements IConstant{
	public static Properties con;
	public static FileInputStream fis;
	public static WebDriver driver;
	static String b_Name="";

	static {
		try {
			fis = new FileInputStream("./ConfigRead.properties");
			con= new Properties();
			con.load(fis);
			b_Name=con.getProperty("browser");
			if(b_Name.contains("chrome"))
			{
				System.setProperty(CHROME_KEY, CHROME_VALUE);
			}
			else
			{
				System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
			}
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	

@BeforeMethod
public void openApp() throws Exception  
	{
	if(b_Name.contains("chrome"))
		{
		 driver = new ChromeDriver();
		}
		else
		{
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.get(URL);
	}

@AfterMethod
public static  void closeApp(ITestResult result) throws Exception  
{
	int status = result.getStatus();
	String testCase= result.getName();
	if(status ==1)
	{
		Reporter.log(testCase +"is pass",true);
		
	}
	else {
		Reporter.log(testCase +"is fail",true);
		Screenshot.getScreenShot(driver, testCase);
	}
	
	driver.close();
}

}
