package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeyPress {
    private WebDriver driverobj;
    private By input = By.id("target");
    private By result = By.id("result");

    public KeyPress(WebDriver driverobj) {
        this.driverobj = driverobj;
    }

    public void inputText(String text) {
        driverobj.findElement(input).sendKeys(text);
    }

    public String getResult() {
        return driverobj.findElement(result).getText();
    }

    public void pressBackspace() {
        WebElement inputField = driverobj.findElement(input);
        inputField.sendKeys(org.openqa.selenium.Keys.BACK_SPACE);
    }
}
