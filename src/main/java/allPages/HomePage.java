package allPages;

import org.openqa.selenium.WebDriver;

public class HomePage  extends Generic{
	
	String bestSeller ="//a[text()='Best Sellers']";
	
	
	

	public HomePage(WebDriver driver) {
		super(driver);
	}
	public void url() {
		getUrl("https://www.amazon.com/");
	}
	
	public String getTitle() {
	return driver.getTitle();
	}
	
	public void clickBestSeller() {
		clickOnElement(bestSeller);
		
	}
	

}
