package Pages;

import org.apache.tools.ant.taskdefs.condition.Contains;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ServicesPage extends BasePage {

    By subtitleAgile = By.xpath("//div[@id='services']//h2[@class='subtitle']");
    By subtitleIndustry= By.xpath("//div[@id='services']/div[@class='gray-section']//h3[@class='subtitle']");


    public ServicesPage(WebDriverWait wait) {
        super(wait);

    }

    public void validateSubtitleAgile(String expectedText){
        System.out.println(geText(subtitleAgile));

        Assert.assertEquals(geText(subtitleAgile),expectedText);
    }

    public void validateSubtitleIndustry(String expectedText){
        System.out.println(geText(subtitleIndustry));

        Assert.assertEquals(geText(subtitleIndustry),expectedText);
    }




}
