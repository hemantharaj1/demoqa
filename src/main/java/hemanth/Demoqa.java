package hemanth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demoqa {
	WebDriver driver;

	@Given("^The user should be demoqa page$")
	public void the_user_should_be_demoqa_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HE\\eclipse-workspace\\Raj\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/registration/");
	}

	@When("^The user enters the text boxes$")
	public void the_user_enters_the_text_boxes() throws Throwable {
		driver.findElement(By.id("name_3_firstname")).sendKeys("Hemantha");
		driver.findElement(By.id("name_3_lastname")).sendKeys("Raj");
		driver.findElement(By.id("phone_9")).sendKeys("9789235843");
		driver.findElement(By.id("username")).sendKeys("username");
		driver.findElement(By.id("email_1")).sendKeys("hemantharaj34@gmail.com");
		driver.findElement(By.id("description")).sendKeys("I am the first time user to demoqa");
		driver.findElement(By.id("password_2")).sendKeys("1234@32dfjgh");
		driver.findElement(By.id("confirm_password_password_2")).sendKeys("1234@32dfjgh");

	}

	@Then("^The user verifies the entered texts$")
	public void the_user_verifies_the_entered_texts() throws Throwable {
	}

}
