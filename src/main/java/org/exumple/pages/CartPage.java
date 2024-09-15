package org.exumple.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {

    private final By INVENTORY_ITEM_NAME = By.xpath("//a[@id='item_4_title_link']/div");
    private final String remove = "//div[text()='%s']/ancestor::div[@class='cart_item']//button";
    private final By BURGER_MENU_BUTTON = By.id("react-burger-menu-btn");
    private final By BURGER_MENU = By.xpath("//div[@aria-hidden='false']");
    private final By CONTINUE_SHOPPING = By.cssSelector("#continue-shopping");
    private final By CHECKOUT = By.cssSelector("#checkout");
    private final By TITLE = By.cssSelector(".title");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getInventoryItemName() {
        return driver.findElement(INVENTORY_ITEM_NAME);
    }

    @Step("click on the button remove{productName}")
    public void removeProduct(String productName) {
     By fullLocator = By.xpath(String.format(remove,productName));
     driver.findElement(fullLocator).click();
    }

    public int getAllInventoryItemName() {
        return driver.findElements(INVENTORY_ITEM_NAME).size();
    }

    @Step("click on the button burger menu")
    public void burgerMenuButton() {
        driver.findElement(BURGER_MENU_BUTTON).click();
    }

    public boolean burgerMenu() {
        return driver.findElement(BURGER_MENU).isDisplayed();
    }

    @Step("click on the button continue shopping")
    public void clickContinueShopping() {
        driver.findElement(CONTINUE_SHOPPING).click();
    }

    @Step("click on the button checkout")
    public void clickCheckOut() {
        driver.findElement(CHECKOUT).click();
    }

    public WebElement getCheckoutYourInformation() {
        return driver.findElement(TITLE);
    }
}