package Login;

import base.TestClass;
import pages.Loginpage;
import pages.secure;

public class LoginTest extends TestClass{
public void testlogin() {
	Loginpage loginobj= homePage.clickFormAuth();
	loginobj.setId("hashara");
	loginobj.setUser("myadminuser");
	loginobj.clicklogbut();
}
}
