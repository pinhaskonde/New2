package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

    public HomePage(WebDriver wd) {
        super(wd);
    }

    @FindBy(xpath = "//button[@id='register']")
    WebElement element;

    public void openRegForm() {
        element.click();
    }


}
