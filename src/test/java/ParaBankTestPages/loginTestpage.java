package ParaBankTestPages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import ParaBankPages.loginPage;
import ParaBankPages.registrationPage;

public class loginTestpage extends baseClassTest {

	@Test(priority = 1, groups = "loginTestpageGroup")
	public void browserLaunch() throws IOException {
		try {
			loginPage();
		} catch (Exception e) {
			// TODO: handle exception
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("target\\loginPageLoadingError.png"));
		}

	}

	@Test(priority = 2, groups = "loginTestpageGroup")
	public void enterData() throws InterruptedException, IOException {
		try {
			loginPage lp = new loginPage(driver);
			Thread.sleep(1000);
			lp.enterUserName();
			lp.enterPassword();
			lp.pressLoginButton();
		} catch (Exception e) {
			// TODO: handle exception
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("target\\enterDataInLoginPageError.png"));
		}

	}

}
