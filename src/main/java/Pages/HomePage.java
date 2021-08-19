package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public loginPage clickFormAuthentication(){
    ClickLink("Form Authentication");
   return new loginPage(driver);
    }

    public DropdownPage clickDropdown(){
        ClickLink("Dropdown");
        return new DropdownPage(driver);

    }
    public HoversPage clickHovers(){
        ClickLink("Hovers");
        return new HoversPage (driver);
    }

    public KeyPressesPage clickKeyPresses(){
        ClickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public horizontalSliderPage clickHorizontalSlider(){
        ClickLink("Horizontal Slider");
        return new horizontalSliderPage (driver);

    }
    public AlertsPage clickJavaScriptAlerts(){
        ClickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }
    public UploadPage clickUploadPage(){
        ClickLink("File Upload");
        return new UploadPage(driver);
    }

    public ModalPage clickModaPage(){
        ClickLink("Context Menu");
        return new ModalPage(driver);
    }
    public FramePage clickFramePage(){
        ClickLink("WYSIWYG Editor");
        return new FramePage(driver);
    }

    public nFramesPage clickNestedFramesPage(){
        ClickLink("Frames");
        return new nFramesPage(driver);
    }



    public ForgotPassPage clickForgotpassword(){
        ClickLink("Forgot Password");
        return new ForgotPassPage(driver);
    }

    private void ClickLink(String LinkText){
        driver.findElement(By.linkText(LinkText)).click();

    }

}
