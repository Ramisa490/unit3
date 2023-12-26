package framework.Pages;

import java.awt.*;

public enum MainPageNavigation
{
    JAVASCRIPT_ALERT("JavaScript Alerts"),
    SORTABLE_DATA_TABLES("Sortable Data Tables"),
    DYNAMIC_CONTROLS("Dynamic Controls"),
    FILE_DOWNLOAD("File Download"),
    FILE_UPLOAD("File Upload"),
    BASIC_AUTH("Basic Auth"),

    TEXT_FIELD_INPUT("Text Field Input"),

    SEARCH_BUTTON_CLICK("Search Button Click");






    public final String label;

    private MainPageNavigation(String label)
    {
        this.label = label;
    }
}