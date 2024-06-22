package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoading {
	   private WebDriver driverobj;
	    private By loadId = By.id("loading");
	    private By loadText = By.id("finish");
	    		
	  

	    public DynamicLoading(WebDriver driverobj) {
	        this.driverobj = driverobj;
	    }
	    public String getLoaderText() {
	       return driverobj.findElement(loadText).getText();
	    }
}
