package com.Vtiger.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Vtiger.Generic.BaseTest;
import com.Vtiger.Generic.Exel;
import com.Vtiger.Pom.Login;
import com.Vtiger.Pom.HomePage;

public class TestServiceContractLink extends BaseTest{
@Test
public static void testServiceContractLink() {
	String un = Exel.getData(XL_PATH,SHEET_NAME,1,0);
	String pwd = Exel.getData(XL_PATH,SHEET_NAME,1,1);
	
	Login l = new Login(driver);
	l.inputUN(un);
	l.inputPWD(pwd);
	l.loginClick();
   
/*	HomePage p = new HomePage();
	p.mouseOverAction(driver);*/
	Actions a = new Actions(driver);
	WebElement more= driver.findElement(By.xpath("//td[@class='tabUnSelected']/a[contains(.,'More')]"));
	a.moveToElement(more).build().perform();
	
	driver.findElement(By.xpath("//a[@name=\"Service Contracts\"]")).click();
	String title =driver.getTitle();
    System.out.println(title);
	
	
	
}
	
}
