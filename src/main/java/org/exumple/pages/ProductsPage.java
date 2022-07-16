package org.exumple.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends BasePage {

    private final By TITLE_CART = By.cssSelector(".title");
    private final By SHOPPING_CART = By.cssSelector(".shopping_cart_link");
    private final By TITLE = By.cssSelector(".title");
    private final String addToCartButton = "//div[text()='%s']/ancestor::div[@class='inventory_item']//button";

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL + "inventory.html");
    }

    public WebElement getTitle() {
        return driver.findElement(TITLE);
    }

    @Step("click on the button {productName}")
    public void addToCart(String productName) {
        By fullLocator = By.xpath(String.format(addToCartButton, productName));
        driver.findElement(fullLocator).click();
    }

    @Step("click on the button shopping cart")
    public void openShoppingCart() {
        driver.findElement(SHOPPING_CART).click();
    }

    public boolean getYourCart() {
        return driver.findElement(TITLE_CART).isDisplayed();
    }
}