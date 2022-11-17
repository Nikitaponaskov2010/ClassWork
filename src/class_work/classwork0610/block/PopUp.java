package classwork0610.block;

import classwork0610.HasCloseButton;
import classwork0610.HasSaveButton;
import classwork0610.HasStartButton;
import classwork0610.elements.CloseButton;
import classwork0610.elements.SaveBatten;
import classwork0610.elements.StartButton;

public class PopUp implements HasCloseButton, HasSaveButton, HasStartButton {

    public StartButton startButton = new StartButton();
    public SaveBatten saveButton = new SaveBatten();
    public CloseButton closeButton = new CloseButton();



    @Override
    public CloseButton getCloseButton() {
        return closeButton;
    }

    @Override
    public SaveBatten getSaveButton() {
        return saveButton;
    }

    @Override
    public StartButton getStartButton() {
        return startButton;
    }
}