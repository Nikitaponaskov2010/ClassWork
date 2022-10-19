package classwork0310_2;

public class BWV implements Car {
    String name = "BWV";

    @Override
    public void assembly () {
        System.out.println("Сборка автомобиля" + name);
    }

    @Override
    public void autoTransmission() {
        System.out.println("Коробка передач автомат" + name);
    }
    @Override
    public void brake() {
        System.out.println("Тормоз работает" + name);
    }

    @Override
    public void headlights() {
        System.out.println("Фары работают " + name);
    }
    }

