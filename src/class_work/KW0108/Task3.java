package KW0108;

import java.util.Scanner;

public class Task3 {
    public void averageWordLength(String s) {
        String[] arrOfString = s.split(" ");
        double sumOfWordLength = 0;
        for (int i = 0; i < arrOfString.length; i++) {
            sumOfWordLength += arrOfString[i].length();

        }
        System.out.println("Average word length" + sumOfWordLength/arrOfString.length);
    }

    public static void main(String[] args) {
        Task3 t = new Task3();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the string: ");
        String st = sc.nextLine();
        t.averageWordLength(st);
    }
    }




