package com.Vtiger.Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Vtiger.Generic.BaseTest;
import com.Vtiger.Generic.Exel;
import com.Vtiger.Pom.Login;
import com.Vtiger.Pom.ServiceContract;

public class testEditSerCon extends BaseTest {
@Test
	public static void testOrganizationDisplayed() throws InterruptedException {
		
	String un = Exel.getData(XL_PATH,SHEET_NAME,1,0);
	String pwd = Exel.getData(XL_PATH,SHEET_NAME,1,1);
	Login l = new Login(driver);	
	l.inputUN(un);
	l.inputPWD(pwd);
	l.loginClick();
	Actions a = new Actions(driver);
	WebElement more= driver.findElement(By.xpath("//td[@class='tabUnSelected']/a[contains(.,'More')]"));
	a.moveToElement(more).build().perform();
	
	driver.findElement(By.xpath("//a[@name=\"Service Contracts\"]")).click();
	String title =driver.getTitle();
    System.out.println(title);
	driver.findElement(By.xpath("//tr[@id='row_14']/td/a[contains(.,'edit')]")).click();
    
     String subject = Exel.getData(XL_PATH,SHEET_NAME,2,3);
    ServiceContract createS = new ServiceContract(driver);

   // createS.create();
    createS.subject(subject);
   /* createS.relatedTo();
    createS.selectOrganizations();
    createS.plus();*/
    
    //OrganizationPopUp orp = new OrganizationPopUp();
  /*  String parent= driver.getWindowHandle(); 
     Set<String> subtab=  driver.getWindowHandles();
 //    subtab.remove(parent);
     for(String name: subtab)
     {
    	 driver.switchTo().window(name);
     }
    createS.organization();
    driver.switchTo().window(parent);
    */     
    createS.save();
    //driver.switchTo().alert().accept();
    createS.serCon();
   String subject2 = driver.findElement(By.xpath("//tr[@id='row_14']/td/a[@title='Service Contracts']")).getText();
   boolean verify = subject.equals(subject2);
   System.out.println(verify);
   System.out.println(driver.getTitle());
   createS.serCon();
   System.out.println(driver.getTitle());
   System.out.println("_________________________");
}
}










