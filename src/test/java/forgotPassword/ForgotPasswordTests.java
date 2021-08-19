package forgotPassword;

import Pages.ForgotPassPage;
import Pages.HomePage;
import base.BaseTests;
import org.testng.annotations.Test;

public class ForgotPasswordTests extends BaseTests {
      @Test
      public void testForgotPassword(){
        var forgotPassPage = homePage.clickForgotpassword();
        forgotPassPage.setEmail("abdulrhmanfouadalfiky@gmail.com");
        forgotPassPage.clickButton();
    }

}
