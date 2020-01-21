package cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cart {
	WebDriver driver;
	@Given("Alex has registered into TestMeApp")
	public void alex_has_registered_into_TestMeApp() {
		System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver_win32 (2)\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		 driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("lalitha");
		 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		 driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@When("Alex search a particular product like headphone")
	public void alex_search_a_particular_product_like_headphone() {
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("Headphone");
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@When("try to proceed to payment without adding any item in the cart")
	public void try_to_proceed_to_payment_without_adding_any_item_in_the_cart() {
		Assert.assertEquals("Search",driver.getTitle());

	}

	@Then("TestMeApp doesn't display the cart icon")
	public void testmeapp_doesn_t_display_the_cart_icon() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		
	}



}
