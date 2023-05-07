package testClasses;

import org.testng.annotations.Test;

import mainClasses.AddProductPage;

public class AddProductTest extends TestBase{


	AddProductPage Object;

	@Test(priority = 1)
	public void AddImage() throws InterruptedException {


		Object = new AddProductPage(driver); 
		Object.AddImage(); 
	
	} 

	@Test(priority = 2)
	public void AddTitle() throws InterruptedException {

		Object = new AddProductPage(driver); 
		Object.AddTitle();
	} 

	
	@Test(priority = 3)
	public void AddDescription() throws InterruptedException {

		Object = new AddProductPage(driver); 
		Object.AddDescription();
	} 

	
	
	@Test(priority = 4)
	public void AddPrice() throws InterruptedException {

		Object = new AddProductPage(driver); 
		Object.AddPrice();
	} 
	
	
	
	@Test(priority = 5)
	public void CheckAddProduct() throws InterruptedException {

		Object = new AddProductPage(driver); 
		Object.CheckAddProduct();
	} 
}
