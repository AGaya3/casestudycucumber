package cucumber;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.Given;
public class Registration {
	WebDriver driver;
	@Given("open the test me appliction")
	public void open_the_test_me_appliction() {
		System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver_win32 (2)\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/");
	}

	@Given("click on the signup")
	public void click_on_the_signup() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();

	}

	@Given("enter username as {string}")
	public void enter_username_as(String un) {
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(un);

	}

	@Given("enter firstname as {string}")
	public void enter_firstname_as(String fn) {
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(fn);

	}
	

	@Given("enter lastname as {string}")
	public void enter_lastname_as(String ln) {
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(ln);

	}

	@Given("enter password as {string}")
	public void enter_password_as(String psd) {
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(psd);

	}

	@Given("enter confirm password as {string}")
	public void enter_confirm_password_as(String cpsd) {
		driver.findElement(By.xpath("//*[@id=\"pass_confirmation\"]")).sendKeys(cpsd);

	}

	@Given("select gender as Female")
	public void select_gender_as_Female() {
		driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();

	}

	@Given("enter email as {string}")
	public void enter_email_as(String em) {
		driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys(em);

	}

	@Given("enter mobile number as {string}")
	public void enter_mobile_number_as(String ph) {
		driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys(ph);

	}

	@Given("enter date of birth as {string}")
	public void enter_date_of_birth_as(String dob) {
		driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys(dob);

	}

	@Given("enter address as {string}")
	public void enter_address_as(String addr) {
		driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys(addr);

	}

	@Given("select the security question")
	public void select_the_security_question() {
		Select a=new Select(driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]")));
		a.selectByIndex(1);

	}

	@Given("enter the security answer as {string}")
	public void enter_the_security_answer_as(String ans) {
		driver.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys(ans);

	}

	@Given("click on register")
	public void click_on_register() {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();

	}

	@Given("registration should be successfull")
	public void registration_should_be_successfull() {
		Assert.assertEquals("Login",driver.getTitle());

	    	}



}
