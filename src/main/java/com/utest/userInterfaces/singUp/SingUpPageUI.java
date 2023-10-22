package com.utest.userInterfaces.singUp;

import net.serenitybdd.screenplay.targets.Target;

public class SingUpPageUI {

    public static final Target MSJ_VALIDATION = Target
            .the("Validation message on the main page")
            .locatedBy("//div[@class='image-box-header']/h1");

}
