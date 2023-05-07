package testClasses;

import org.testng.annotations.Test;
import mainClasses.HomePage;

public class HomeTest extends TestBase{


	HomePage Object;

	@Test(priority = 1)
	public void CheckLogo() {


		Object = new HomePage(driver);
		Object.CheckLogoIsDisplayed();

	} 



	@Test(priority = 2)
	public void CheckSearchBar()  {

		Object = new HomePage(driver);
		Object.CheckSearchBarIsDisplayed();

	} 

	@Test(priority = 3)
	public void Checkfooter(){

		Object = new HomePage(driver);
		Object.CheckHeaderIsDisplayed();

	} 
	
	@Test(priority = 4)
	public void CheckFooter(){

		Object = new HomePage(driver);
		Object.CheckFooterIsDisplayed();

	} 


}
