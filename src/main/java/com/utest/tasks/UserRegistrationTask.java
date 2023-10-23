package com.utest.tasks;

import com.utest.utils.Constant;
import com.utest.utils.Excel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static com.utest.userInterfaces.HomePageUI.BTN_JOIN_TODAY;
import static com.utest.userInterfaces.singUp.AddressUI.*;
import static com.utest.userInterfaces.singUp.ButtonNext.BTN_NEXT;
import static com.utest.userInterfaces.singUp.CompleteUI.*;
import static com.utest.userInterfaces.singUp.DevicesUI.*;
import static com.utest.userInterfaces.singUp.PersonalUI.*;

public class UserRegistrationTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        Excel excel = new Excel();

        //  personal information page

        String firstName = excel.readExcelData(Constant.INFORMATION_SHEET, 1, 0);
        String lastName = excel.readExcelData(Constant.INFORMATION_SHEET, 1, 1);
        String email = excel.readExcelData(Constant.INFORMATION_SHEET, 1, 2);
        String month = excel.readExcelData(Constant.INFORMATION_SHEET, 1, 3);
        String day = excel.readExcelData(Constant.INFORMATION_SHEET, 1, 4);
        String year = excel.readExcelData(Constant.INFORMATION_SHEET, 1, 5);

        actor.attemptsTo(
                Click.on(BTN_JOIN_TODAY),
                Enter.theValue(firstName).into(TXT_FIRST_NAME),
                Enter.theValue(lastName).into(TXT_LAST_NAME),
                Enter.theValue(email).into(TXT_EMAIL),
                Click.on(LST_MONTH),
                SelectFromOptions.byValue("number:" + month).from(LST_MONTH),
                SelectFromOptions.byValue("number:" + day).from(LST_DAY),
                SelectFromOptions.byValue("number:" + year).from(LST_YEAR),
                Click.on(BTN_NEXT_LOCATION)
        );

        //  address information page

        String city = excel.readExcelData(Constant.INFORMATION_SHEET, 1, 6);
        String postalCode = excel.readExcelData(Constant.INFORMATION_SHEET, 1, 7);
        String country = excel.readExcelData(Constant.INFORMATION_SHEET, 1, 8);

        actor.attemptsTo(
                Enter.theValue(city).into(TXT_CITY).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Enter.theValue(postalCode).into(TXT_POSTAL_CODE),
                Click.on(LST_COUNTRY),
                Enter.theValue(country).into(TXT_COUNTRY).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(BTN_NEXT)
        );

        //  device information page

        String computer = excel.readExcelData(Constant.INFORMATION_SHEET, 1, 9);
        String version = excel.readExcelData(Constant.INFORMATION_SHEET, 1, 10);
        String language = excel.readExcelData(Constant.INFORMATION_SHEET, 1, 11);
        String mobile = excel.readExcelData(Constant.INFORMATION_SHEET, 1, 12);
        String model = excel.readExcelData(Constant.INFORMATION_SHEET, 1, 13);
        String operatingSystem = excel.readExcelData(Constant.INFORMATION_SHEET, 1, 14);

        actor.attemptsTo(
                Click.on(LST_COMPUTER),
                Enter.theValue(computer).into(TXT_COMPUTER).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(LST_VERSION),
                Enter.theValue(version).into(TXT_VERSION).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(LST_LANGUAGE),
                Enter.theValue(language).into(TXT_LANGUAGE).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(LST_MOBILE),
                Enter.theValue(mobile).into(TXT_MOBILE).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(LST_MODEL),
                Enter.theValue(model).into(TXT_MODEL).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(LST_OPERATING_SYSTEM),
                Enter.theValue(operatingSystem).into(TXT_OPERATING_SYSTEM).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(BTN_NEXT)
        );

        // final information page

        String password = excel.readExcelData(Constant.INFORMATION_SHEET, 1, 15);
        String confirmPassword = excel.readExcelData(Constant.INFORMATION_SHEET, 1, 16);

        actor.attemptsTo(
                Enter.theValue(password).into(TXT_PASSWORD),
                Enter.theValue(confirmPassword).into(TXT_CONFIRM_PASSWORD),
                Click.on(CHK_UTEST_TERMS),
                Click.on(CHK_PRIVACY_SECURITY),
                Click.on(BTN_COMPLETE_SETUP)
        );
    }

    public static UserRegistrationTask on() {
        return Instrumented.instanceOf(UserRegistrationTask.class).withProperties();
    }
}
