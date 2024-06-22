package base;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.netty.handler.codec.http.Cookie;
import pages.FrameTest;
import pages.JsAlerts;
import pages.Windowmanager;

public class TestClass {
    private WebDriver driver;
    private JsAlerts jsAlertsPage;
    private FrameTest testframe;
    private Windowmanager navTest;

    public static void main(String[] args) {
    	TestClass example = new TestClass();
        example.getSS();
    }
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\Selenium\\Browser drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        jsAlertsPage = new JsAlerts(driver);
        testframe = new FrameTest(driver);
        navTest = new Windowmanager(driver);
  jsAlertsPage = new JsAlerts(driver);
  setcookies();
      driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }
    
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    
    @Test
    public void testJsAlertAccept() {
        jsAlertsPage.findAlert();
        jsAlertsPage.findAlertsms();FrameTest
        
    }
    @Test
    public void testJsTestArea() {
    	testframe.clearText();
    	testframe.switchEdit();
    	testframe.switchEdit();
    	testframe.switchMain();
        
    }
    
    @AfterMethod
  public void getSS() {
    	  driver.get("https://www.google.com/");
    	  TakesScreenshot cam = (TakesScreenshot) driver;
    	  File destFile = new File("screenshot.png");
    File screenshot = cam.getScreenshotAs(OutputType.FILE);
    System.out.println("Screenshot taken and saved as screenshot.png"+screenshot+""+destFile);
//    FileHandler.copy(screenshot, destFile);
   }
    
 
    @Test
    public void testNavigation() {
        navTest.back();
        navTest.refresh();
        navTest.go("https://www.google.com/");
    }
    
    private void setcookies() {
       driver.get("https://the-internet.herokuapp.com/");
        
        Cookie add = new Cookie.Builder("Hashara", "012")
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(add);

        
        Cookie retrievedCookie = driver.manage().getCookieNamed("Hashara");
        System.out.println("Cookie: " + retrievedCookie);
    	
    }
}
