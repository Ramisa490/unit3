package framework.tests;

import framework.pages.DynamicControlsPage;
import framework.pages.MainPage;
import framework.pages.MainPageNavigation;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.UUID;

public class DynamicControlsTest extends BaseTest {
    private DynamicControlsPage dynamicControlsPage = new DynamicControlsPage();
    private final String RANDOM_TEXT = UUID.randomUUID().toString();

    @Test
    public void dynamicControlsTest() {
        mainPage.clickNavigationLink(MainPageNavigation.DYNAMIC_CONTROLS);
        dynamicControlsPage.clickButton();
        Assert.assertTrue(dynamicControlsPage.IsInputEnable(),"Input is not enabled");
        dynamicControlsPage.InputText(RANDOM_TEXT);
        Assert.assertEquals(dynamicControlsPage.getinputtextvalue(),RANDOM_TEXT,"Text is not displayed");

    }


}
