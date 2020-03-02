package allTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import allPages.BestSeller;
import allPages.HomePage;

public class BaseTest {
	private static BaseTest instance = null;
	WebDriver driver;
	HomePage homePage;
	BestSeller seller;

	private BaseTest() {

	}

	public static BaseTest getInstance() {
		if (instance == null)
			instance = new BaseTest();
		return instance;
	}

	public WebDriver driverInIt(String driverValue) {
		if (driver == null) {
			if (driverValue.contains("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Arif\\eclipse project\\TestNg.Paralal\\Browser\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (driverValue.contains("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\Arif\\eclipse project\\TestNg.Paralal\\Browser\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
		}
		return driver;
	}

	public HomePage getHomePage() {
		if (homePage == null)
			homePage = new HomePage(driver);
		return homePage;
	}

	public void tearDown() {
		if (driver != null)
			driver.close();

	}

	public BestSeller getRelease() {
		if (seller == null)
			seller = new BestSeller(driver);
		return seller;

	}

}
