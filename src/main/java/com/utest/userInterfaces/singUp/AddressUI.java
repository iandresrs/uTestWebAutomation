package com.utest.userInterfaces.singUp;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddressUI {

    public static final Target TXT_CITY = Target
            .the("City input field")
            .located(By.id("city"));

    public static final Target TXT_POSTAL_CODE = Target
            .the("Postal Code input field")
            .located(By.id("zip"));

    public static final Target LST_COUNTRY = Target
            .the("Country list")
            .locatedBy("(//span[@class='btn btn-default form-control ui-select-toggle'])[2]");

    public static final Target TXT_COUNTRY = Target
            .the("Country input field")
            .locatedBy("//input[@type='search' and @placeholder='Select a country']");

}
