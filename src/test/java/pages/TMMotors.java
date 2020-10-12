package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TMMotors extends Page {

	static By TMCarForSale = By.xpath("//a[contains(.,'Cars for sale')]");
	
	static WebDriver driver = null;

	public static WebDriver navigateToTabUsedCars () {		

		try {
			driver.findElement(TMCarForSale).click();			
		}
		catch (NoSuchElementException e){
			WebElement el = new WebDriverWait(driver, 10)
					.until(ExpectedConditions.elementToBeClickable(TMCarForSale));
			el.click();
		}
		return driver;
	}

}
