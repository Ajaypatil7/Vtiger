package com.Vtiger.Pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import com.Vtiger.Generic.BaseTest;
public class HomePage  {
	
	@FindBy(xpath="//td[@class=\"tabUnSelected\"]/a[contains(.,'More')]")
	private WebElement more;



	public void mouseOverAction(WebDriver driver)
	{
		Actions a = new Actions(driver);
		a.moveToElement(more).perform();
	}
	
	
	
	
	
	
}
