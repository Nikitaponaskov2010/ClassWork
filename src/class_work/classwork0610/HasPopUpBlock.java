package classwork0610;

import classwork0610.block.PopUp;

public interface HasPopUpBlock {

    PopUp getPopUp();

    default void verifySaveButton() {
        getPopUp().saveButton.helloWord();
    }

    default void verifyCloseButton() {
        getPopUp().closeButton.sayOK();
    }

    default void verifyStartButton() {
        getPopUp().startButton.getNumberOf();
    }
}
