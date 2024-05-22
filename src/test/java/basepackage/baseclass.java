package basepackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class baseclass  
{
	public static ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
	driver=new ChromeDriver();
	driver.get("https://www.amukti.in/account/login");
	driver.manage().window().maximize();
	}

}
