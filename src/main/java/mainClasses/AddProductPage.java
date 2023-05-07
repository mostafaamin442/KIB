package mainClasses;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AddProductPage extends PageBase {

	public  AddProductPage (WebDriver driver) {

		super(driver);
		jse = (JavascriptExecutor) driver;


	} 

	@FindBy(xpath ="//*[@id=\"root\"]/div/header/div[2]/div/a")
	WebElement	CartBtn;

	@FindBy(xpath="//*[@id=\"root\"]/div/main/div/form/div[1]/div/label/input")
	WebElement UploadBtn;

	@FindBy(xpath ="//*[@id=\"root\"]/div/main/div/form/div[1]/div/div")
	WebElement DeleteImage;

	@FindBy(xpath ="//*[@id=\"root\"]/div/main/div/form/div[2]/div[1]/input")
	WebElement Title;

	@FindBy(xpath ="//*[@id=\"root\"]/div/main/div/form/div[2]/div[2]/input")
	WebElement Description;

	@FindBy(xpath ="//*[@id=\"root\"]/div/main/div/form/div[3]/div/input")
	WebElement Price;

	@FindBy(xpath ="//*[@id=\"root\"]/div/main/div/form/button")
	WebElement CreateBtn;

	@FindBy(xpath ="//*[@id=\"root\"]/div/main/div/form/div[1]/div/div/svg")
	WebElement DeleteBtn;

	@FindBy(className = "sc-eDWCr euhIkr edit-product flex justify-center items-center h-9 w-9 transition ease-in-out delay-150 duration-300")
	WebElement EditBtn;

	@FindBy(xpath  = "//*[@id=\"root\"]/div/header/div[2]/input")
	WebElement searchBtn;

	String SelectAll = Keys.chord(Keys.CONTROL, "a");


	public void AddImage() throws InterruptedException{


		Thread.sleep(3000);
		CartBtn.click();
		//verify that the image field accept JPG//
		Thread.sleep(3000);
		UploadBtn.sendKeys(System.getProperty("user.dir")+"\\TestData\\website.jpg");
		Thread.sleep(3000);
		DeleteImage.click();

		//verify that the image field accept PNG//
		Thread.sleep(3000);
		UploadBtn.sendKeys(System.getProperty("user.dir")+"\\TestData\\test.png");
		Thread.sleep(3000);
		DeleteImage.click();

		//Verify that the image field  accept GIF//
		Thread.sleep(3000);
		UploadBtn.sendKeys(System.getProperty("user.dir")+"\\TestData\\giphy.gif");
		
		



	}

	public void AddTitle() throws InterruptedException{


		//Verify that the Title field is required
		Title.click();
		Title.sendKeys(Keys.TAB);
		assertEquals("This field is required" ,"This field is required");
		Thread.sleep(3000);


		//Verify that the Minimum length of Title field is 10
		Title.sendKeys("test");
		Title.sendKeys(Keys.TAB);
		assertEquals("Min length is 10 !", "Min length is 10 !");
		Thread.sleep(3000);

		//clear data from the field
		Title.sendKeys(SelectAll);
		Title.sendKeys(Keys.DELETE);

		//Verify that the title field accept characters more than 10

		Thread.sleep(3000);
		Title.sendKeys("test Protective Case for Esspresso Maker (Multicolor)");
		Title.sendKeys(Keys.TAB); 
		Thread.sleep(3000);

	}



	public void AddDescription() throws InterruptedException{


		//Verify that the Description field is required
		Description.sendKeys(Keys.TAB);
		assertEquals("This field is required" ,"This field is required");


		//Verify that the Minimum length of Description field is 30
		Thread.sleep(3000);
		Description.sendKeys("test");
		Description.sendKeys(Keys.TAB);
		assertEquals("Min length is 30 !", "Min length is 30 !");
		Thread.sleep(3000);

		//clear data from the field
		Description.sendKeys(SelectAll);
		Description.sendKeys(Keys.DELETE);
		Thread.sleep(3000);

		//Verify that the Description field accept characters more than 30
		Description.sendKeys("Protective Case for Esspresso Maker (Multicolor) Protective Case for Esspresso Maker (Multicolor)");
		Description.sendKeys(Keys.TAB); 
		Thread.sleep(3000);

	}



	public void AddPrice() throws InterruptedException{


		//Verify that the Price field is required
		Price.click();
		Price.sendKeys(Keys.TAB);
		assertEquals("This field is required" ,"This field is required");


		//Verify that the Minimum Price is 30
		Thread.sleep(3000);
		Price.sendKeys("10");
		Price.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		assertEquals("Min price is 30 !", "Min price is 30 !");


		//clear data from the field
		Price.sendKeys(SelectAll);
		Price.sendKeys(Keys.DELETE);


		//Verify that the Price field accept  price more than 30
		Thread.sleep(3000);
		Price.sendKeys("90");
		Price.sendKeys(Keys.TAB);
		Thread.sleep(3000);


		CreateBtn.click();
		Thread.sleep(3000);


	}

	
	public void CheckAddProduct() {
		
		
		searchBtn.sendKeys("test Protective Case for Esspresso Maker (Multicolor)");
		assertEquals("90", "90");
		assertEquals("Protective Case for Esspresso Maker (Multicolor) Protective Case for Esspresso Maker (Multicolor)",
				"Protective Case for Esspresso Maker (Multicolor) Protective Case for Esspresso Maker (Multicolor)");
		searchBtn.clear();

	}
}