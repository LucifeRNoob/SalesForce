package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import staticdata.UserCredentials;
import staticdata.WebUrls;

public class LoginPage extends BasePage{

    private By USERNAME_INPUT = By.id("username");
    private By PASSWORD = By.id("password");
    private By LOGIN_BUTTON = By.id("Login");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(WebUrls.SALESFORCE_URL);
    }

    public void login (){
        driver.findElement(USERNAME_INPUT).sendKeys(UserCredentials.USER_NAME);
        driver.findElement(PASSWORD).sendKeys(UserCredentials.PASSWORD);
        driver.findElement(LOGIN_BUTTON).click();
    }
}
