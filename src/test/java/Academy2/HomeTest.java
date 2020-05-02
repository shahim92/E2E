package Academy2;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;

public class HomeTest extends base {
	@BeforeTest
	public void beforetest() throws IOException {
		driver=initializedriver();
		driver.manage().window().maximize();
		
		
	}
	@Test(dataProvider="getData")
	public void test1(String username, String password) throws IOException {
		driver.get(prop.getProperty("url"));
		LandingPage lp= new LandingPage(driver);
		lp.getLogin();
		LoginPage gp= new LoginPage(driver);
		gp.getEmail(username);
		gp.getPass(password);
		gp.getSubmit();
	}
	@DataProvider
	public Object [][] getData(){
		Object[][] data = new Object[2][2];
		data[0][0]="restrictedusercom";
		data[0][1]="1234";
		
		data[1][0]="nonrestrictedusecom";
		data[1][1]="123465";
		
		return data;
		
		
	}
	@AfterTest
	public void aftertest() {
		driver.close();
	}
	
		
	

}
