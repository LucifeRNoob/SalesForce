package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.CreateAccountPage;
import pages.LoginPage;
import testdata.GetNewAccountModel;

public class SalesForceAccountTest extends BaseTest {

    @Test
    public void createAccountTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.login();
        AccountsPage accountsPage = new AccountsPage(driver);
        accountsPage.openAccountTab();
        accountsPage.openCreateAccountModal();
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.saveNewAccountForm(GetNewAccountModel.getAccountWithAllFields());
        Assert.assertTrue(accountsPage.successMessage(),"Message is not shown");
    }
}
