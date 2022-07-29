package org.example;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.RetryAnalyzer;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Epic("sauce Demo")
public class LoginTest extends BaseTest {

    @Test(description = "user login with valid credentials")
    public void userShouldLoginWithValidCredentials() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        assertTrue(productsPage.getTitle().isDisplayed(), "User was not logged in");
    }

    @Test(description = "Checking the system if you don't enter a password")
    public void passwordShouldBeRequiredForLogin() {
        loginPage.open();
        loginPage.login("standard_user", "");
        assertEquals(loginPage.getError(), "Epic sadface: Password is required", "The error is incorrect");
    }
}
