package Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;

    private LoginPage loginPage;
    private ForgotPasswordPage forgotPasswordPage;
    private AddUsers addUsers;

    public PageFactory(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage getLoginPage(){
        if(loginPage == null){
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }

    public ForgotPasswordPage getForgotPasswordPage(){
        if(forgotPasswordPage == null){
            forgotPasswordPage = new ForgotPasswordPage(driver);
        }
        return forgotPasswordPage;
    }

    public AddUsers getAddUsers(){
        if(addUsers == null){
            addUsers = new AddUsers(driver);
        }
        return addUsers;
    }
}
