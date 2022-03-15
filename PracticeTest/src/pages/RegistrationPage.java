package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
		
	private static WebElement element = null;
	
	public static WebElement registration_button(WebDriver driver) {
		
		element = driver.findElement(By.className("btn-success-outline"));
		return element;

	}
	
    public static WebElement login_name(WebDriver driver) {
		
		element = driver.findElement(By.name("username"));
		return element;

	}
    
    public static WebElement first_name(WebDriver driver) {
		
		element = driver.findElement(By.name("firstName"));
		return element;

	}
    
    public static WebElement last_name(WebDriver driver) {
		
		element = driver.findElement(By.name("lastName"));
		return element;

	}
    
    public static WebElement password(WebDriver driver) {
		
		element = driver.findElement(By.id("password"));
		return element;

	}
    
    public static WebElement confirm_password(WebDriver driver) {
		
		element = driver.findElement(By.name("confirmPassword"));
		return element;

	}
    
    public static WebElement register(WebDriver driver) {
		
		element = driver.findElement(By.className("btn-default"));
		return element;

	}

}
