package week2.Day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public static void main(String[] args) {
		// Setup the browser driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("http://leafground.com/pages/Link.html");

		// Maximise the browser window on loading
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().to("http://leafground.com/pages/Link.html");
		// Find where am supposed to go without clicking me?
		System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?"))
				.getAttribute("href"));
		//navigate to home page
		driver.navigate().to("http://leafground.com/pages/Link.html");
		// Verify am I broken?
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String text = driver.findElement(By.tagName("h1")).getText();
		System.out.println(text);
		//navigate to home page
		driver.navigate().to("http://leafground.com/pages/Link.html");
	}

}

