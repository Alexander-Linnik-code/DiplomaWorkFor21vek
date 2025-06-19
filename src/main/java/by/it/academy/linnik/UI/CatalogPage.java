package by.it.academy.linnik.UI;

import by.it.academy.linnik.Singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class CatalogPage extends OpenAndCookie {
    private WebDriver driver;

    public CatalogPage() {
        this.driver = Singleton.getDriver();
    }

    private final String URL = "https://www.21vek.by/";

    private final By CATALOG_SEARCH_FIELD = By.xpath("//input[@id='catalogSearch']");

    private final By ADD_TO_CART_BUTTON = By.xpath("(//div[@class='Button-module__buttonText'])[1]");

    private final By BUTTON_FOR_GOING_TO_CART = By.xpath("//span[@class='headerCartLabel']");

    private final By DELETE_SELECTED_PRODUCTS_BUTTON = By.xpath("//div[text()='Удалить']");

    private final By TITLE_CART_EMPTY = By.xpath("//h2");

    private final By SMARTPHONES_APPLE = By.xpath("//a[@href='/mobile/all/apple/']");

    private final By CHOOSING_A_PHONE = By.xpath("(//span[@class='CardInfo_text__GGroD ListingProductV2_infoText__kyxqB Text-module__text Text-module__caption Text-module__ellipsis'])[4]");

    private final By DELETE_SELECTED = By.xpath("//button[@class=\"LinkButton-module__wrapper LinkButton-module__caption LinkButton-module__regular LinkButton-module__pink\"]");

    public CatalogPage open() {
        driver.get(URL);
        return this;
    }

    public CatalogPage clickSearchField() {
        driver.findElement(CATALOG_SEARCH_FIELD).click();
        return this;
    }

    public CatalogPage textInput(String phone) {
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0,-1000).perform();
        driver.findElement(CATALOG_SEARCH_FIELD).sendKeys(phone);
        return this;
    }

    public CatalogPage clickAddCartButton() {
        driver.findElement(ADD_TO_CART_BUTTON).click();
        return this;
    }

    public CatalogPage clickBasketButton() {
        driver.findElement(BUTTON_FOR_GOING_TO_CART).click();
        return this;
    }

    public CatalogPage deleteProductsButton() {
        driver.findElement(DELETE_SELECTED_PRODUCTS_BUTTON).click();
        return this;
    }

    public String getTextTitle() {
        return driver.findElement(TITLE_CART_EMPTY).getText();
    }

    public CatalogPage clickSmartphonesApple() {
        driver.findElement(SMARTPHONES_APPLE).click();
        return this;
    }

    public CatalogPage scrool() {

        return this;
    }

    public CatalogPage clickOnPhone() {
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, 250).perform();
        driver.findElement(CHOOSING_A_PHONE).click();
        return this;
    }

    public CatalogPage clickDeletSelected() {
        driver.findElement(DELETE_SELECTED).click();
        return this;
    }

    public CatalogPage useTheSearchBarToAddToCartAndRemove(String phone) {
        open();
        clickCookie();
        clickSearchField();
        textInput(phone);
        clickSmartphonesApple();
        clickOnPhone();
        clickAddCartButton();
        clickBasketButton();
        clickDeletSelected();
        deleteProductsButton();
        return this;
    }
}
