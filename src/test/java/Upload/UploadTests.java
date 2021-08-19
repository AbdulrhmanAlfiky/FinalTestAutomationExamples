package Upload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class UploadTests extends BaseTests {

    @Test
    public void TestUpload(){
        var UploadPage = homePage.clickUploadPage();
        UploadPage.UploadFile("C:\\Users\\eltanany shop\\Desktop\\Test Projects\\Resources\\chromedriver.exe");
        assertEquals(UploadPage.getUploadedFiles(),"chromedriver.exe","Upload faild");

    }
}
