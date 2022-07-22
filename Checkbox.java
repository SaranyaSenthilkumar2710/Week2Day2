package week2.Day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {
	public static void main(String[] args) {
		// Setup the browser driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		// Load the URL
		driver.get("http://leafground.com/pages/checkbox.html");
		
		// Maximise the browser window on loading
		driver.manage().window().maximize();
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Select one particular CheckBox
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		// To Confirm Selenium checkbox is selected
		System.out.println("Is Selenium checkbox selected : "+driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).isSelected());

	}
}
