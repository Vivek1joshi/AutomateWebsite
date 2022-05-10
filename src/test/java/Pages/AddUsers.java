package Pages;

import Configuration.ExtentLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUsers {
    WebDriver driver;

    @FindBy(xpath="//b[contains(text(),'Admin')]")
    private WebElement Admin;

    @FindBy(id="menu_admin_UserManagement")
    private WebElement User_Management;

    @FindBy(id="menu_admin_viewSystemUsers")
    private WebElement Users;

    @FindBy(id="searchSystemUser_userName")
    private WebElement SearchUser;

    @FindBy(id="searchBtn")
    private WebElement SearchButton;

    @FindBy(id="btnAdd")
    private WebElement AddButton;

    @FindBy(xpath="//*[@id=\"systemUser_userType\"]")
    private WebElement userRole;

    @FindBy(name="systemUser[employeeName][empName]")
    private WebElement empName;

    @FindBy(name="systemUser[userName]")
    private WebElement userName;

    @FindBy(name="systemUser[status]")
    private WebElement empStatus;

    @FindBy(name="systemUser[password]")
    private WebElement userPass;

    @FindBy(name="systemUser[confirmPassword]")
    private WebElement userConfirmPass;

    @FindBy(name="btnSave")
    private WebElement saveBtn;

    public AddUsers(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void ClickOnUser(){
        Admin.click();
        ExtentLogger.pass("Clicked on admin icon");
        User_Management.click();
        ExtentLogger.pass("Clicked on user management option");
        Users.click();
        ExtentLogger.pass("Clicked on users.");
    }

    public void SearchUser(String user){
        SearchUser.sendKeys(user);
        ExtentLogger.pass("Searched user :-"+ user);
        SearchButton.click();
        ExtentLogger.pass("Clicked on search button.");
    }

    public void AddUser(){
        AddButton.click();
        ExtentLogger.pass("Clicked on add button.");

        WebElement role = userRole;
        role.sendKeys(Keys.ARROW_DOWN);
        role.sendKeys("Admin");
        ExtentLogger.pass("Select the user role.");


    }
}