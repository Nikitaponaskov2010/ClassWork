package classwork0610;

import classwork0610.elements.SaveBatten;

public interface HasSaveButton {
    SaveBatten getSaveButton();

    default void verifySaveButton() {
        if (getSaveButton().helloWord() == 2) {
            System.out.println("true");
        } else {
            System.out.println(false);
        }
    }
}
