package org.main.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static  WebDriver Chromelaunch() {
		WebDriverManager.chromedriver().setup();
		return driver=new ChromeDriver();
		
		
		
		

	}
	
}
