package allPages;

import org.openqa.selenium.WebDriver;

public class BestSeller extends Generic {
	public BestSeller(WebDriver driver) {
		super(driver);
		
	}

	

	String bestSellerValidation ="//div[text()='Amazon Best Sellers']";
	
	public String getBestSellerText() {
		return getText(bestSellerValidation);
	}

}
