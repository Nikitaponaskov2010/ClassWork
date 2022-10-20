package class_work._220922.task1;

public class Country {
    private String nameOfCountry;
    private String nameOfContinent;

    public Country (String nameOfCountry) {
        this.nameOfCountry=nameOfCountry;
    }

    public Country (String nameOfCountry, String nameOfContinent ){
        this(nameOfCountry);
        this.nameOfContinent = nameOfContinent;
    }




}
