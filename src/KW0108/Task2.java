package KW0108;

import java.util.Scanner;

public class Task2 {
    private String stOfNumbers(){
        String st = "";
        for (int i = 1; i < 1000; i++) {
            if (st.length() >= 1000){
                break;
            }
           else {
               st= st + i;
            }
        }
        return st;
    }

    public static void main(String[] args) {
        Task2 t = new Task2();
        String s = t.stOfNumbers();
        System.out.println(s);
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите индекс ");
        int ind= sc.nextInt();
        System.out.print(s.charAt(ind));

    }



}
