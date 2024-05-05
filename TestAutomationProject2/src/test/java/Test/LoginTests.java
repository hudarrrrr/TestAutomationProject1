package Test;

import Base.BaseTest;
import Pages.LoginPage;
import Pages.SecureAreaPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest
{
    @Test
    public void testSuccessfullLogin()
    {
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");

        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        secureAreaPage.getAlertText();

        Assert.assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area"));
    }
}
