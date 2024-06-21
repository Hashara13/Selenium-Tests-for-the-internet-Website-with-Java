package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homepage {
	private	WebDriver driverobj;
private By authenticationlink=By.linkText("Form Authentication");
	public Homepage(WebDriver driverobj)
{
		this.driverobj=driverobj;
}
	public Loginpage clickFormAuth() {
driverobj.findElement(authenticationlink).click();
return new Loginpage(driverobj);
}
}
