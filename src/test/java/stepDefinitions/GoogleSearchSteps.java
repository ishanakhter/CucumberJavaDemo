package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSteps {
	
	WebDriver driver;

	@Given("^browser is open$")
	public void browser_is_open() {
		// Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		
		
	}

	@And("^user is on google search page$")
	public void user_is_on_search_page() {
		// Write code here that turns the phrase above into concrete actions
		driver.navigate().to("https://www.google.com/");
	}

	@When("^user enters a text in search box$")
	public void user_enters_the_text_in_search_box() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys("Wipro");
		
	}

	@And("^hits enter$")
	public void hits_enter() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}

	@Then("^user is navigated to search results$")
	public void user_is_navigated_to_the_search_results() {
		// Write code here that turns the phrase above into concrete actions
		driver.getPageSource().contains("Wipro | Digital, Technology, Business Solutions");
		driver.close();
		driver.quit();
		

	}

}
