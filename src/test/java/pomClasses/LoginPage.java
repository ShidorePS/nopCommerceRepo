package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//a[@class='ico-login']")
	WebElement login_txt;
	
	@FindBy(xpath="//input[@name='Email']")
	WebElement email_field;
	
	@FindBy(xpath="//input[@name='Password']")
	WebElement password_field;
	
	@FindBy(xpath="//button[@class='button-1 login-button']")
	WebElement login_btn;
	
	
	public void LoginTxt()
	{
		login_txt.click();
	}
	public void EmailField()
	{
		email_field.click();
		email_field.sendKeys("poonamshidore93@gmail.com");
	}
	public void PasswordField()
	{
		password_field.click();
		password_field.sendKeys("Queen@12345");
	}
	public void LoginBtn()
	{
		login_btn.click();
	}
	
}
