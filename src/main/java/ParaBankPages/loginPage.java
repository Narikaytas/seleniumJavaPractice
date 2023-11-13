package ParaBankPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage extends baseClass {
	WebDriver driver;

	public loginPage(WebDriver driver) {
		this.driver = driver;
	}

	By usernameInputBox = By.xpath("//input[@name=\"username\"]");
	By passwordInputBox = By.xpath("//input[@name='password']");
	By pressLogin = By.xpath("//input[@type=\"submit\"]");

	public void enterUserName() {
		driver.findElement(usernameInputBox).sendKeys(registrationPage.username);
	}

	public void enterPassword() {
		driver.findElement(passwordInputBox).sendKeys(registrationPage.password);
	}

	public void pressLoginButton() {
		driver.findElement(pressLogin).click();
	}

}
