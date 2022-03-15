package testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import  pages.LoginPage;

public class Test2_Registration {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login();
	}
	
	public static void login() {

        System.setProperty("webdriver.chrome.driver", "C:\\Browser Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://buggy.justtestit.org/");
		driver.manage().window().maximize();
		
		//Trying to login with valid password and valid login name
		
		LoginPage.login_field(driver).sendKeys("HarikaYanagala");
		LoginPage.password_field(driver).sendKeys("Har*39udh");
		LoginPage.login_button(driver).click();
		
  }
}
