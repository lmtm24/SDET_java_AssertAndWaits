package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ContacUsPAge extends BasePage{

    By content = By.cssSelector("#contact-us .gray-section:nth-of-type(3) .content-home");
    /*
    public ContacUsPAge(WebDriver driver) {
        super(driver);
    }
    */
    public ContacUsPAge(WebDriverWait wait) {
        super(wait);

    }
    public void validatePortlandSection(String expectedAddress){
        Assert.assertTrue(geText(content).contains(expectedAddress));
        //System.out.println(geText(content));
    }

    public void validatePortlandAddress(String expectedAddress){
        Assert.assertTrue(geText(content).contains(expectedAddress));
        //System.out.println(geText(content));
    }

}
