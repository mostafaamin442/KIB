package mainClasses;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class DeleteProductPage extends PageBase {

	public  DeleteProductPage (WebDriver driver) {

		super(driver);
		jse = (JavascriptExecutor) driver;


	}


	@FindBy(xpath = "/html/body/div[1]/div/main/div/div/div/div[2]/div[1]/div[4]/div[2]/button[1]")
	WebElement EditBtn;

	@FindBy(xpath ="//*[@id=\"root\"]/div/main/div/div/div/div[2]/div[1]/div[4]/div[2]/button[2]")
	WebElement DeleteBtn;
	
	@FindBy(xpath  = "//*[@id=\"root\"]/div/header/div[2]/input")
	WebElement searchBtn;
	
	String SelectAll = Keys.chord(Keys.CONTROL, "a");


	


	public void DeleteProduct() throws InterruptedException{

		Thread.sleep(3000);
		searchBtn.sendKeys("edit");
		
		Thread.sleep(3000);
		DeleteBtn.click();
		Thread.sleep(3000);
		
		//clear data from the field
		searchBtn.sendKeys(SelectAll);
		searchBtn.sendKeys(Keys.DELETE);

		//search for deleted product to make sure that's the product is deleted
		Thread.sleep(3000);
		searchBtn.sendKeys("edit test");
		Thread.sleep(3000);
		assertEquals("No products Found","No products Found");

	}


}