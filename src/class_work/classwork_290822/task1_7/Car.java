package classwork_290822.task1_7;

import java.util.Scanner;

public class Car {

        private String nameOfCar;
        private String nameOfManufacturer;
        private int releaseYear;
        private double engineVolume;

        private Scanner scanner = new Scanner(System.in);

        public Car(String nameOfCar,
                   String nameOfManufacturer) {
            this.nameOfCar = nameOfCar;
            this.nameOfManufacturer = nameOfManufacturer;
        }

        public Car(String nameOfCar,
                   String nameOfManufacturer,
                   int releaseYear) {
            this.nameOfCar = nameOfCar;
            this.nameOfManufacturer = nameOfManufacturer;
            this.releaseYear = releaseYear;
        }

        public Car(String nameOfCar,
                   String nameOfManufacturer,
                   int releaseDate,
                   double engineVolume) {
            this.nameOfCar = nameOfCar;
            this.nameOfManufacturer = nameOfManufacturer;
            this.releaseYear = releaseDate;
            this.engineVolume = engineVolume;
        }

        public String getNameOfCar() {
            return nameOfCar;
        }

        public void setNameOfCar() {
            System.out.println("Please, enter name of car: ");
            this.nameOfCar = scanner.nextLine();
        }

        public String getNameOfManufacturer() {
            return nameOfManufacturer;
        }

        public void setNameOfManufacturer() {
            System.out.println("Please, enter name of manufacturer: ");
            this.nameOfManufacturer = scanner.nextLine();
        }

        public int getReleaseYear() {
            return releaseYear;
        }

        public void setReleaseYear() {
            System.out.println("Please, enter release year: ");
            this.releaseYear = scanner.nextInt();
        }

        public double getEngineVolume() {
            return engineVolume;
        }

        public void setEngineVolume(double engineVolume) {
            System.out.println("Please, enter engine volume: ");
            this.engineVolume = scanner.nextDouble();
        }
    }



