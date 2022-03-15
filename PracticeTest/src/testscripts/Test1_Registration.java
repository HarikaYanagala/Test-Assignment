package testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import  pages.RegistrationPage;

public class Test1_Registration {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		buggycarspage();
	}
	
	public static void buggycarspage() {

        System.setProperty("webdriver.chrome.driver", "C:\\Browser Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://buggy.justtestit.org/");
		driver.manage().window().maximize();
		
		//Registering the account with all the fields
		
		RegistrationPage.registration_button(driver).click();
		RegistrationPage.login_name(driver).sendKeys("HarikaYanagala4");
		RegistrationPage.first_name(driver).sendKeys("Harika");
		RegistrationPage.last_name(driver).sendKeys("Yanagala");
		RegistrationPage.password(driver).sendKeys("Har*39udh");
		RegistrationPage.confirm_password(driver).sendKeys("Har*39udh");
		RegistrationPage.register(driver).click();
		
	}

}
