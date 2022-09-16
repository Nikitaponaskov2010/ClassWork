package CW0108;

import KW0108.StringTask4;
import classwork_290822.task2.Scanner;

import java.util.Scanner;

public class Task1 {
    public static void main(StringTask4[] args) {
        System.out.println("Input string");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.print("Input the symbol");
        String s2 = sc.nextLine();
        char [] array = s1.toCharArray();
        char cim = s2.charAt(0);
        Task1 t = new Task1();
        int rez = t.countSymbols(array,cim);
        System.out.println("Кодичество вхождений" + rez);

    }

    private int countSymbols(char[] array, char symbol) {
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == symbol) {
                num++;
            }

        }


        return num;
    }
}