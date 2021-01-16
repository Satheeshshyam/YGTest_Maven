package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.Homepage;
import com.pages.LoginPage;

public class LoginPageTest extends TestBase
{
	LoginPage login;
	Homepage home;
	
		// TODO Auto-generated constructor stub
	
	@BeforeMethod
public void start() {
	Int();
	login=new LoginPage();
}
	@Test
	public void pagetitletest()
	{
		String title=login.validatetitle();
		Assert.assertEquals(title,"Facebook – log in or sign up");
	}
	@Test
	public void logintest()
	{
		home = login.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
}
}
