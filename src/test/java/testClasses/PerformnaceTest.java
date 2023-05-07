package testClasses;

import org.testng.annotations.Test;

import mainClasses.PerformancePage;

public class PerformnaceTest extends TestBase{


	PerformancePage Object;

	@Test(priority = 1)
	public void NavigationTiming() {

		Object = new PerformancePage(driver);
		Object.CheckNavigationTiming();
		

	} 
	
	
	@Test(priority = 2)
	public void ServerTiming() {

		Object = new PerformancePage(driver);
		Object.CheckResourseTiming();

	} 
	
	
	@Test(priority = 3)
	public void ResourseTiming() {

		Object = new PerformancePage(driver);
		Object.CheckResourseTiming();

	} 
	

}
