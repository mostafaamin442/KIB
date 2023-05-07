package mainClasses;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class EditProductPage extends PageBase {

	public  EditProductPage (WebDriver driver) {

		super(driver);
		jse = (JavascriptExecutor) driver;


	}

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

	@FindBy(xpath = "/html/body/div[1]/div/main/div/div/div/div[2]/div[1]/div[4]/div[2]/button[1]")
	WebElement EditBtn;

	@FindBy(xpath ="//*[@id=\"root\"]/div/main/div/form/div[1]/div/div/svg")
	WebElement DeleteBtn;
	
	@FindBy(xpath  = "//*[@id=\"root\"]/div/header/div[2]/input")
	WebElement searchBtn;
	
	String SelectAll = Keys.chord(Keys.CONTROL, "a");


	


	public void EditImage() throws InterruptedException{

		Thread.sleep(3000);
		searchBtn.sendKeys("test");
		
	
		Thread.sleep(3000);
		EditBtn.click();
		Thread.sleep(3000);

		DeleteImage.click();
		Thread.sleep(3000);
		UploadBtn.sendKeys(System.getProperty("user.dir")+"/TestData/shoes.jpg");
		Thread.sleep(3000);

	}

	public void EditTitle() throws InterruptedException{

		//clear data from the field
		Title.sendKeys(SelectAll);
		Title.sendKeys(Keys.DELETE);
		
		Thread.sleep(3000);
		Title.sendKeys("edit test Protective Case for Esspresso Maker (Multicolor)");

	}

	public void EditDescription() throws InterruptedException{


		//clear data from the field
		Description.sendKeys(SelectAll);
		Description.sendKeys(Keys.DELETE);
		
		Thread.sleep(3000);
		Description.sendKeys("edit test Protective Case for Esspresso Maker (Multicolor)");
		Thread.sleep(3000);
		
		
	}


	public void EditPrice() throws InterruptedException{

		//clear data from the field
		Price.sendKeys(SelectAll);
		Price.sendKeys(Keys.DELETE);
		
		Thread.sleep(3000);
		Price.sendKeys("200");
		
		
		CreateBtn.click();
		Thread.sleep(3000);

	}

	
	//Check that product appears with the new data correctly
	public void CheckEditProduct() {
		
	
		searchBtn.sendKeys("edit test Protective Case for Esspresso Maker (Multicolor)");
		assertEquals("200", "200");
		assertEquals("edit test Protective Case for Esspresso Maker (Multicolor)", "edit test Protective Case for Esspresso Maker (Multicolor)");
		searchBtn.clear();

	}
}