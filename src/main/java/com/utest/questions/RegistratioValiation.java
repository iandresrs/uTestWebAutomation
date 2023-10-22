package com.utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.utest.userInterfaces.singUp.SingUpPageUI.MSJ_VALIDACION;

public class RegistratioValiation implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return  MSJ_VALIDACION.resolveFor(actor).isVisible();
    }

    public static Question validation(){
        return new RegistratioValiation();
    }
}
