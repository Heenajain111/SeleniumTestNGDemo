package com.servlet.demo;


import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		

public class NewTest {
	
	public static void main(String[] args) {
		
	 System.setProperty("webdriver.gecko.driver", "D:\\softwares\\geckodriver.exe");
	 
	 WebDriver driver =new FirefoxDriver();
	 
		/*@Test				
		public void testEasy() {	
			driver.get("http://demo.guru99.com/test/guru99home/");  
			String title = driver.getTitle();				 
			AssertJUnit.assertTrue(title.contains("Demo Guru99 Page")); 		
		}	
		@BeforeTest
		public void beforeTest() {	
		    driver = new FirefoxDriver();  
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}
*/ 
	}
}
