package classwork0610;


import classwork0610.elements.CloseButton;

public interface HasCloseButton {
    CloseButton getCloseButton();

    default void verifyCloseButton() {

    }


}
