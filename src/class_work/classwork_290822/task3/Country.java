package class_work.classwork_290822.task3;

import java.util.Scanner;

public class Country {
    private Scanner scanner = new Scanner(System.in);
    private String countryName;
    private String continentName;
    private String capitalName;
    private String countryCityName;
    private int numOfResidentsInCity ;
    private int telAreaCode;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName() {
        System.out.print("Input country name");
        this.countryName = scanner.nextLine();
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName() {
        System.out.print("Input continent name");
        this.continentName = scanner.nextLine();
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName() {
        System.out.print("Input capital name");
        this.capitalName = scanner.nextLine();
    }

    public String getCountryCityName() {
        return countryCityName;
    }

    public void setCountryCityName() {
        System.out.print("Input country city name");
        this.countryCityName = scanner.nextLine();
    }

    public int getNumOfResidentsInCity() {
        return numOfResidentsInCity;
    }

    public void setNumOfResidentsInCity() {
        System.out.print("Input number of resident in city");
        this.numOfResidentsInCity = scanner.nextInt();
    }

    public int getTelAreaCode() {
        return telAreaCode;
    }

    public void setTelAreaCode() {
        System.out.print("Input telephone area code");
        this.telAreaCode = scanner.nextInt();
    }
}
