package allTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

public class HomepageTest {
	BaseTest instance = BaseTest.getInstance();
	
	
	@BeforeMethod
	public void openUrl() {
	 
	instance.driverInIt("chrome");
	instance.getHomePage().url();
	}
	
	@Test(priority = 1)
	public void titleValidation() {
		
		String title =instance.getHomePage().getTitle();
		System.out.println(title);
		AssertJUnit.assertEquals(title,
				"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
		

	}
	
	@Test(priority = 2)
	public void bestSellerValidation() throws InterruptedException {
		
		instance.getHomePage().clickBestSeller();
		Thread.sleep(5000);
		String text = instance.getRelease().getBestSellerText();
		System.out.println(text);
		AssertJUnit.assertEquals(text, "Amazon Best Sellers");
		
		
	}
	
	@AfterClass
	public void close() {
		instance.tearDown();
	}

}
