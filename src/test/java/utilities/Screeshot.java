package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseClass;

public class Screeshot extends BaseClass {
	public static String screenshotPath;
	public static String screenshotName;

	public static void captureScreenshot() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
		Date date = new Date();
		screenshotName =  date.toString().replace(":", "_").replace(" ", "_") + ".png";
		FileUtils.copyFile(scrFile,  new File(System.getProperty("user.dir")+"/screenshots/" + screenshotName));
	}
	
}
