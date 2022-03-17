package pages;

import elements.DropDownList;
import elements.InputField;
import io.qameta.allure.Step;
import models.SalesForceAccountModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage extends BasePage {

    private By SEARCH_INPUT = By.xpath("//article[contains(., 'New Account')]//label[contains(., 'Account Name')]/following-sibling::div//input");
    private By SAVE_BUTTON = By.xpath("//button[@title='Save']");

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    @Step("Fill in the fields with data")
    public void saveNewAccountForm(SalesForceAccountModel accountModel) {
        driver.findElement(SEARCH_INPUT).sendKeys(accountModel.getAccountName());
        new InputField(driver, "Phone").inputText(accountModel.getPhone());
        new InputField(driver, "Fax").inputText(accountModel.getFax());
        new InputField(driver, "Website").inputText(accountModel.getWebsite());
        new DropDownList(driver, "Type").selectOption(accountModel.getType());
        new DropDownList(driver, "Industry").selectOption(accountModel.getIndustry());
        new InputField(driver, "Employees").inputText(accountModel.getEmployees());
        new InputField(driver, "Annual Revenue").inputText(accountModel.getAnnualRevenue());
        new InputField(driver, "Description").inputTextIntoTextField(accountModel.getDescription());
        new InputField(driver,"Billing Street").inputTextIntoTextField(accountModel.getBillingStreet());
        new InputField(driver,"Shipping Street").inputTextIntoTextField(accountModel.getShippingStreet());
        new InputField(driver,"Billing City").inputText(accountModel.getBillingCity());
        new InputField(driver,"Billing State/Province").inputText(accountModel.getBillingState());
        new InputField(driver,"Billing Zip/Postal Code").inputText(accountModel.getBillingZip());
        new InputField(driver, "Billing Country").inputText(accountModel.getBillingCountry());
        new InputField(driver, "Shipping City").inputText(accountModel.getShippingCity());
        new InputField(driver, "Shipping State/Province").inputText(accountModel.getShippingState());
        new InputField(driver, "Shipping Zip/Postal Code").inputText(accountModel.getShippingZip());
        new InputField(driver, "Shipping Country").inputText(accountModel.getShippingCountry());
        driver.findElement(SAVE_BUTTON).click();
    }
}
