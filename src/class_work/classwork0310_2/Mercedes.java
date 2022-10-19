package classwork0310_2;

public class Mercedes implements Car {
    String name = "Mersedes";

    @Override
    public void assembly() {
        System.out.println("Сборка автомобиля! " + name);
    }

    @Override
    public void autoTransmission() {
        System.out.println("Каробка передач механическая! " + name);
    }

    @Override
    public void brake() {
        System.out.println("Тормоз есть! " + name);
    }

    @Override
    public void headlights() {
        System.out.println("Фары не работают! " + name);
    }

}
