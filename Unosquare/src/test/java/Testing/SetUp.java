package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUp {
public WebDriver CreateBrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\luis.osuna\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.unosquare.com/");
	
	return driver;
	}
}
