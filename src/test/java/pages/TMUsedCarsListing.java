package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TMUsedCarsListing extends Page {

	//	Locate the more... link associated with the Feature listings closing soon
	static By TMUsedCarslist = By.id("ListView_listingTableHeader_headerColumnListViewText");
	static By TMUsedCarListingDetails = By.id("ListViewList");
	
	static String trunc = null;
	static int i = 0;

	public static int getListingNumber (WebDriver driver) {

		try {

			String text = driver.findElement(TMUsedCarslist).getText();
			trunc = text.substring(0, 1);
			i = Integer. parseInt(trunc);
			return i;

		}
		catch (NoSuchElementException e) {
			WebElement el = new WebDriverWait(driver, 10)
					.until(ExpectedConditions.presenceOfElementLocated(TMUsedCarslist));

			String text = driver.findElement(TMUsedCarslist).getText();
			trunc = text.substring(0, 1);
			int i = Integer. parseInt(trunc);
			return i;
		}
	}

	public static int listUsedCarNumber () {

		if (i >= 1) {
			System.out.println("There are " + i + " listings in the TM Used Cars category");
		}
		else {
			System.out.println("There are no listing in the TM Used Cars category");
		}
		return i;
	}
	
	public static  WebDriver navigateToListingDetails (WebDriver driver) {

			WebElement el = new WebDriverWait(driver, 10)
					.until(ExpectedConditions.presenceOfElementLocated(TMUsedCarListingDetails));
			el.click();
			return driver;

	}
}

