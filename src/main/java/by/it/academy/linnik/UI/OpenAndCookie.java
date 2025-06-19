package by.it.academy.linnik.UI;

import by.it.academy.linnik.Singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenAndCookie {

    private WebDriver driver;

    public OpenAndCookie() {
        this.driver = Singleton.getDriver();
    }

    private final By CLICK_COOKIE = By.xpath("//div[text()='Принять']");

    protected OpenAndCookie clickCookie() {
        driver.findElement(CLICK_COOKIE).click();
        return this;
    }
}
