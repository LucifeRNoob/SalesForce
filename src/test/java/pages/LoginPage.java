package pages;

import io.qameta.allure.Step;
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

    @Step("Open 'https://nordas.my.salesforce.com/' url")
    public void openPage() {
        driver.get(WebUrls.SALESFORCE_URL);
    }

    @Step("Login in Salesforce with valid credentials")
    public void login (){
        driver.findElement(USERNAME_INPUT).sendKeys(UserCredentials.USER_NAME);
        driver.findElement(PASSWORD).sendKeys(UserCredentials.PASSWORD);
        driver.findElement(LOGIN_BUTTON).click();
    }
}
