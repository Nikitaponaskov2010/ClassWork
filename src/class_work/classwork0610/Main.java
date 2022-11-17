package classwork0610;

public class Main {
    public static void main(String[] args) {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.getPopUp().verifySaveButton();
        dashboardPage.getPopUp().verifyStartButton();
        dashboardPage.getPopUp().verifyCloseButton();



        MainPage mainPage = new MainPage();
        mainPage.verifyStartButton();
        mainPage.verifyCloseButton();
        mainPage.verifySaveButton();
    }
    }



