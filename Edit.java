package week2.Day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {
	
	public static void main(String[] args) {
		// Setup the browser driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		// Load the URL
		driver.get("http://leafground.com/pages/Edit.html");
		
		// Maximise the browser window on loading
		driver.manage().window().maximize();
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Enter Email
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("saranya.senthilkumar2710@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Welcome",Keys.TAB);
		
		System.out.println("Username Displayed : "+driver.findElement(By.xpath("//input[@name='username']")).isDisplayed());
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		
		System.out.println(driver.findElement(By.xpath("(//input[@type='text'])[5]")).isEnabled());

	}

}
