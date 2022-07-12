package org.example;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void userShouldLoginWithValidCredentials() {
        loginPage.open();
        String user = System.getProperty("username");
        String password = System.getProperty("password");
        loginPage.login(user, password);
        assertTrue(productsPage.getTitle().isDisplayed(), "User was not logged in");
    }

    @Test
    public void passwordShouldBeRequiredForLogin() {
        loginPage.open();
        loginPage.login("standard_user", "");
        assertEquals(loginPage.getError(), "Epic sadface: Password is required", "The error is incorrect");
    }
}
