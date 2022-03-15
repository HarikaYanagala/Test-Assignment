import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "C:\\Browser Drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://buggy.justtestit.org/");
		driver.manage().window().maximize();
		driver.findElement(By.className("btn-success-outline")).click();

	}

}
