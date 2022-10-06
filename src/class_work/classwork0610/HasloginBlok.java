package classwork0610;

import classwork0610.blosk.LoginBlok;

public interface HasloginBlok {

    LoginBlok getloginBlok();

    default void verifySaveBatten() {
        System.out.println(getloginBlok().saveBatten.helloWord());
    }

    default void verifyCancelBatten() {
        System.out.println(getloginBlok().cancelButton.getNumberOf());
    }



    default void verifyCloseBatten() {
        getloginBlok().closeButton.sayOK();
    }
}
