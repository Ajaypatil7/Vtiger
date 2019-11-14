package com.Vtiger.Generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Screenshot {
	
	public static void getScreenShot(WebDriver driver, String testCase) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File ssFrom= ts.getScreenshotAs(OutputType.FILE);
	    File ssTo = new File("./Screenshot/"+testCase+".png");
		Files.copy(ssFrom, ssTo);
		
	}
}
