package cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class login {
	WebDriver driver;
	@Given("open login page")
	public void open_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver_win32 (2)\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	 
	}

	@Given("enter username in username field as{string}")
	public void enter_username_in_username_field_as(String un) {
		 driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(un);

	}

	@Given("enter password in password field as {string}")
	public void enter_password_in_password_field_as(String psd) {
		 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(psd);

	}

	@Given("click login")
	public void click_login() {
		 driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		 Assert.assertEquals("Home",driver.getTitle());

	}



}
