package Test;

import org.testng.annotations.Test;

public class LogoutModule extends BaseTest {

    @Test(dataProvider="WebsiteLoginData")
    public void Logout(String url, String username, String password) throws InterruptedException {
        pageFactory.getLoginPage().Login(url, username, password);
        pageFactory.getLoginPage().Logout();
    }
}