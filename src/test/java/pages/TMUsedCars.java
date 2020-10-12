package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import org.junit.Assert;

public class TMUsedCars extends Page {

	//	Locate the more... link associated with the Feature listings closing soon
	static By TMUsedCarsClosingSoonMore = By.xpath("//a[@href='/Browse/FeaturedAttributeListings.aspx?cid=268'][contains(.,'more...')]");
	//Locate the table that contains the brands of car and locate the td tag within it
	static By TMCarBrand = By.id("makes");	
	static By TMCarBrandCol = By.tagName("td");

	static List<String> usedCarBrands = new ArrayList<String>();

	public static List<String> getUsedCarsBrand (WebDriver driver) {

		WebElement el = new WebDriverWait(driver, 10)
				.until(ExpectedConditions.elementToBeClickable(TMCarBrand));

		//			Define WebElement that represents the table which id = makes
		WebElement brands = driver.findElement(TMCarBrand);

		//			Create a List of WebElements that represent each td in the table which id = makes
		List<WebElement> tableCols = brands.findElements(TMCarBrandCol);

		for (int i = 0; i < tableCols.size(); i++) {						
			String carBrand  = tableCols.get(i).getText();
			
			usedCarBrands.add(carBrand);
		}  
		
		return usedCarBrands;
	}

	public static void isBrandAvailable (WebDriver driver, String brandName) {
		
		for (String brandNameFromList : usedCarBrands) {
			
			if (brandNameFromList.contains(brandName)) {
				
				System.out.println(brandName + " is present in the Used Car section");
			}
			else {
				System.out.println(brandName + " is not present in the Used Car section");
			}		
		}
	}



	public static WebDriver navigateToMore () {		

		try {
			driver.findElement(TMUsedCarsClosingSoonMore).click();			
		}
		catch (Exception e){
			WebElement el = new WebDriverWait(driver, 10)
					.until(ExpectedConditions.elementToBeClickable(TMUsedCarsClosingSoonMore));
			el.click();
		}		
		return driver;
	}


}
