package Academy2;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import resources.base;



public class validateTitle extends base {
	@BeforeTest
	public void beforetest() throws IOException {
		driver=initializedriver();
		driver.get(prop.getProperty("url"));
	}
	@Test
	public void test2() throws IOException {
		
		LandingPage lp = new LandingPage(driver);
		Assert.assertEquals(lp.getTitle().getText(),"FEATURED COURSES12");
		System.out.println(lp.getTitle().getText());
		
	
	}
	@AfterTest
	public void aftertest() {
		driver.close();
	}

}
