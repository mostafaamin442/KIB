package mainClasses;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PerformancePage extends PageBase {

	public  PerformancePage (WebDriver driver) {

		super(driver);
		jse = (JavascriptExecutor) driver;


	}


	public void CheckNavigationTiming(){

		// Get the Navigation Timing metrics
		Object navigationTiming = jse.executeScript("return window.performance.timing;");
		System.out.println("Navigation Timing metrics: " + navigationTiming);


		// Assert on the metrics
		Assert.assertTrue(((Long)
				jse.executeScript
				("return window.performance.timing.loadEventEnd - window.performance.timing.navigationStart;")) 
				<= 5000, "Page load time is too long.");


	}

	
	 public void testServerResponseTime() {
		 
	        // Start the timer
	        long startTime = System.currentTimeMillis();

	        // Execute a JavaScript command to load a resource from the server
	        ((JavascriptExecutor) driver).executeScript(
	            "var xhr = new XMLHttpRequest();" +
	            "xhr.open('GET', 'http://www.example.com/some/resource', true);" +
	            "xhr.onreadystatechange = function() {" +
	            "  if (xhr.readyState == 4) {" +
	            "    var endTime = new Date().getTime();" +
	            "    var timeDiff = endTime - " + startTime + ";" +
	            "    console.log('Server response time: ' + timeDiff + ' ms');" +
	            "    window.responseTime = timeDiff;" +
	            "  }" +
	            "};" +
	            "xhr.send(null);"
	        );

	        // Get the server response time from the JavaScript variable
	        Long serverResponseTime = (Long) ((JavascriptExecutor) driver).executeScript(
	            "return window.responseTime;"
	        );

	        driver.quit();

	        // Assert that the server response time is less than or equal to 5000 ms
	        Assert.assertTrue(serverResponseTime <= 5000); 
	        		
	 }
	 

	
	public void CheckResourseTiming(){


		// Get the Resource Timing metrics
		@SuppressWarnings("unchecked")
		ArrayList<Object> resourceTiming = (ArrayList<Object>) jse.executeScript("return window.performance.getEntriesByType('resource');", new Object[0]);

		// Assert on the metrics
		long maxLoadTime = 1000; // Set the maximum allowable load time in milliseconds
		for (Object entry : resourceTiming) {
			Double loadTime = (Double) jse.executeScript("return arguments[0].responseEnd - arguments[0].startTime;", entry);
			Assert.assertTrue(loadTime.longValue() <= maxLoadTime, "Resource load time is too long.");
		}
	}
}