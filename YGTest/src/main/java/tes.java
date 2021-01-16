import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class tes 
{
	public static void main(String[] args) {
		WebDriver driver;
		driver=new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver",
		           "C:/Users/Satheesh Shyam/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://book.theautomatedtester.co.uk/chapter1");
		driver.findElement(By.id("radiobutton")).click();
		Select s=new Select(driver.findElement(By.id("selecttype,Keys.ENTER")));
		s.selectByVisibleText("SeleniumRC");
	}
	
}
