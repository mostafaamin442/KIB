package mainClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class HomePage extends PageBase {

	public  HomePage (WebDriver driver) {

		super(driver);
		jse = (JavascriptExecutor) driver;


	}

	@FindBy(xpath ="//*[@id=\"root\"]/div/header/div[2]/a")
	WebElement	logo;

	@FindBy(xpath ="//*[@id=\"root\"]/div/header/div[2]/input")
	WebElement	SearchBar;

	@FindBy(xpath ="//*[@id=\"root\"]/div/header/div[1]")
	WebElement	header;
	
	@FindBy(xpath ="//*[@id=\"root\"]/div/div/footer")
	WebElement	Footer;


	@FindBy(xpath ="//*[@id=\"root\"]/div/header/div[2]/a/svg")
	WebElement	NavigationMenu;


	public void CheckLogoIsDisplayed(){

		Assert.assertTrue(logo.isDisplayed(),"Logo is not displayed.");
	}

	public void CheckSearchBarIsDisplayed(){

		Assert.assertTrue(SearchBar.isDisplayed(),"SearchBar is not displayed.");
	}
	

	public void CheckHeaderIsDisplayed(){

		Assert.assertTrue(header.isDisplayed(),"footer is not displayed.");
	}
	
	
	public void CheckFooterIsDisplayed(){

		Assert.assertTrue(Footer.isDisplayed(),"footer is not displayed.");
	}
	

}