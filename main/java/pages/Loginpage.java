package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	private	WebDriver driverobj;
	private By userId=By.id("username");
	private By pwId=By.id("password");
	private By logbut=By.id("login button");
	

	public Loginpage(WebDriver driverobj)
{
		this.driverobj=driverobj;
}
	
	public void setUser(String username) {
driverobj.findElement(userId).sendKeys(username);

}
	public void setId(String password) {
driverobj.findElement(userId).sendKeys(password);

}
	public secure clicklogbut() {
driverobj.findElement(logbut).click();
return new secure(driverobj);
}
	
	
}
