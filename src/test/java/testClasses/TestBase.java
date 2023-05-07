package testClasses;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;

	// we added groups annotation to before test so that the testng.xml can open the driver 
	@BeforeTest(groups = {"Regression"})
	public void StartDriver(@Optional("chrome") String browsername) {
		if (browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		String url = "https://e-commerce-kib.netlify.app/";
		driver.navigate().to(url);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	} 


	@AfterTest
	public void CloseDriver() {

		driver.close();
	}
}

