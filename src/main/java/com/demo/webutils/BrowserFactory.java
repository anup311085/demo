package com.demo.webutils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.demo.genrics.GenricLib;

public class BrowserFactory {
	
	public static WebDriver driver;
	
	public static WebDriver launchbrowser(String browserName) {
		
		if(GenricLib.osname.equalsIgnoreCase("Windows 10")) {
			
			
			if(browserName.equalsIgnoreCase("chrome")) {
				
				System.setProperty("webdriver.chrome.driver", GenricLib.dirPath+"/exefile/chromedriver.exe");
				driver=new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", GenricLib.dirPath+"/exefile/geckodriver.exe");
				driver=new FirefoxDriver();
			}
			else if(browserName.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver", GenricLib.dirPath+"/exefile/IEDriverServer.exe");
				driver=new InternetExplorerDriver();
			}
			
		}
		else if(GenricLib.osname.equalsIgnoreCase("MAC")) {
			
		}
		else if(GenricLib.osname.equalsIgnoreCase("Linux")) {
			
		}
		return driver;
	}

}
