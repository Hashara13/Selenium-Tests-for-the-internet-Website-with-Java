package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeepDOM {
	   private WebDriver driverobj;
	    private By table = By.id("large-table");
	    private By loadText = By.id("finish");
	    		
	  

	    public DeepDOM(WebDriver driverobj) {
	    	   this.driverobj = driverobj;
	    }
	    public void Scrool() {
	    	WebElement obj=driverobj.findElement(table);
	    	String JsScript="aeguments[0].scrollIntoView();";
	    	((JavascriptExecutor)driverobj).executeScript(JsScript, obj);
	    }
}
