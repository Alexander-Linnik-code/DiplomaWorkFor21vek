package by.it.academy.linnik.UI;

import by.it.academy.linnik.Singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends OpenAndCookie {
    private WebDriver driver;

    public LoginPage() {
        this.driver = Singleton.getDriver();
    }

    private final String URL = "https://www.21vek.by/";

    private final By ACCOUNT_BUTTON = By.xpath("//span[@class='userToolsText']");

    private final By LOGIN_BUTTON = By.xpath("//button[@class='Button-module__button userToolsBtn Button-module__blue-primary Button-module__small']");

    private final By EMAIL_FIELD = By.xpath("//input[@id='login-email']");

    private final By PASSWORD_FIELD = By.xpath("//input[@id='login-password']");

    private final By CONTINUE_BUTTON = By.xpath("//button[@class='Button-module__button EmailLoginForm_baseActionButton__5cptH Button-module__blue-primary']");

    private final By RESPONSE_TO_INCORRECT_ACCOUNT_LOGIN = By.xpath("//span[@class='ErrorMessage-module__message']");


    public LoginPage open() {
        driver.get(URL);
        return this;
    }

    public LoginPage clickAccountButton() {
        driver.findElement(ACCOUNT_BUTTON).click();
        return this;
    }

    public LoginPage clickLoginButton() {
        driver.findElement(LOGIN_BUTTON).click();
        return this;
    }

    public LoginPage writeTextEmailField(String login) {
        driver.findElement(EMAIL_FIELD).sendKeys(login);
        return this;
    }

    public LoginPage writeTextPassword(String password) {
        driver.findElement(PASSWORD_FIELD).sendKeys(password);
        return this;
    }

    public LoginPage clickContinueButton() {
        driver.findElement(CONTINUE_BUTTON).click();
        return this;
    }

    public String takeTextOfTheIncorrectAccountLogin() {
        return driver.findElement(RESPONSE_TO_INCORRECT_ACCOUNT_LOGIN).getText();
    }



    public LoginPage loginToYourPersonalAccount(String login, String password) {
        open();
        clickCookie();
        clickAccountButton();
        clickLoginButton();
        writeTextEmailField(login);
        writeTextPassword(password);
        clickContinueButton();
        return this;
    }
}
