package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step {
	WebDriver driver;
	
	@Given("^open the site and start registration$")
	public void open_the_site_and_start_registration() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		driver.findElement(By.partialLinkText("REGISTER")).click();
		
	    
	}

	@When("^I filled all information$")
	public void I_filled_all_information() throws Throwable {
		
		driver.findElement(By.name("firstName")).sendKeys("Nirmala");
		driver.findElement(By.name("lastName")).sendKeys("Devi");
		driver.findElement(By.name("phone")).sendKeys("9677888119");
		driver.findElement(By.name("userName")).sendKeys("nirmaladevisubbu@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Tondiarpet");
		driver.findElement(By.name("address2")).sendKeys("Chennai");
		driver.findElement(By.name("city")).sendKeys("chennai");
		driver.findElement(By.name("state")).sendKeys("Tamilnadu");
		driver.findElement(By.name("postalCode")).sendKeys("600081");
		Select country=new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("INDIA ");
		
		driver.findElement(By.name("email")).sendKeys("nirmala");
		driver.findElement(By.name("password")).sendKeys("nirmaladev");
		driver.findElement(By.name("confirmPassword")).sendKeys("nirmaladev");
		
	    
	}

	@Then("^user shoul register successfully$")
	public void user_shoul_register_successfully() throws Throwable {
		
		driver.findElement(By.name("register")).click();
	    
	}


}
