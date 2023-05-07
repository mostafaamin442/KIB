package testClasses;

import org.testng.annotations.Test;

import mainClasses.EditProductPage;

public class EditProductTest extends TestBase{


	EditProductPage Object;
 
	
	@Test(priority = 1)
	public void EditImage() throws InterruptedException {
		Object = new EditProductPage(driver); 		
		Object.EditImage(); 
	
	}

	@Test(priority = 2)
	public void EditTitle() throws InterruptedException {

		Object = new EditProductPage(driver); 
		Object.EditTitle();
	} 

	
	@Test(priority = 3)
	public void EditDescription() throws InterruptedException {

		Object = new EditProductPage(driver); 
		Object.EditDescription();
	} 

	
	
	@Test(priority = 4)
	public void EditPrice() throws InterruptedException {

		Object = new EditProductPage(driver); 
		Object.EditPrice();
	} 
	
	

	@Test(priority = 5)
	public void CheckEditProuct() throws InterruptedException {

		Object = new EditProductPage(driver); 
		Object.CheckEditProduct();
	} 
	

}
