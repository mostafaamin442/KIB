package mainClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class SearchPage extends PageBase {

	public  SearchPage (WebDriver driver) {

		super(driver);
		jse = (JavascriptExecutor) driver;


	}

	@FindBy(xpath ="//*[@id=\"root\"]/div/header/div[2]/input")
	WebElement	SearchBar;


	public void SearchByValidData(){
		
		SearchBar.sendKeys("Joyroom JR-T03S PLUS TWS Bluetooth");
		Assert.assertEquals("Joyroom JR-T03S PLUS TWS Bluetooth", "Joyroom JR-T03S PLUS TWS Bluetooth");
		
	}


	public void SearchByInValidData() throws InterruptedException{
		
		SearchBar.clear();
		Thread.sleep(3000);
		SearchBar.sendKeys("invalid data");
		Assert.assertEquals("No products Found" , "No products Found");
		
	}
	

	

}