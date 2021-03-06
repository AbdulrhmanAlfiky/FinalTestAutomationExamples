package FrameTests;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class FrameTextTest extends BaseTests {

@Test
    public void EnterText(){
    var editorPage = homePage.clickFramePage();
    editorPage.clearTextArea();

    String text1 = "Hello";
    String text2 = "World";

    editorPage.setTextArea(text1);
    editorPage.decreaseIndention();
    editorPage.setTextArea(text2);

    assertEquals(editorPage.getTextFromEditor(),text1+text2,"Text from editor is incorrect");

   }
}
