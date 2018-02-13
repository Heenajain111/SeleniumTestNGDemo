package com.servlet.demo;

import org.testng.annotations.Test;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TutorialsPointTest {

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
	    driver.get("https://www.google.co.uk/search?dcr=0&source=hp&ei=ciuCWr34Moi4gQbp7qCoDQ&q=tutorialspoint&oq=tutorialspoint&gs_l=psy-ab.3..0l10.33925.39365.0.39748.14.9.0.5.5.0.120.676.8j1.9.0....0...1c.1.64.psy-ab..0.14.718...0i131k1.0.1R7aDro233Y");
	    driver.findElement(By.linkText("TutorialsPoint")).click();
	    driver.findElement(By.xpath("//div[4]/div[5]/div")).click();
	    driver.findElement(By.xpath("//div[4]/div[5]/div")).click();
	    driver.close();
	  }

	/*  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
		  System.setProperty("webdriver.gecko.driver", "D:\\softwares\\geckodriver.exe");
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }*/

/*	  private boolean isElementPresent(By by) {
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
	  }*/

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
