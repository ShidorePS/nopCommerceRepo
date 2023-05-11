package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {
	
	WebDriver driver;
	
	public ShoppingCart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	WebElement shopping_cart;
	
	@FindBy(xpath="//button[@name='continueshopping']")
	WebElement continue_shopping;
	
	public void ShoppingCrt() throws InterruptedException
	{	
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(shopping_cart).click().build().perform();
		//shopping_cart.click();
	}
	public void ContinueShopping()
	{
		continue_shopping.click();
	}
	

}
