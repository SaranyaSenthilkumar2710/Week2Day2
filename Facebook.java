package week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
		// Setup the browser driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("https://en-gb.facebook.com/");

		// Maximise the browser window on loading
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Click on Create account using xpath
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		
		//Enter Firstname 
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Yazhini");
		
		//Enter Lastname 
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Senthilkumar");
		
		//Enter Mobile number 
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9790888828");
		
		//Enter Password
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("Open@123");
		
		//Select gender as Female
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		//Select Day from the dropdown by selectByValue
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select drop1 = new Select(day);
		drop1.selectByValue("9");
		
		//Select Month from the dropdown by selectByVisibleText
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select drop2 = new Select(month);
		drop2.selectByVisibleText("Sep");
		
		//Select Year from the dropdown by selectByValue
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select drop3 = new Select(year);
		drop3.selectByValue("2016");

		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		// Printing the title of loaded page in console using driver.getTitle()
		String title = driver.getTitle();
		System.out.println(title);

		// Printing the url of loaded page in console using driver.getTitle()
		String url = driver.getCurrentUrl();
		System.out.println("URL : " +url);

	}
}
