package Testing;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class TestCases {
	WebElement Services = null;
	WebElement PracticeAreas = null;
  @Test
  public void VerifyServicesLinks() {
	  /*Create the locator for Services
	   * Click on Services
	   * Verify this element is present: AGILE SOFTWARE DEVELOPMENT
	   * Verify this element is present: INDUSTRY EXPERTISE
	   * Go to Menu "Practice Areas"  
	   * Scroll down and verify this element Contact Us blue button is present
	   * Click on Contact Us 
	   * Verify the Address section for Portland is present
	   * Verify that the Address is the following: 
		Portland/SW Washington 4800 Meadows Road, Suite 300
	  */
  }
  @BeforeTest
  public void beforeTest() {
	  
	  SetUp setUp = new SetUp();
	  setUp.CreateBrowser();
  }

}
