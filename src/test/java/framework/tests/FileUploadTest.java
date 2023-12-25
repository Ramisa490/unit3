package framework.tests;

import framework.pages.FileUploadPage;
import framework.pages.MainPageNavigation;
import framework.pages.UplodedFilePage;
import framework.utils.SettingsTestData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;


public class FileUploadTest extends BaseTest {
    public final String FILE_NAME = SettingsTestData.getFileData().getUploadFile();
    public final String FILE_PATH = SettingsTestData.RESOURCE_FILE_PATH + FILE_NAME;
    private FileUploadPage fileUploadPage = new FileUploadPage();



    @Test
    public void fileUploadTest()
    {
        mainPage.clickNavigationLink(MainPageNavigation.FILE_UPLOAD);
        FileUploadPage.UploadFile(new File(FILE_PATH).getAbsolutePath());
        FileUploadPage.clicksubmitbtn();
        Assert.assertEquals(UplodedFilePage.getfilename(),FILE_NAME,"File name is not correct");
    }
}
