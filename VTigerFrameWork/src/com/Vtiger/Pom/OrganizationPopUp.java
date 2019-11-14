package com.Vtiger.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganizationPopUp{
	
	@FindBy(xpath="//tr[@class=\"lvtColData\"]/td/a")
	private WebElement organization;
	
	public void organization()
	{
		organization.click();
	}
}
