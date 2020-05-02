package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	WebDriver driver;
	@FindBy(css="a[href*='sign_in']") 
	WebElement signin;
	@FindBy(xpath="//h2[contains(text(),'Featured Courses')]")
	WebElement title;
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void getLogin() {
		signin.click();
	}
	public WebElement getTitle() {
		return title;
	
	}

}
