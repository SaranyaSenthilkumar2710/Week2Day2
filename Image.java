package week2.Day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) {
		// Setup the browser driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		// Load the URL
		driver.get("http://leafground.com/pages/Image.html");
		
		// Maximise the browser window on loading
		driver.manage().window().maximize();
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Click on the image navigates to home page
		driver.findElement(By.xpath("(//label[contains(text(),'Click on this image')])/following::img")).click();
		driver.navigate().to("http://leafground.com/pages/Image.html");
        

	}

}
