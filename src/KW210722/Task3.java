package KW210722;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    int [] mas= new int[8];
    public static void main(String[] args) {
        int [] mas= new int[8];

        for (int i = 0; i < mas.length; i++ ) {
            mas [i] = (int) (Math.random() *10)+1;

        }
        System.out.print(Arrays.toString(mas));
        for (int i = 0; i < mas.length; i++) {
            if (i%2 == 1) {
                mas[i]=0;
            System.out.print(Arrays.toString(mas));
        }

}}}
