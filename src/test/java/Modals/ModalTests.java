package Modals;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ModalTests extends BaseTests {

    @Test
    public void RightClickTest(){
        var MenuPage = homePage.clickModaPage();
        MenuPage.rightBoxClick();
        String message = MenuPage.GetPopUpText();
        MenuPage.acceptPopUp();
        assertEquals(message,"You selected a context menu", "Popup message incorrec");
    }
}
