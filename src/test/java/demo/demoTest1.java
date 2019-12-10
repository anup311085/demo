package demo;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demo.genrics.ExcelUtility;
import com.demo.genrics.GenricLib;
import com.demo.genrics.SeleniumLib;
import com.demo.webutils.BrowserFactory;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;

public class demoTest1 {

	private static final TimeUnit SECONDS = null;

	Logger logger = Logger.getLogger(demoTest1.class.getName());

	WebDriver driver;

	@BeforeMethod
	public void start_log() {
		PropertyConfigurator.configure("./log4j.properties");
		driver = BrowserFactory.launchbrowser("chrome");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://classic.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys(Keys.CONTROL+"t");
		logger.info("freecrm open page opened");
	}

	@DataProvider
	public Object[][] getdata() {
		Object[][] data = new ExcelUtility().getTestData("C:\\Users\\anup.verma\\Desktop\\ReadExcel.xlsx", "Sheet2");
		return data;
	}

	@Test(dataProvider = "getdata")
	@Severity(SeverityLevel.BLOCKER)
	public void printData(String username, String password) throws InterruptedException {
		logger.info("----------Printing the ExcelSheet data-------");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		Thread.sleep(6000);
		Select s=new Select(driver.findElement(By.xpath("//input[@placeholder='Username']")));
		s.deselectAll();
		Actions a=new Actions(driver);
		WebDriverEventListener j=null;;
		j.afterAlertDismiss(driver);
		EventFiringWebDriver l=null;
		
		
		
	}



}