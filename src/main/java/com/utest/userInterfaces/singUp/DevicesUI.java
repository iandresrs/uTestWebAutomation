package com.utest.userInterfaces.singUp;

import net.serenitybdd.screenplay.targets.Target;

public class DevicesUI {

    public static final Target LST_COMPUTER = Target
            .the("Computer List")
            .locatedBy("(//span[@class='ui-select-match-text pull-left ui-select-allow-clear'])[1]");

    public static final Target TXT_COMPUTER = Target
            .the("Computer Text Input")
            .locatedBy("//input[@type='search' and @aria-label='Select box' and @placeholder='Select OS']");

    public static final Target LST_VERSION = Target
            .the("Version List")
            .locatedBy("//div[@class='ui-select-match' and @placeholder='Select a Version']");

    public static final Target TXT_VERSION = Target
            .the("Version Text Input")
            .locatedBy("//input[@type='search' and @aria-label='Select box' and @placeholder='Select a Version']");

    public static final Target LST_LANGUAGE = Target
            .the("Language List")
            .locatedBy("//div[contains(@class, 'ui-select-match') and @placeholder='Select OS language']");

    public static final Target TXT_LANGUAGE = Target
            .the("Language Text Input")
            .locatedBy("(//input[@aria-label='Select box'])[3]");

    public static final Target LST_MOBILE = Target
            .the("Mobile List")
            .locatedBy("(//div[@class='ui-select-match'])[3]");

    public static final Target TXT_MOBILE = Target
            .the("Mobile Text Input")
            .locatedBy("//input[@type='search' and @aria-label='Select box' and @placeholder='Select Brand']");

    public static final Target LST_MODEL = Target
            .the("Model List")
            .locatedBy("//div[@class='ui-select-match' and @aria-label='Select a Model']");

    public static final Target TXT_MODEL = Target
            .the("Model Text Input")
            .locatedBy("(//input[@aria-label='Select box'])[5]");

    public static final Target LST_OPERATING_SYSTEM = Target
            .the("Operating System List")
            .locatedBy("(//div[@class='ui-select-match' and @placeholder='Select OS'])[2]");

    public static final Target TXT_OPERATING_SYSTEM = Target
            .the("Operating System Text Input")
            .locatedBy("(//input[@placeholder='Select OS'])[2]");


}
