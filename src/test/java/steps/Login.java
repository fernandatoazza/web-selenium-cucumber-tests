package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.LoginPage;

public class Login extends Util{

    WebDriver driver;
    LoginPage loginPageObject;

    @Before
    public void setUp(){
        System.out.println("Called openBrowser");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();

    }


    @Given("^I am at Login Page$")
    public void i_am_at_Login_Page() throws Throwable {
        loginPageObject = new LoginPage(driver);
        driver.get(url);

    }

    @When("^insert valid email$")
    public void insert_valid_email() {
        loginPageObject.loginTownsq("abc", "3242");
    }

    @When("^insert valid password$")
    public void insert_valid_password() {
    }

    @When("^click to login$")
    public void click_to_login() {
    }

    @Then("^I should see the Home Page$")
    public void i_should_see_the_Home_Page() {
    }
}
