package testpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import basepackage.baseclass;
import pagepackage.pageclass;
import testpackage.testclass;

import utilities.excelutils;


	public class testclass extends baseclass 
	{
		@Test(priority =1)
		public void verifyLoginWithValidCred () throws Exception

		{
		            pageclass p = new pageclass(driver);
		            String xl = "D:\\Users\\Abida\\Desktop\\Amuktixcel.xlsx";
		            String Sheet = "Sheet1";
		            int rowCount = excelutils.getRowCount(xl, Sheet);
		            for (int i=1;i<=rowCount;i++)

		            {

		                        String UserName=excelutils.getCellValue(xl, Sheet, i, 0);
	                            System.out.println("username---"+UserName);
		                        String Pwd=excelutils.getCellValue(xl, Sheet, i, 1);
	                            System.out.println("password---"+Pwd);
		                     
		                        p.setvalues(UserName, Pwd);
		                        p.login();
		                        
		                        
		                		                        
}
}
		@Test(priority =2)
		public void kurta() throws Exception
		{
			pageclass p = new pageclass(driver);
			p.logo();
			Thread.sleep(2000);
			p.kurtas();
			Thread.sleep(2000);
			p.kurta1();
			Thread.sleep(2000);
			p.size1();
			Thread.sleep(2000);
			p.count1();
			p.addtocart1();
			Thread.sleep(2000);
		}
		

		@Test(priority =3)
		public void kurtas1() throws Exception
		{
			pageclass p = new pageclass(driver);
			p.kurta2();
			Thread.sleep(2000);
			p.size2();
			Thread.sleep(2000);
			p.count2();
			p.addtocart2();
			Thread.sleep(2000);
		}
		@Test(priority =4)
		public void kurtas2() throws Exception
		{
			pageclass p = new pageclass(driver);
			p.kurta3();
			Thread.sleep(2000);
			p.size3();
			Thread.sleep(2000);
			p.count3();
			p.addtocart3();
			Thread.sleep(2000);
		}
		@Test(priority =5)
		public void purchase() throws Exception
		{
			pageclass p = new pageclass(driver);
			p.cart();
			Thread.sleep(2000);
			p.viewcart();
			Thread.sleep(2000);
			p.checkout();
			Thread.sleep(2000);
			
		}
		
			

					
	}