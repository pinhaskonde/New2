package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.HomePage;

public class TestBase {
    String webPage = "http://students-aid.org:9222/platforms/nuis/";
    protected HomePage homePage;
    protected WebDriver wd;

    @BeforeSuite
    public void init() {
        wd = new ChromeDriver();
        homePage = PageFactory.initElements(wd, HomePage.class);
//        wd.manage().window().maximize();
    }

    @AfterSuite
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        wd.quit();
    }

}
