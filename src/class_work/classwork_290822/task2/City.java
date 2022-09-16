package class_work.classwork_290822.task2;

import classwork_290822.task2.Scanner;

import java.util.Scanner;

public class City {
    private Scanner scanner = new Scanner(System.in);
    private String cityName;
    private String regionName;
    private String countryName;
    private int numOfResidentsInCity ;
    private int postalCodeInTheCity ;
    private int telAreaCode;

    public String getCityName() {
        return cityName;
    }

    public void setCityName() {
        System.out.print("Input city name");
        this.cityName = scanner.nextLine();
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName() {
        System.out.print("Input region name");
        this.regionName = scanner.nextLine();
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName() {
        System.out.print("Input country name");
        this.countryName = scanner.nextLine();
    }

    public int getNumOfResidentsInCity() {
        return numOfResidentsInCity;
    }

    public void setNumOfResidentsInCity() {
        System.out.print("Input number of residents in city");
        this.numOfResidentsInCity = scanner.nextInt();

    }

    public int getPostalCodeInTheCity() {
        return postalCodeInTheCity;
    }

    public void setPostalCodeInTheCity() {
        System.out.print("Input postal code in the city");
        this.postalCodeInTheCity = scanner.nextInt();
    }

    public int getTelAreaCode() {
        return telAreaCode;
    }

    public void setTelAreaCode() {
        System.out.print("Input telephone area code");
        this.telAreaCode = scanner.nextInt();
    }
}
