package classwork_290822.task1;

import classwork_290822.task2.Scanner;

import java.time.LocalDate;

public class Person {
    private Scanner scanner = new Scanner(System.in);
    private String fio;
    private LocalDate dateOfBird;
    private int phone;
    private String city;
    private String country;
    private String homeAddress;

    public String getFio() {
        return fio;
    }

    public void setFio() {
        System.out.print("Input FIO");
        this.fio = scanner.nextLine();
    }

    public LocalDate getDateOfBird() {
        return dateOfBird;
    }

    public void setDateOfBird() {
        System.out.print("Input date of bird");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        this.dateOfBird = LocalDate.of(year, month, day);

    }

    public int getPhone() {
        return phone;
    }

    public void setPhone() {
        System.out.print("Input phone");
        this.phone = scanner.nextInt();
    }

    public String getCity() {
        return city;
    }

    public void setCity() {
        System.out.print("Input city");
        this.city = scanner.nextLine();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry() {
        System.out.print("Input country");
        this.country = scanner.nextLine();
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress() {
        System.out.print("Input home address");
        this.homeAddress = scanner.nextLine();
    }
}
