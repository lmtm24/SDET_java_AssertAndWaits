package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
    //WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriverWait wait){
       // this.driver = driver;
         this.wait =  wait;

    }


    //Click method
    public void click (By locator)
    {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.click();

//        driver.findElement(locator);

    }

    public String geText(By locator){
        //String text = driver.findElement(element).getText();
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String text = element.getText();
        return text;
    }

    public void validateIfElementIsPresent(By locator){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        boolean eleSelected=  element.isDisplayed();
        if (eleSelected==true){
            System.out.println("Element is Present");
        }
    }


}
