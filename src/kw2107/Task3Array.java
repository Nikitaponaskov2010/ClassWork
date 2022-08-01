package kw2107;

import java.util.Scanner;

import static java.lang.Math.random;

public class Task3Array {
    public int[] creatArray(int leng) {
        int[] array = new int[leng];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (random() * 10 + 1));
        }
        return array;
    }

    public void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public int[] changeNumArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = 0;
            }
        }
        return array;
    }

    public static void main(String[] args) {

        Task3Array arrayMethod = new Task3Array();
        Scanner sc = new Scanner(System.in);
        int leng = sc.nextInt();

        int[] array = arrayMethod.creatArray(leng);

        arrayMethod.showArray(array);

        int[] rezults = arrayMethod.changeNumArray(array);
        arrayMethod.showArray(rezults);
    }

}
