package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstRegPage extends PageBase {

    public FirstRegPage(WebDriver wd) {
        super(wd);
    }

    @FindBy(xpath = "//input[@id='firstname']")
    WebElement firstname;
    @FindBy(xpath = "//input[@id='lastname']")
    WebElement lastname;
    @FindBy(xpath = "//input[@id='personalId']")
    WebElement personalId;
    @FindBy(xpath = "//input[@id='phone']")
    WebElement phone;
    @FindBy(xpath = "//input[@id='dateOfBirth']")
    WebElement dateOfBirth;

    @FindBy(css = ".gender.male.h5.col-4.py-2.px-0.box-select")
    WebElement genderMale;
    @FindBy(css = ".gender.female.h5.col-4.py-2.px-0.box-select")
    WebElement genderFemale;
    @FindBy(css = ".gender.other.h5.col-4.py-2.px-0.box-select")
    WebElement genderOther;

    @FindBy(xpath = "//input[@id='agreeTerms']")
    WebElement agreeTerms;

    @FindBy(css = ".button-big.button-active")
    WebElement buttonActive;


    public FirstRegPage fillRegForm(String firstName) {
        firstname.click();
        firstname.clear();
        firstname.sendKeys();
        return this;
    }


}
