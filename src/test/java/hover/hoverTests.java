package hover;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class hoverTests extends BaseTests {
    @Test
    public void testHoverUser1(){
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(),"Caption is not displayed");
        assertEquals(caption.getTitle(),"name: user1","caption title is incorrect");
        assertEquals(caption.getLinkText(),"View profile","caption limk text is incorrect" );
        assertTrue(caption.getLink().endsWith("/users/1"),"link incorrect");
    }

}
