package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

public class CheckHover {
    private WebDriver driverobj;
    private By figbox = By.className("figure");

    public CheckHover(WebDriver driverobj) {
        this.driverobj = driverobj;
    }

    public void checkHover(int index) {
        List<WebElement> figures = driverobj.findElements(figbox);
        if (index > 0 && index <= figures.size()) {
            WebElement figure = figures.get(index - 1);
            Actions actionObj = new Actions(driverobj);
            actionObj.moveToElement(figure).perform();
        } else {
            System.out.println("Index out of bounds");
        }
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\Selenium\\Browser drivers\\geckodriver.exe");
        WebDriver driverobj = new FirefoxDriver();
        driverobj.get("https://the-internet.herokuapp.com/hovers");

        CheckHover checkHoverObj = new CheckHover(driverobj);
        checkHoverObj.checkHover(1);

        driverobj.quit();
    }
}
