package Testing;

import Pages.ContacUsPAge;
import Pages.HomePage;
import Pages.PracticeAreasPage;
import Pages.ServicesPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class TestCases extends SetUp{

	WebElement Services = null;
	WebElement PracticeAreas = null;
	ServicesPage servicesPage;
	HomePage homePage;
	PracticeAreasPage practiceAreasPage;
    ContacUsPAge contacUsPAge;


  @Test
  public void VerifyServicesLinks() {


      String expectedAgileText = "AGILE SOFTWARE DEVELOPMENT";
      String expectedIndustryText = "INDUSTRY EXPERTISE";
      String portlandSection = "PORTLAND | US HEADQUARTERS";
      String portlandAddress = "Portland/SW Washington\n" + "4800 Meadows Road, Suite 300\n" + "Lake Oswego, OR 97035";
       homePage.clickServicesLink();
       servicesPage.validateSubtitleAgile(expectedAgileText);
       servicesPage.validateSubtitleIndustry(expectedIndustryText);
       practiceAreasPage.clickPracticAreas();
       practiceAreasPage.validateIsBlueButtonPresent();
       practiceAreasPage.clickContacUs();
       contacUsPAge.validatePortlandSection(portlandSection);
       contacUsPAge.validatePortlandAddress(portlandAddress);


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

	  servicesPage = new ServicesPage(wait);
	  homePage = new HomePage(wait);
	  practiceAreasPage = new PracticeAreasPage(wait);
	  contacUsPAge = new ContacUsPAge(wait);


  }

}
