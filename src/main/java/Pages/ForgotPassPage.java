package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassPage {
    private WebDriver driver;
    private By emailField = By.id("email");
    private By retrievePass = By.id("form_submit");

    public  ForgotPassPage(WebDriver driver){
        this.driver = driver;
    }

    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void clickButton(){
        driver.findElement(retrievePass).click();
    }
}
