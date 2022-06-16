import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[1]/a/p")private WebElement DB;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	public String VerifyTextHPage() {
		String actresult = DB.getText();
		return actresult;
		
	}
	
	public void ClickDB() {
		
		DB.click();
	}

}

	
	
