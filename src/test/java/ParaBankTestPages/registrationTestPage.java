package ParaBankTestPages;

import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;

import ParaBankPages.registrationPage;

public class registrationTestPage extends baseClassTest {

	@Test(priority = 1, groups = "registrationTestPageGroup")
	public void browserLaunch() throws IOException {
		try {
			regisgtrationPage();
		} catch (Exception e) {
			// TODO: handle exception
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("target\\registrationPageLoadingError.png"));
		}

	}

	@Test(priority = 2, groups = "registrationTestPageGroup")
	public void registerData() throws InterruptedException, IOException {
		try {
			registrationPage registrationPage = new registrationPage(driver);
			registrationPage.enterFirstName();
			registrationPage.enterLastName();
			registrationPage.enterAddress();
			registrationPage.enterCity();
			registrationPage.enterState();
			registrationPage.enterZipCode();
			registrationPage.enterPhoneNumber();
			registrationPage.enterSSNIdNumber();
			registrationPage.enterUserName();
			registrationPage.enterPassword();
			registrationPage.re_EnterPassword();
			registrationPage.registerButtonClick();
			driver.close();

		} catch (Exception e) {
			// TODO: handle exception
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("target\\registerDataInRegistrationPageError.png"));
		}

	}

}
