package newtrysaucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Saucedemotry {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(500);

		// ==================== SCENARIO 1: standard_user ====================
		LoginPage.loginUser(driver, "standard_user", "secret_sauce");
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(300);
		driver.findElement(By.className("shopping_cart_link")).click();
		driver.findElement(By.name("checkout")).click();
		Thread.sleep(500);
		
		CheckoutPage.fillDetails(driver, "Satyender", "chaurasiya", "121003");
		
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("finish")).click();
		driver.findElement(By.name("back-to-products")).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(300);
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(300);

		// ==================== SCENARIO 2: problem_user ====================
		LoginPage.loginUser(driver, "problem_user", "secret_sauce");
		
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(300);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(300);
		
		CheckoutPage.fillDetails(driver, "Satyender", "chaurasiya", "121003");
		
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("cancel")).click();
		driver.findElement(By.id("continue-shopping")).click();
		Thread.sleep(300);
		driver.findElement(By.name("remove-sauce-labs-backpack")).click();
		Thread.sleep(300);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(500);
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(500);

		// ==================== SCENARIO 3: performance_glitch_user ====================
		LoginPage.loginUser(driver, "performance_glitch_user", "secret_sauce");
		
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(200);
		driver.findElement(By.className("shopping_cart_link")).click();
		driver.findElement(By.name("checkout")).click();
		Thread.sleep(200);
		
		CheckoutPage.fillDetails(driver, "Satyender", "chaurasiya", "121003");
		
		driver.findElement(By.id("continue")).click();
		Thread.sleep(200);
		driver.findElement(By.name("finish")).click();
		driver.findElement(By.name("back-to-products")).click();
		Thread.sleep(500);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(200);
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(200);

		// ==================== SCENARIO 4: error_user ====================
		LoginPage.loginUser(driver, "error_user", "secret_sauce");
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(300);
		driver.findElement(By.className("shopping_cart_link")).click();
		driver.findElement(By.name("checkout")).click();
		Thread.sleep(200);
		
		CheckoutPage.fillDetails(driver, "Satyender", "chaurasiya", "121003");
		
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("finish")).click();
		Thread.sleep(200);
		driver.findElement(By.name("cancel")).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(200);
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(200);

		// ==================== SCENARIO 5: visual_user ====================
		LoginPage.loginUser(driver, "visual_user", "secret_sauce");
		
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(300);
		driver.findElement(By.className("shopping_cart_link")).click();
		driver.findElement(By.name("checkout")).click();
		Thread.sleep(200);
		
		CheckoutPage.fillDetails(driver, "Satyender", "chaurasiya", "121003");
		
		driver.findElement(By.id("continue")).click();
		Thread.sleep(200);
		driver.findElement(By.id("finish")).click();
		driver.findElement(By.name("back-to-products")).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(200);
		driver.findElement(By.id("logout_sidebar_link")).click();
		
		driver.quit();
	}
}