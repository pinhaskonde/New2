package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.FirstRegPage;
import pages.HomePage;

public class Testes extends TestBase {

//    protected User user;
    protected HomePage homePage;
    protected FirstRegPage firstRegPage;

    User userForTest = new User("Barak","Obama",
            "345119911","972544298722",
            "","");

    @Test
    public void startTest() throws InterruptedException{
        wd.get(webPage);
        homePage = PageFactory.initElements(wd,HomePage.class);
        homePage.openRegForm();
        firstRegPage.fillRegForm("");
    }

}
