package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TMUsedCarsListing extends Page {

	//	Locate the more... link associated with the Feature listings closing soon
	static By TMUsedCarslist = By.id("ListView_listingTableHeader_headerColumnListViewText");
	static By TMUsedCarListingDetails = By.id("ListViewList");
	
	static String trunc = null;

	public static String getListingNumber () {

		try {

			String text = driver.findElement(TMUsedCarslist).getText();
			trunc = text.substring(0, 1);
			return trunc;

		}
		catch (NoSuchElementException e) {
			WebElement el = new WebDriverWait(driver, 10)
					.until(ExpectedConditions.presenceOfElementLocated(TMUsedCarslist));

			String text = driver.findElement(TMUsedCarslist).getText();
			trunc = text.substring(0, 1);
			return trunc;
		}
	}

	
	public static void navigateToListingDetails () {

			WebElement el = new WebDriverWait(driver, 10)
					.until(ExpectedConditions.presenceOfElementLocated(TMUsedCarListingDetails));
			el.click();


	}
}

