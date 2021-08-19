package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    public WebDriver driver;
    private By dropdown = By.id("dropdown");

 public DropdownPage(WebDriver driver){
     this.driver=driver;
 }

public void selectFromDropDown(String option){

    FindDropDownElement().selectByVisibleText(option);
}

public List<String> getSelectOptions(){
    List<WebElement> selectedElements =
        FindDropDownElement().getAllSelectedOptions();
return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
}
private Select FindDropDownElement(){
     return new Select(driver.findElement(dropdown));
}

}
