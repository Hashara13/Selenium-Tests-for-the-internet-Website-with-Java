package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JsAlerts {
    private WebDriver driverobj;
    private By triggerA = By.xpath("//button[text()='Click for JS Alert']\r\n");
    		
  

    public JsAlerts(WebDriver driverobj) {
        this.driverobj = driverobj;
    }
    public void findAlert() {
        driverobj.findElement(triggerA).click();
    }
    public void findAlertsms() {
        driverobj.switchTo().alert().accept();
    }

}
