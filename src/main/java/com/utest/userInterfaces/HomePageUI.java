package com.utest.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePageUI {

    public static final Target BTN_JOIN_TODAY = Target
            .the("Join Today Button")
            .locatedBy("//a[@class='unauthenticated-nav-bar__sign-up']");

}
