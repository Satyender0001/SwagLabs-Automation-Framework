package newtrysaucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    // Method jo check out ki screen par details fill karega
    public static void fillDetails(WebDriver driver, String firstName, String lastName, String postalCode) throws InterruptedException {
        driver.findElement(By.name("firstName")).sendKeys(firstName);
        Thread.sleep(200);
        driver.findElement(By.id("last-name")).sendKeys(lastName);
        Thread.sleep(200);
        driver.findElement(By.id("postal-code")).sendKeys(postalCode);
        Thread.sleep(200);
    }
}