package testClasses;

import org.testng.annotations.Test;
import mainClasses.SearchPage;

public class SearchTest extends TestBase{


	SearchPage Object;

	@Test(priority = 1)
	public void ValidSearch() {


		Object = new SearchPage(driver);
		Object.SearchByValidData();

	} 



	@Test(priority = 2)
	public void InValidSearch() throws InterruptedException {


		Object = new SearchPage(driver);
		Object.SearchByInValidData();

	} 



}
