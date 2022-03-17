package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import staticdata.WebUrls;

public class AccountsPage extends BasePage {


    private By NEW_BUTTON = By.xpath("//div[text()='New']");
    private By SUCCESS_MESSAGE = By.xpath("//div[@data-aura-class='forceToastMessage']");

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Find and click on 'Account' tab")
    public void openAccountTab() {
        driver.get(WebUrls.SALESFORCE_ACCOUNTS_URL);
    }

    @Step("Click on 'New' button to open form for creating an account")
    public void openCreateAccountModal() {
        driver.findElement(NEW_BUTTON).click();
    }

    public boolean successMessage() {
        return driver.findElement(SUCCESS_MESSAGE).isDisplayed();
    }
}




