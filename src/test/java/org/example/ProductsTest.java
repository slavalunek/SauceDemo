package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest {

    @Test
    public void productsShouldBeAddedToCart() {
        loginPage.openAndLoginUser();
        productsPage.addToCart("Sauce Labs Backpack");
    }

    @Test
    public void basketShouldBeOpen() {
        loginPage.openAndLoginUser();
        productsPage.openShoppingCart();
        Assert.assertTrue(productsPage.getYourCart(),"shopping cart didn't open");
    }
}