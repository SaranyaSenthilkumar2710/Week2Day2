package week2.Day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// Setup the browser driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		// Load the URL
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		// Maximise the browser window on loading
		driver.manage().window().maximize();
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Select Index2 from the 1st dropdown by selectByIndex
		WebElement drop1 = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select down1 = new Select(drop1);
		down1.selectByIndex(2);

		//Select UFT/QTP from the 2nd dropdown by selectByVisibleText
		WebElement drop2 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select down2 = new Select(drop2);
		down2.selectByVisibleText("UFT/QTP");

		//Select from the 3rd dropdown by selectByValue		
		WebElement drop3 = driver.findElement(By.xpath("//select[@id='dropdown3']"));
		Select down3 = new Select(drop3);
		down3.selectByValue("4");

	}

}
