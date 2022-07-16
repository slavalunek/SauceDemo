package org.example;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest {

    @Epic("sauce Demo")
    @Test(description = "product add to cart")
    public void productsShouldBeAddedToCart() {
        loginPage.openAndLoginUser();
        productsPage.addToCart("Sauce Labs Backpack");
    }

    @Test(description = "Open page basket")
    public void basketShouldBeOpen() {
        loginPage.openAndLoginUser();
        productsPage.openShoppingCart();
        Assert.assertTrue(productsPage.getYourCart(),"shopping cart didn't open");
    }
}