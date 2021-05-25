package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeAreasPage extends BasePage{

    By practice = By.xpath("//div[@id='navbarSupportedContent']/ul[@class='navbar-nav']//a[@href='/PracticeAreas']");
    By contactUsButton = By.xpath("//div[@id='banner']/div[@class='container']//a[@href='/ContactUs']");

   /* public PracticeAreasPage(WebDriver driver) {
        super(driver);
    }
*/
    public PracticeAreasPage(WebDriverWait wait) {
        super(wait);

    }

    public void clickPracticAreas(){
        click(practice);
    }
    public void validateIsBlueButtonPresent(){
        validateIfElementIsPresent(contactUsButton);
    }
    public void clickContacUs(){
        click(contactUsButton);
    }


}
