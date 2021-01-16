package com.pages;

import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class Homepage extends TestBase 
{
	public Homepage(){
		PageFactory.initElements(driver, this);}

public String verifyHomePageTitle(){
	return driver.getTitle();}
}