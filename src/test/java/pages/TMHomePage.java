package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TMHomePage extends Page {

	private static By TMTabMotors = By.id("SearchTabs1_MotorsAnchor");

	private static By TMCarForSale = By.xpath("//a[contains(.,'Cars for sale')]");


	public static void navigateToTabMotors () {

		driver.findElement(TMTabMotors).click();		
	}

	public static void checkCarForSaleIsDisplayed() {

		WebElement el = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(TMCarForSale));
		Assert.assertTrue(el.isDisplayed(), "Not on the correct page");
	}	
}
