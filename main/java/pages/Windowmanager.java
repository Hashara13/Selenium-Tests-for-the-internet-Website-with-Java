package pages;

import org.openqa.selenium.WebDriver;

public class Windowmanager {
    private WebDriver driverobj;
    private WebDriver.Navigation navigate;

    public Windowmanager(WebDriver driverobj) {
        this.driverobj = driverobj;
        this.navigate = driverobj.navigate();
    }

    public void back() {
        navigate.back();
    }

    public void forward() {
        navigate.forward();
    }

    public void refresh() {
        navigate.refresh();
    }

    public void go(String url) {
        navigate.to(url);
    }
}
