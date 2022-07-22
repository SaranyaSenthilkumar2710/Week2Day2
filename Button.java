package week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		// Setup the browser driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("http://leafground.com/pages/Button.html");

		// Maximise the browser window on loading
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Click button to travel home page
		driver.findElement(By.xpath("//button[@id='home']")).click();

		//Find position of button (x,y)
		System.out.println(driver.findElement(By.xpath("//button[@id='position']")).getLocation());

		//Find button color
		System.out.println(driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color"));

		//Find the height and width
		System.out.println(driver.findElement(By.xpath("//button[@id='size']")).getSize());
	}

}
