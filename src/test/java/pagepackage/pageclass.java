package pagepackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageclass 
{
	ChromeDriver driver;
	@FindBy(xpath="//*[@id=\"customer-email\"]")
	WebElement Email;
	
	@FindBy(xpath="//*[@id=\"customer-password\"]")
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\"customer_login\"]/div/div[4]/input")
	WebElement login;
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/li[1]/a")
	WebElement kurtas;
	
	@FindBy(xpath="//*[@id=\"main-collection-product-grid\"]/div[1]/div[1]/div[1]/a/div[2]/div[2]/div/img")
	WebElement kurta1;
	
	@FindBy(xpath="//*[@id=\"product-form-template--16632784847036__main\"]/div/div/div[2]/label")
	WebElement size1;
	

	@FindBy(xpath="//*[@id=\"product-form-template--16632784847036__main\"]/div/button[2]")
	WebElement count1;
	

	@FindBy(xpath="//*[@id=\"sticky-cart\"]/div[3]/input[2]")
	WebElement addtocart1;
	
	@FindBy(xpath="//*[@id=\"logo\"]/a/img")
	WebElement logo;
	
	@FindBy(xpath="//*[@id=\"main-collection-product-grid\"]/div[2]/div[2]/div/h3/a")
	WebElement kurta2;
	
	@FindBy(xpath="//*[@id=\"product-form-template--16632784847036__main\"]/div/div/div[2]/label")
	WebElement size2;
	

	@FindBy(xpath="//*[@id=\"product-form-template--16632784847036__main\"]/div/button[2]")
	WebElement count2;
	

	@FindBy(xpath="//*[@id=\"product-form-template--16632784847036__main\"]/div/input[3]")
	WebElement addtocart2;
	
	@FindBy(xpath="//*[@id=\"main-collection-product-grid\"]/div[3]/div[2]/div/h3/a")
	WebElement kurta3;
	
	@FindBy(xpath="//*[@id=\"product-form-template--16632784847036__main\"]/div/div/div[3]/label")
	WebElement size3;
	

	@FindBy(xpath="//*[@id=\"product-form-template--16632784847036__main\"]/div/button[2]")
	WebElement count3;
	

	@FindBy(xpath="//*[@id=\"product-form-template--16632784847036__main\"]/div/input[3]")
	WebElement addtocart3;
	
	@FindBy(xpath="//*[@id=\"cart\"]/li[3]/div/button/span[1]")
	WebElement cart;
	
	@FindBy(xpath="//*[@id=\"mini-cart\"]/div[3]/form/div[2]/div[2]/div[2]/a")
	WebElement viewcart;
	
	@FindBy(xpath="//*[@id=\"sticky-cart\"]/form/div[3]")
	WebElement checkout;
	
	
	
	
	
	

	
	
	public pageclass(ChromeDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}

	public void setvalues(String email,String paswd)
	{
		Email.clear();
		Email.sendKeys(email);
		password.clear();
		password.sendKeys(paswd);
	}
	
	public void login()
	{
		login.click();
	}
	
	public void kurtas()
	{
		kurtas.submit();
	}
	
	public void kurta1()
	{
		kurta1.click();
	}
	
	public void size1()
	{
		size1.click();
	}
	
	public void count1()
	{
		count1.click();
	}
	
	public void addtocart1()
	{
		addtocart1.click();
	}
	
	public void logo()
	{
		logo.click();
	}
	public void kurta2()
	{
		kurta2.click();
	}
	
	public void size2()
	{
		size2.click();
	}
	
	public void count2()
	{
		count2.click();
	}
	
	public void addtocart2()
	{
		addtocart2.click();
	}
	
	public void kurta3()
	{
		kurta3.click();
	}
	
	public void size3()
	{
		size3.click();
	}
	
	public void count3()
	{
		count3.click();
	}
	
	public void addtocart3()
	{
		addtocart3.click();
	}
	public void cart()
	{
		cart.click();
	}
	public void viewcart()
	{
		viewcart.click();
	}
	public void checkout()
	{
		checkout.click();
	}
	}

	

