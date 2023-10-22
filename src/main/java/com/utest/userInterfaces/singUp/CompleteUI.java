package com.utest.userInterfaces.singUp;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompleteUI {

    public static final Target TXT_PASSWORD = Target
            .the("Password Input Field")
            .located(By.id("password"));

    public static final Target TXT_CONFIRM_PASSWORD = Target
            .the("Confirm Password Input Field")
            .located(By.id("confirmPassword"));

    public static final Target CHK_UTEST_TERMS = Target
            .the("UTest Terms Checkbox")
            .locatedBy("(//span[@class='checkmark signup-consent__checkbox error'])[1]");

    public static final Target CHK_PRIVACY_SECURITY = Target
            .the("Privacy and Security Checkbox")
            .locatedBy("//span[@ng-class='{error: userForm.privacySetting.$error.required}']");

    public static final Target BTN_COMPLETE_SETUP = Target
            .the("Complete Setup Button")
            .locatedBy("//a[@aria-label='Complete Setup']");
}
