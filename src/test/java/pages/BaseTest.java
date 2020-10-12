package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import configuration.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseTest {
	
	private static WebDriver driver = null;
	private static Page basePage;
	public static String browserName = null;
	public static String url = null;

	@BeforeTest
	public static void launchApplication() {
		
		PropertiesFile.getProperties();
		PropertiesFile.getURL();
		
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
			
		driver.get(url);
		basePage = new Page();
		basePage.setWebDriver(driver);
	
	}
	
	@Test
	public static void navigateToPage() {
		
//		TMHomePage homePageObj = new TMHomePage();
//		TMMotors motorsObj = new TMMotors();
//		TMUsedCars usedCarsObj = new TMUsedCars();
//		TMUsedCarsListing usedCarsListingObj = new TMUsedCarsListing();

		
//		homePageObj.navigateToTabMotors();
//		motorsObj.navigateToTabUsedCars(driver);
//		usedCarsObj.getUsedCarsBrand(driver);
//		usedCarsObj.isBrandAvailable(driver, "Kia");
//		usedCarsObj.navigateToMore(driver);
//		int listingNb = usedCarsListingObj.getListingNumber(driver);
//		usedCarsListingObj.listUsedCarNumber(listingNb);
		
	}
	
	@AfterTest
	public void tearDown() {
		
	//	driver.close();
	//	driver.quit();
	}

}
