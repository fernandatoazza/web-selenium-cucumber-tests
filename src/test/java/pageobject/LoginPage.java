package pageobject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(id = "email-input")
    WebElement emailElement;

    @FindBy(id = "password-input")
    WebElement passwordElement;

    public void setEmail(String email){
        emailElement.sendKeys(email);
    }

    public void setPassword(String password){
        passwordElement.sendKeys(password);
    }

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loginTownsq(String email, String password){
        this.setEmail(email);
        this.setPassword(password);
    }
}
