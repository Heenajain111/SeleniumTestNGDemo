package com.servlet.demo;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonTest {

	  private WebDriver driver;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
		  System.setProperty("webdriver.gecko.driver", "D:\\softwares\\geckodriver.exe");
	    driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testUntitledTestCase() throws Exception {
		  System.setProperty("webdriver.gecko.driver", "D:\\softwares\\geckodriver.exe");
	    driver.get("https://www.amazon.com/");
	    driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/span[8]/span")).click();
	    driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[3]/div[8]/div/a[2]/span")).click();
	    driver.findElement(By.xpath("//img[@alt='Ages 3 to 5']")).click();
	    driver.findElement(By.xpath("(//img[@alt='Shop by category'])[2]")).click();
	  }

	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
		  System.setProperty("webdriver.gecko.driver", "D:\\softwares\\geckodriver.exe");
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
		  System.setProperty("webdriver.gecko.driver", "D:\\softwares\\geckodriver.exe");
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
		  System.setProperty("webdriver.gecko.driver", "D:\\softwares\\geckodriver.exe");
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
		  System.setProperty("webdriver.gecko.driver", "D:\\softwares\\geckodriver.exe");
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	

}
