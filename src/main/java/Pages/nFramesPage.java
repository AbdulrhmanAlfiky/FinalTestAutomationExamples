package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class nFramesPage {

    private WebDriver driver;
    private By NestedButton = By.linkText("Nested Frames");

    public nFramesPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickNestedFrames(){
        driver.findElement(NestedButton).click();
    }
}
