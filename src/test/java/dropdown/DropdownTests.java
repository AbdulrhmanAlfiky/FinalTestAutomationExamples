package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption(){
        var dropDownPage= homePage.clickDropdown();
        String option = "Option 2";
        dropDownPage.selectFromDropDown(option);
        var SelectedOptions = dropDownPage.getSelectOptions();
     assertEquals(SelectedOptions.size(),1,"incorrect number of selections");
     assertTrue(SelectedOptions.contains(option),"Option not selected ");
    }
}
