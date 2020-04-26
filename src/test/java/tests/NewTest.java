package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTest {

	public static WebDriver driver;

	@Test
	public void openMyBlog() {
		driver.get("https://www.softwaretestingmaterial.com/");
	}

	@BeforeClass
	public static void beforeClass() {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@AfterClass
	public static void afterClass() {
		driver.quit();
	}

}