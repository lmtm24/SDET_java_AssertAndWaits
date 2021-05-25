package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    By servicesLink = By.xpath("//div[@id='navbarSupportedContent']/ul[@class='navbar-nav']//a[@href='/Services']");
    public HomePage(WebDriverWait wait) {
        super(wait);

    }

    public void clickServicesLink(){
        click(servicesLink);
    }
}
