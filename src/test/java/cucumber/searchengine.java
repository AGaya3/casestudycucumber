package cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class searchengine {
	WebDriver driver;
	@Given("login the TestMeApp")
	public void login_the_TestMeApp() {
		System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver_win32 (2)\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		 driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("lalitha");
		 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		 driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@Given("user search the particular product in findfield as {string}")
	public void user_search_the_particular_product_in_findfield_as(String pd) {
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys(pd);
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@Given("user found the product")
	public void user_found_the_product() {
		Assert.assertEquals("Search",driver.getTitle());
	}



}
