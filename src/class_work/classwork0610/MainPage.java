package classwork0610;

import classwork0610.block.PopUp;

public class MainPage extends BasePage implements HasPopUpBlock {

    @Override
    public PopUp getPopUp() {
        return new PopUp();
    }
}
