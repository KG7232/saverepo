import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	static WebDriver driver;
	
	public static void browseropen() throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kunal\\new eclipse-workspace\\ProUsa\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get(UtilityClass.getPropertyFileData("url"));
		
		
		
	}

}
