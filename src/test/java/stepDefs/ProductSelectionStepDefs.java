package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductSelectionStepDefs {
	
	WebDriver driver = new ChromeDriver();
	
	@And("user is on home page")
	public void user_is_on_home_page() {
		driver.navigate().to("http://automationpractice.com/index.php?");
	}

	@When("user clicks on more button")
	public void user_clicks_on_more_button() {
		driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[3]/div/div[2]/div[2]/a[2]")).click();
	}

	@Then("user is navigated to the product cart page")
	public void user_is_navigated_to_the_product_cart_page() {
		driver.navigate().to("http://automationpractice.com/index.php?id_product=2&controller=product");
	}


}
