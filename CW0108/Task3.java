package CW0108;

import java.util.Scanner;

public class Task3 {
    public void averageOfLength(String s) {
        String[] arrayOfString = s.split(" ");
        double sumOfLength = 0;
        for (int i = 0; i < arrayOfString.length; i++) {
            sumOfLength += arrayOfString[i].length();
        }
        System.out.println("Average word length is " + sumOfLength/arrayOfString.length);
    }

    public static void main(String[] args) {
        Task3 obj = new Task3();
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the string: ");
        String string = sc.nextLine();
        obj.averageOfLength(string);
    }
}
