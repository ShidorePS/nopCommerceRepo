package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registeration {
	
	public WebDriver driver;
	
	public Registeration(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='ico-register']")
	WebElement resgister_txt;
	
	@FindBy(xpath="//input[@id='gender-female']")
	WebElement gender_radiobtn;
	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement first_name;
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement last_name;
	
	@FindBy(xpath="//select[@name='DateOfBirthDay']")
	WebElement day;
	
	@FindBy(xpath="//select[@name='DateOfBirthMonth']")
	WebElement birthMonth;
	
	@FindBy(xpath="//select[@name='DateOfBirthYear']")
	WebElement year;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='Company']")
	WebElement company_name;
	
	@FindBy(xpath="//input[@id='Newsletter']")
	WebElement newsletr_chkbx;
	
	@FindBy(xpath ="//input[@id='Password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	WebElement confirm_passwrd;
	
	@FindBy(xpath="//button[@id='register-button']")
	WebElement register_Btn;
	
	public void Registertxt()
	{
		resgister_txt.click();
	}
	public void GenderRadioBtn()
	{
		gender_radiobtn.click();
	}
	public void FirstName()
	{
		first_name.click();
		first_name.sendKeys("Poonam");
	}
	public void LastName()
	{
		last_name.click();
		last_name.sendKeys("Shidore");
	}
	public void Day() 
	{
		Select s = new Select(day);
		s.selectByIndex(5);
		
	}
	public void BirthMonth()
	{	
		Select k = new Select(birthMonth);
		k.selectByIndex(2);
	}
	public void Year()
	{
		Select q = new Select(year);
		q.selectByValue("1992");
	}
	public void Email()
	{
		email.click();
		email.sendKeys("poonamshidore93@gmail.com");
	}
	public void Company()
	{
		company_name.click();
		company_name.sendKeys("IBM");
	}
	public void Newsletterchkbx()
	{
		newsletr_chkbx.click();
	}
	public void PassWord()
	{
		password.click();
		password.sendKeys("Queen@12345");
	}
	public void ConfirmPassword()
	{
		confirm_passwrd.click();
		confirm_passwrd.sendKeys("Queen@12345");
	}
	public void RegisterBtn()
	{
		register_Btn.click();
	}
	
	
}
