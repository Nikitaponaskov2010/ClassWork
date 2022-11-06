package class_work.classwork_22092022;

public class Main {
    public static void main(String[] args) {
        City vitebsk = new City();
        vitebsk.setName("Vitebsk");
        vitebsk.setCountry("Belarus");
        vitebsk.setCountOfPeople(17000);

        City sagunto = new City();
        sagunto.setName("Sagunto");
        sagunto.setCountry("Ispania");
        sagunto.setCountOfPeople(41000);

        City moscow = new City();
        moscow.setName("Moscow");
        moscow.setCountry("Russia");
        moscow.setCountOfPeople(2000000);

        Country russia = new Country();
        russia.setContinent("Eurasia");
        russia.setName("Russia");

        Country ispania = new Country();
        ispania.setName("Ispania");
        ispania.setContinent("Evrasia");

        System.out.println(vitebsk.toString());
        System.out.println(sagunto.toString());
        System.out.println(moscow.toString());
        System.out.println(russia.toString());
        System.out.println(ispania.toString());
    }

}
