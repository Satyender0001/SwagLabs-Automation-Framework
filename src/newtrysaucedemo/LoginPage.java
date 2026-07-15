package newtrysaucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    
    // Method jo username aur password lekar login click karega
    public static void loginUser(WebDriver driver, String username, String password) throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys(username);
        Thread.sleep(300);
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(300);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(300);
    }
}