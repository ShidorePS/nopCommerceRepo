package pomClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Computers {
	
	WebDriver driver ;
	
	public Computers(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/computers']")
	WebElement computer_txt;
	
	@FindBy(xpath="//img[@alt='Picture for category Notebooks']")
	WebElement notebook;
	
	@FindBy(xpath="//h2[@class=\"product-title\"]//a")
	WebElement mac_book;
	
	@FindBy(xpath="//input[@id='product_enteredQuantity_4']")
	WebElement quantity;
	
	@FindBy(xpath="//button[@id='add-to-cart-button-4']")
	WebElement addTo_cart;
	
	public void Computer()
	{
		computer_txt.click();
	}
	public void Notebook()
	{
		notebook.click();
	}
	public void MacBook() 
	{
		Actions act = new Actions(driver);
		
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		 // List<WebElement> optionList = driver.findElements(By.xpath("xPath to list of elements"));
		 // int lastElement = (optionList.size() - 1);
		javascriptExecutor.executeScript("window.scrollBy(0,300)");
		
		mac_book.click();
			/*
			 * act.moveToElement(mac_book).perform(); act.click().perform();
			 */
	  //mac_book.click();
	}
	public void Quantity() 
	{
		//quantity.click();
		quantity.clear();
		quantity.sendKeys("3");
	}
	public void AddToCart()
	{
		addTo_cart.click();
	}
}
