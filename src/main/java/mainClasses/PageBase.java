package mainClasses;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class PageBase {

	public static WebDriver driver;
	public Select select;
	public JavascriptExecutor jse;

	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

} 