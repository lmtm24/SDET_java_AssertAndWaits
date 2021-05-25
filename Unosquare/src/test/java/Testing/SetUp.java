package Testing;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class SetUp {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeTest
public void CreateBrowser() {
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\luis.osuna\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver,5);
	driver.get("https://www.unosquare.com/");


	}

}
