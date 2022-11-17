package class_work10_11_22;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Schet schet = new Schet();

        Person p1 = new Person();
        p1.name = "Katya";
        p1.summ = 180;

        Person p2 = new Person();
        p2.name = "Maria";
        p2.summ = 250;

        ManagerSchet tranzakciya1 = new ManagerSchet(schet, p1);
        ManagerSchet tranzakciya2 = new ManagerSchet(schet, p2);

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        service.execute(tranzakciya1);
        service.execute(tranzakciya2);

        service.shutdown();

        System.out.println("hello from main");

    }
}
