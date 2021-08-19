package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    private WebDriver driver;

    private  String leftFrame = "frame-left";
    private  String BottomFrame = "frame-bottom";
    private  String TopFrame = "frame-top";
   private By BodyName = By.tagName("body");


    public NestedFramesPage(WebDriver driver){
        this.driver= driver;
    }

    public String getLeftFrameText(){
        driver.switchTo().frame(TopFrame);
        driver.switchTo().frame(leftFrame);
        String text = getFrameText();
        driver.switchTo().parentFrame();  // return to top frame
        driver.switchTo().parentFrame(); //return to main frame
return text;
    }


    public String getBottomFrameText(){
        driver.switchTo().frame(BottomFrame);
        String text = getFrameText();
        driver.switchTo().parentFrame(); //return to main frame
return text;
    }



    private String getFrameText(){
        return driver.findElement(BodyName).getText();
    }



}
