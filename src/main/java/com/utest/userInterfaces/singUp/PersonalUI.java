package com.utest.userInterfaces.singUp;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalUI {

    public static final Target TXT_FIRST_NAME = Target
            .the("First Name Text Field")
            .located(By.id("firstName"));

    public static final Target TXT_LAST_NAME = Target
            .the("Last Name Text Field")
            .located(By.id("lastName"));

    public static final Target TXT_EMAIL = Target
            .the("Email Text Field")
            .located(By.id("email"));

    public static final Target LST_MONTH = Target
            .the("Birth Month Dropdown")
            .located(By.id("birthMonth"));

    public static final Target LST_DAY = Target
            .the("Birth Day Dropdown")
            .located(By.id("birthDay"));

    public static final Target LST_YEAR = Target
            .the("Birth Year Dropdown")
            .located(By.id("birthYear"));

    public static final Target BTN_NEXT_LOCATION = Target
            .the("Next Location Button")
            .locatedBy("//a[@class='btn btn-blue']");

}
