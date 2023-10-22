package com.utest.userInterfaces.singUp;

import net.serenitybdd.screenplay.targets.Target;

public class ButtonNext {

    public static final Target BTN_NEXT = Target
            .the("Next Button")
            .locatedBy("//a[@class='btn btn-blue pull-right']");



}
