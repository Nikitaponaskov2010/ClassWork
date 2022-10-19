package class_work171022;

import java.util.Scanner;

public class Task1 {
    Integer number = 0;
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.getCorrectNumberFromConsole();
        task1.verifyInputedNumber(task1.number);
        task1.verifyRange();
        System.out.println(task1.number + " number in range");
    }

    public void getCorrectNumberFromConsole(){
        Scanner sc = new Scanner(System.in);
        String text = null;
        try {
            System.out.println("Please input a number");
            text = sc.nextLine();
            number = Integer.parseInt(text);
        }catch (NumberFormatException e) {
            System.out.println(text + "is not a number");
            getCorrectNumberFromConsole();
        }
    }

    public void verifyRange(){
        try {
            verifyInputedNumber(number);
        }catch (IllegalArgumentException e){
            getCorrectNumberFromConsole();
            verifyRange();
        }
    }
    public void verifyInputedNumber(int number) throws IllegalArgumentException{
        if(number<0 || number>9){
            throw new IllegalArgumentException("Not in range from 0 to 9");
        }
    }
}
