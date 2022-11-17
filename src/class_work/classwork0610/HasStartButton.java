package classwork0610;

import classwork0610.elements.StartButton;

public interface HasStartButton {
    StartButton getStartButton();

    default void verifyStartButton() {
        getStartButton().getNumberOf();
    }
}
