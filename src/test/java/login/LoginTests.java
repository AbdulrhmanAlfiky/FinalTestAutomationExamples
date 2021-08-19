package login;

import Pages.loginPage;
import Pages.secureAreaPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {
@Test
    public void testsuccessfullogin(){
      var loginPage =  homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setpassword("SuperSecretPassword!");
        secureAreaPage SecureAreaPage =  loginPage.clickLoginButton();
       assertTrue(SecureAreaPage.getAlertText().contains("You logged into a secure area!"),
               "Alert text is incorrect");


    }
}
