package classwork_290822.task1_2;

import classwork_290822.task1_6.Book;
import classwork_290822.task1_7.Car;

import java.time.LocalDate;

public class Human {
    private String name;
    private LocalDate dateBorn;
    private int contactPhone;
    private String town;
    private String country;
    private String homeAddress;
    private Book[] library;
    private Car[] car;

    public Human(String name,
                 LocalDate dateBorn) {
        this.name = name;
        this.dateBorn = dateBorn;
    }

    public Human(String name,
                 LocalDate dateBorn,
                 int contactPhone,
                 String town) {
        this.name = name;
        this.dateBorn = dateBorn;
        this.contactPhone = contactPhone;
        this.town = town;
    }

    public Human(String name,
                 LocalDate dateBorn,
                 int contactPhone,
                 String town,
                 String country,
                 String homeAddress,
                 Book[] library,
                 Car[] car) {
        this.name = name;
        this.dateBorn = dateBorn;
        this.contactPhone = contactPhone;
        this.town = town;
        this.country = country;
        this.homeAddress = homeAddress;
        this.library = library;
        this.car = car;
    }
}
