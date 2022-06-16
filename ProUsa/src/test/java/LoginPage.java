import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//@FindBy(xpath="//input[@class='email valid']")private WebElement UN;
	
	//@FindBy(xpath="//input[@class='password valid']")private WebElement PWD;
	
	@FindBy(xpath="//button[contains(text(),'Log in')]")private WebElement LN;
	
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	

	/*public void EnterUserName(String username) {
		UN.sendKeys(username);
	}
	
	public void EnterPassword(String password) {
		
		PWD.sendKeys(password);
		
	}*/
	public void clickloginbtn() {
		LN.click();
	}

}
