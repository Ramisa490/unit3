package framework.tests;

import framework.pages.BasicAuthPage;
import framework.pages.MainPageNavigation;
import framework.utils.SettingsTestData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAuthTest extends BaseTest {
    private final BasicAuthPage basicAuthPage = new BasicAuthPage();

    @BeforeMethod
    public void auth() {
        browser.network().addBasicAuthentication(
                SettingsTestData.getEnvData().getDomain(),
                SettingsTestData.getUserData().getUsername(), // Corrected method call
                SettingsTestData.getUserData().getPassward() // Corrected method call, assuming there's a method like getPasswardData()
        );
    }

    @Test
    public void basicAuthTest() {
        mainPage.clickNavigationLink(MainPageNavigation.BASIC_AUTH);
        Assert.assertTrue(basicAuthPage.isSuccessMsgDisplayed(),"Message are not displayed");
    }
}
