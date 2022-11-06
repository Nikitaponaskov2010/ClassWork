package class_work171022;

import java.util.Scanner;

public class Task2 {
    Integer number = 0;
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.getCorrectNumberFromConsole();
        task2.verifyInputedNumber(task2.number);
        task2.verifyRange();
        System.out.println(task2.number + " number in range");

    }
    public void getCorrectNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);
        String s = null;
        try {
            System.out.println("Input a number");
            s = scanner.nextLine();
            number = Integer.parseInt(s, 2);
        } catch (NumberFormatException e) {
            System.out.println(s + "is not a number");
            getCorrectNumberFromConsole();
        }
    }

     public void verifyRange() {
        try {
            verifyInputedNumber(number);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }getCorrectNumberFromConsole();
         verifyRange();
     }

    public void verifyInputedNumber(int number) throws IllegalArgumentException{
        if(number<-5 || number>5){
            throw new IllegalArgumentException("Not in range from -5 to 5");
        }
    }
     }


