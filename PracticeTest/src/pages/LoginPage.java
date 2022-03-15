package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
			
		private static WebElement element = null;
		
		public static WebElement login_button(WebDriver driver) {
			
			element = driver.findElement(By.className("btn-success"));
			return element;

		}
		
	    public static WebElement login_field(WebDriver driver) {
			
			element = driver.findElement(By.name("login"));
			return element;

		}
	    
	    public static WebElement password_field(WebDriver driver) {
			
			element = driver.findElement(By.name("password"));
			return element;

		}
	    
}
