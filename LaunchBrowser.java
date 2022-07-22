package week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager; 

public class LaunchBrowser {

	public static void main(String[] args) {
		// Setup the browser driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");

		// Maximise the browser window on loading
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Enter UserName and Password Using "id" locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click on Login Button using "class" Locator
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Click on Leads 
		driver.findElement(By.linkText("Leads")).click();

		// Click on Create Lead 
		driver.findElement(By.linkText("Create Lead")).click();

		// Enter CompanyName Field Using "id" Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");

		// Enter FirstName Field Using "id" Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");

		// Enter LastName Field Using "id" Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Senthilkumar");

		// select source name using selectByVisibleText
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop1 = new Select(source);
		drop1.selectByVisibleText("Employee");

		// Enter FirstName(Local) Field Using "id" Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Saranya");

		// Enter Department Field Using "name" Locator
		driver.findElement(By.name("departmentName")).sendKeys("IT");

		// Enter Description Field Using "name" Locator
		driver.findElement(By.name("description")).sendKeys("Automation Tester");

		// Enter emailId Field Using "id" Locator
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("saranya.senthilkumar2710@gmail.com");


		// Select Country using selectByVisibleText
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select drop2 = new Select(country);
		drop2.selectByVisibleText("India");

		// Select State using selectByVisibleText
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drop3 = new Select(state);
		drop3.selectByVisibleText("TAMILNADU");
		
		// Click on Create Lead Button by name
		driver.findElement(By.name("submitButton")).click();// click create Lead
		

		// Printing the title of loaded page in console using driver.getTitle()
		String title = driver.getTitle();
		System.out.println(title);

		// Printing the url of loaded page in console using driver.getTitle()
		String url = driver.getCurrentUrl();
		System.out.println("URL : " +url);


	}

}
