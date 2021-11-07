package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class AddToCartStepDefs {
	
	WebDriver driver = new ChromeDriver();
	
	@And("user is on add to cart page")
	public void user_is_on_add_to_cart_page() {
	    driver.navigate().to("http://automationpractice.com/index.php?id_product=1&controller=product");
	}

	@When("user enters size and quantity")
	public void user_enters_size_and_quantity() {
		driver.findElement(By.id("quantity_wanted")).sendKeys("1");
	    driver.findElement(By.id("group_1")).sendKeys("S");
	}

	@And("user clicks on add to cart button")
	public void user_clicks_on_add_to_cart_button() {
		driver.findElement(By.name("Submit")).click();
	}

}
