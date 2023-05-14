package testclass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import basepkg.BaseClass;
import pomClasses.Computers;
import pomClasses.LoginPage;
import pomClasses.Registeration;
import pomClasses.ShoppingCart;

public class AllTestClasses {
	WebDriver driver;
	Registeration r;
	LoginPage login;
	Computers c;
	ShoppingCart sc;

	
	@BeforeClass()
	public void beforeclass()
	{
		driver=BaseClass.Openbrowser();
	}
	@BeforeMethod()
	public void beforemethod()
	{
		r = new Registeration(driver);
		login = new LoginPage(driver);
		c = new Computers(driver);
		sc = new ShoppingCart(driver);
	}
	@Test
	public void test1()
	{
		r.Registertxt();
		r.GenderRadioBtn();
		r.FirstName();
		r.LastName();
		r.Day();
		r.BirthMonth();
		r.Year();
		r.Email();
		r.Company();
		r.Newsletterchkbx();
		r.PassWord();
		r.ConfirmPassword();
		r.RegisterBtn();
		
	}
	@Test(dependsOnMethods = { "test1" })
	public void test2()
	{
		login.LoginTxt();
		login.EmailField();
		login.PasswordField();
		login.LoginBtn();
	}
	@Test(dependsOnMethods = { "test2" })
	public void test3() throws InterruptedException 
	{
		c.Computer();
		c.Notebook();
		Thread.sleep(2000);
 		for (String windowHandle : driver.getWindowHandles()) 
			driver.switchTo().window(windowHandle);
		c.MacBook();
		c.Quantity();
		Thread.sleep(2000);
		c.AddToCart();
	}
	@Test(dependsOnMethods = { "test3" })
	public void test4() throws InterruptedException
	{	
//		Thread.sleep(5000);
//		for (String windowHandle : driver.getWindowHandles()) 
//			driver.switchTo().window(windowHandle);
		sc.ShoppingCrt();
		sc.ContinueShopping();
	}
	
	
	
}
