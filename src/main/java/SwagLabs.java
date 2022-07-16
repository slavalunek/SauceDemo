import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SwagLabs {
    @Test
    public void SwagLabsTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        String nameShirt = driver.findElement(By.className("inventory_item_name")).getText();
        Assert.assertEquals(nameShirt,"Sauce Labs Bolt T-Shirt","the name doesn't match");
        String price = driver.findElement(By.className("inventory_item_price")).getText();
        Assert.assertEquals(price,"$15.99","the price doesn't match");
    }
}
