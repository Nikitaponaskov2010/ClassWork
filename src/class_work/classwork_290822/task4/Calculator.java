package class_work.classwork_290822.task4;


import classwork_290822.task2.Scanner;

public class Calculator  {
    private double x;
    private double y;

    private Scanner scanner = new Scanner(System.in);

    public double getX() {
        return x;
    }

    public void setX() {
        System.out.println("Input first number");
        this.x = scanner.nextDoudle();
    }

    public double getY() {
        return y;
    }

    public void setY() {
        System.out.println("Input first number");
        this.y = scanner.nextDouble();
    }

    public double sum (double x, double y) {
        return x + y;
    }

    public double sub (double x, double y ){
        return x - y;
    }

    public double mul (double x, double y) {
        return x + y;
    }

    public double div (double x, double y) {
        return x / y;
    }
}

