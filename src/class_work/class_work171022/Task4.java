package class_work.class_work171022;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    String s = " ";
    String[] splited;

    public static void main(String[] args) {
        Task4 task4 = new Task4();
        task4.getString();
        task4.splited = task4.splitPlus();
        task4.validOfSplitArray();
        int sum = 0;
        for (String num : task4.splited
        ) {
            sum += Integer.parseInt(num);
        }
        System.out.println("summa " + sum);
    }

    public void getString() {
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
    }

    public String [] splitPlus() {
        return splited = s.split("\\+");
    }

    public void validOfSplitArray() throws IllegalArgumentException {
        for (String num : splited) {
            try {
                Integer.parseInt(num);
        } catch(IllegalArgumentException e){
            System.out.println("Плохое число");
            getString();
            splitPlus();
            validOfSplitArray();
        }
    }
    }
}
