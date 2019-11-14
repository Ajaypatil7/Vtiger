package com.Vtiger.Test;

import org.testng.annotations.Test;

import com.Vtiger.Generic.BaseTest;
import com.Vtiger.Generic.Exel;
import com.Vtiger.Pom.Login;


public class TestLogin extends BaseTest {
@Test
public static void testLogin()
{
	String un = Exel.getData(XL_PATH,SHEET_NAME,1,0);
	String pwd = Exel.getData(XL_PATH,SHEET_NAME,1,1);
	//String title= Exel.getData(XL_PATH,SHEET_NAME,1,2);
	
	Login l = new Login(driver);
	l.inputUN(un);
	l.inputPWD(pwd);
	l.loginClick();
	
	
}
	
}
