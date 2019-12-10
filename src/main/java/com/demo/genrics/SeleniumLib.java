package com.demo.genrics;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class SeleniumLib {

	public static void takescreenshot(WebDriver driver) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		TakesScreenshot tss = (TakesScreenshot) driver;
		File scrn = tss.getScreenshotAs(OutputType.FILE);
		File destFile = new File(GenricLib.dirPath + "/screenshots/" + sdf.format(new Date()) + ".png");
		try {
			Files.copy(scrn, destFile);
		} catch (IOException e) {
			System.out.println("error in taking screen shot");
		}
	}

}
