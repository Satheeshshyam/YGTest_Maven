package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase 
{
public WebDriver driver;
public Properties prop;
public void Testbase() 
{
	try
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("E:\\Int_2020\\YGTest\\src\\main\\java\\com\\config\\properties");
		prop.load(fis);
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
}
public void Int() 
{
	String browsername=prop.getProperty("browser");
	if(browsername.equals("chrome")) 
	{
		System.setProperty("webdriver.chrome.driver", "E:/TestNG/Selenium_Framework/Browser_Servers/Chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browsername.equals("FF")){
		System.setProperty("webdriver.chrome.driver","E:/TestNG/Selenium_Framework/geckodriver");	
		driver = new FirefoxDriver(); 
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
}

}


