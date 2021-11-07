package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {
	
	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {
	   String projectpath = System.getProperty("user.dir");
	   System.out.println("Project path is "+projectpath);
	   System.setProperty("webdriver.chrome.driver", projectpath + "/src/test/resources/drivers/chromedriver.exe" );
	   driver = new ChromeDriver();
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
	    driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    driver.findElement(By.id("email")).sendKeys("sashi.imeshika@gmail.com");
	    driver.findElement(By.id("passwd")).sendKeys("imeshika");
	}
	
	@And("user clicks on login")
	public void user_clicks_on_login() {
	    driver.findElement(By.id("SubmitLogin")).click();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    driver.navigate().to("http://automationpractice.com/index.php?controller=my-account");
	}



}
 