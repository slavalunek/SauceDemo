package org.exumple.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private final By USER_NAME_INPUT = By.id("user-name");
    private final By PASSWORD_INPUT = By.id("password");
    private final By LOGIN_BUTTON = By.id("login-button");
    private final By ERROR = By.cssSelector("h3[data-test=error]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step("The user opens the site Sauce Demo")
    public void open() {
        driver.get(BASE_URL);
    }

    @Step("Enters login{user}, password{password} and click login button")
    public void login(String user, String password) {
        driver.findElement(USER_NAME_INPUT).sendKeys(user);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).submit();
    }

    public void loginAsStandardUser() {
        login("standard_user", "secret_sauce");
    }

    public String getError() {
        return driver.findElement(ERROR).getText();
    }

    @Step("The user opens the site Sauce Demo and registered")
    public void openAndLoginUser() {
        open();
        loginAsStandardUser();
    }
}