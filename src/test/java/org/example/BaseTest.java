package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.exumple.pages.CartPage;
import org.exumple.pages.LoginPage;
import org.exumple.pages.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    WebDriver driver;
    LoginPage loginPage;
    ProductsPage productsPage;

    CartPage cartPage;

    @BeforeMethod
    public void setUp() {
        //Initialize web driver and create driver instance
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //Set up driver settings
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Create pages
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        cartPage = new CartPage(driver);
    }

//    @AfterMethod(alwaysRun = true)
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}
