package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy(id="user_email")
	WebElement email;
	@FindBy(id="user_password")
	WebElement pass;
	@FindBy(xpath="//input[@value='Log In']")
	WebElement submit;
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void getEmail(String username) {
		email.sendKeys(username);
	}
	public void getPass(String password) {
		pass.sendKeys(password);
	}
	public void getSubmit() {
		submit.click();
	}

}
