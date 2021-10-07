package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class LoginDemoSteps_POM {

	WebDriver driver;
	LoginPage login = new LoginPage(driver);

	@Given("browser has opened")
	public void browser_is_open() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();

	}

	@And("user is on Login Page")
	public void user_is_on_Login_Page() {

		driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
		
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickLogin();
//		driver.findElement(By.id("name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//		driver.findElement(By.id("login")).click();
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
		login.checkLogOutIsDisplayed();
		//driver.findElement(By.id("logout")).isDisplayed();
		driver.close();
		driver.quit();
	}

}
