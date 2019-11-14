package com.Vtiger.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ServiceContract {

	@FindBy(xpath="//img[@title='Create Service Contract...']")
	private WebElement create;
	@FindBy(id="subject")
	private WebElement subject;
	@FindBy(xpath ="//input[@value=\"  Save  \"]")
	private WebElement save;
	@FindBy(xpath="//a[@class=\"hdrLink\"]")
	private WebElement serCon;
	@FindBy(id="sc_related_to_type")
	private WebElement relatedTo;
	@FindBy(xpath= "//select[@name=\"sc_related_to_type\"]/option[@value=\"Accounts\"]")
	private WebElement selectOrganizations;
	@FindBy(xpath="//img[@title=\"Select\"]")
	private WebElement plus;
	
	
	
	public ServiceContract(WebDriver driver ) {
	PageFactory.initElements(driver, this);
	}
	public void create()
	{
		create.click();
	}

	public void subject(String text)
	{
		subject.sendKeys(text);	
	}
	
	public void save()
	{
		save.click();
	}
	public void serCon() 
	{
	serCon.click();
	}
	public void relatedTo()
	{
		relatedTo.click();	
	}
	public void selectOrganizations()
	{
		selectOrganizations.click();	
	}
	public void plus()
	{
		plus.click();
	}
	
	@FindBy(id="1")
	private WebElement organization;
	
	public void organization()
	{
		organization.click();
	}
	@FindBy(xpath="//tr[@id=\"row_14\"]/td/a[@title=\"Service Contracts\"]") 
	private WebElement contract;
	public void contract()
	{
		contract.click();
	}
}
