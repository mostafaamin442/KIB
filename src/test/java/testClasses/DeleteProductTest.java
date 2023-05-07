package testClasses;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import mainClasses.DeleteProductPage;

public class DeleteProductTest extends TestBase{


	DeleteProductPage Object;
 
	
	@Test(priority = 1)
	public void DeleteProduct() throws InterruptedException {
		Object = new DeleteProductPage(driver); 		
		Object.DeleteProduct(); 
	
	}

	
	@AfterTest
	public void CloseWeb() {

		driver.close(); 
	}

}
