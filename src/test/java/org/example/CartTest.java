package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test
    public void complianceOfTheAddedProduct() {
        loginPage.openAndLoginUser();
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.openShoppingCart();
        Assert.assertEquals(cartPage.getInventoryItemName().getText(), "Sauce Labs Backpack", "error add to product");
    }

    @Test
    public void removeProduct() {
        loginPage.openAndLoginUser();
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.openShoppingCart();
        cartPage.removeProduct("Sauce Labs Backpack");
        Assert.assertEquals(cartPage.getAllInventoryItemName(), 0, "product is removed");
    }

    @Test
    public void openBurgerMenu() {
        loginPage.openAndLoginUser();
        productsPage.openShoppingCart();
        cartPage.burgerMenuButton();
        Assert.assertTrue(cartPage.burgerMenu(), "error the burger menu");
    }

    @Test
    public void backToPageProducts() {
        loginPage.openAndLoginUser();
        productsPage.openShoppingCart();
        cartPage.clickContinueShopping();
        Assert.assertTrue(productsPage.getTitle().isDisplayed(), "error of continue shopping button");
    }

    @Test
    public void openToPageCheckoutPage() {
        loginPage.openAndLoginUser();
        productsPage.openShoppingCart();
        cartPage.clickCheckOut();
        Assert.assertTrue(cartPage.getCheckoutYourInformation().isDisplayed(), "error of checkout button");
    }
}
