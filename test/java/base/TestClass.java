package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FrameTest;
import pages.JsAlerts;

public class TestClass {
    private WebDriver driver;
    private JsAlerts jsAlertsPage;
    private FrameTest testframe;
    
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\Selenium\\Browser drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        jsAlertsPage = new JsAlerts(driver);
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
}
