package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FrameTest {
	   private WebDriver driverobj;
	    private String frameId = "mce_0_ifr";
	    private By cleratExt = By.id("tinymce");
	    		
	  

	    public FrameTest(WebDriver driverobj) {
	        this.driverobj = driverobj;
	    }
	    
	    public void switchtoFrame() {
	    	driverobj.switchTo().frame(frameId);
	    }
	    public void clearText() {
	    	switchEdit();
	    	driverobj.findElement(cleratExt).clear();
	    	switchMain();
	    }
	    public void setText(String entertext) {
	    	switchEdit();
	    	driverobj.findElement(cleratExt).clear();
	    	switchMain();
	    }
	    public void switchEdit() {
	    	driverobj.switchTo().frame(frameId);
	    }
	    public void switchMain() {
	    	driverobj.switchTo().parentFrame();
	    }
}
