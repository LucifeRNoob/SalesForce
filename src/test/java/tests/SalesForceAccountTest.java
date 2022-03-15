package tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.CreateAccountPage;
import pages.LoginPage;
import staticdata.UserCredentials;
import testdata.GetNewAccountModel;

public class SalesForceAccountTest extends BaseTest {

    private static final Logger LOGGER = LogManager.getLogger(SalesForceAccountTest.class.getName());

    @Test
    public void createAccountTest() {
        LOGGER.info("Creating account in Salesforce. Accounts test started");
        LoginPage loginPage = new LoginPage(driver);
        LOGGER.info("Try to open Salesforce login page");
        loginPage.openPage();
        LOGGER.info("Login with username: " + UserCredentials.USER_NAME + "and with password: " + UserCredentials.PASSWORD);
        loginPage.login();
        AccountsPage accountsPage = new AccountsPage(driver);
        LOGGER.info("Open 'Accounts' tab " + accountsPage.getClass().getName());
        accountsPage.openAccountTab();
        accountsPage.openCreateAccountModal();
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        LOGGER.debug("Debugging successful message");
        createAccountPage.saveNewAccountForm(GetNewAccountModel.getAccountWithAllFields());
        Assert.assertTrue(accountsPage.successMessage(),"Message is not shown");
    }
}
