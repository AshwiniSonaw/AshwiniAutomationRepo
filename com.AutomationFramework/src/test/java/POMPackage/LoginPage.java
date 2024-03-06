package POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	// parameterized constructor
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	// location of webelement
	@FindBy(name = "username")
	private WebElement usernameTextField;

	@FindBy(name = "pwd")
	private WebElement passwordTextField;

	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement loggedInCheckBox;

	@FindBy(id = "loginButton")
	private WebElement loginButton;

	// getter methods of each webelement
	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoggedInCheckBox() {
		return loggedInCheckBox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	// get method for all webelement
	// public WebElement () {
	// return usernameTextField;
	// return passwordTextField;
	// return loggedInCheckBox;
	// return loginButton;
	// }

	// POM Utilization to perform task for valid login
	public void validLoginIntoActitime(String username, String password) {
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loggedInCheckBox.click();
		loginButton.click();
	}
		//POM Utilization to perform task for invalid login
	public void invalidLoginIntoActitime(String username, String password) {
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
		usernameTextField.clear();
	}
}
