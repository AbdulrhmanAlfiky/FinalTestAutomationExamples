package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadPage {
    private WebDriver driver;
    private By inputField = By.id("file-upload");
    private By Button = By.id("file-submit");
    private By UploadedFiles = By.id("uploaded-files");

    public UploadPage(WebDriver driver){
        this.driver=driver;
    }

    public void ClickUploadButton(){
        driver.findElement(Button).click();

    }

    public void UploadFile(String absolutePathOfFile){
        driver.findElement(inputField).sendKeys(absolutePathOfFile);
    ClickUploadButton();
    }

    public String getUploadedFiles(){
        return driver.findElement(UploadedFiles).getText();
    }
}
