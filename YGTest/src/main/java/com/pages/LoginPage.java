package com.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LoginPage extends TestBase {
@FindBy(name="email")
WebElement username;
@FindBy(name="pass")
WebElement password;
@FindBy(xpath="//button[@name='login']")
WebElement loginbtn;
public LoginPage(){
	PageFactory.initElements(driver, this);}
public String validatetitle() 
{
	return driver.getTitle();
}
public Homepage login(String un,String pwd) 
{
	username.sendKeys(un);
	password.sendKeys(pwd);
	loginbtn.click();
	return new Homepage();
}
}
