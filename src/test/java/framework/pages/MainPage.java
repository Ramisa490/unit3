package framework.Pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import framework.LocatorConstants;
import org.openqa.selenium.By;

public class MainPage extends Form {
    String name = "Albert Einstein";
    public MainPage()
    {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, "Wikipedia")), "Main Page");
    }
    private ILink getNavigationLink(MainPageNavigation navigation) {
        return AqualityServices.getElementFactory().getLink(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH,
                navigation.label)), navigation.label);
    }


    public void clickNavigationLink(MainPageNavigation navigation)
    {
        getNavigationLink(navigation).click();
    }
}
