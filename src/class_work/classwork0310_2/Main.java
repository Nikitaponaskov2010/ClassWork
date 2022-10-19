package classwork0310_2;

public class Main {
    public static void main(String[] args) {
        Car [] arr = new Car[2];
        arr[0] = new BWV();
        arr[1] = new Mercedes();

        for (Car elements: arr){
            elements.assembly();
            elements.brake();
            elements.autoTransmission();
            elements.headlights();
            elements.beep();
            System.out.println();
        }
    }

}
