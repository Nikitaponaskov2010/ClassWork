package CW2107;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int n=0,a,s1=0,s2=0,j=0;
        do {
            System.out.print("Vvedite chislo: ");
            Scanner sc = new Scanner(System.in);
            if(sc.hasNextInt()) {
                n = sc.nextInt();
                if(n>3) {
                    int[] mas1 = new int[n];
                    for(int i=0; i<mas1.length; i++) {
                        mas1[i] = (int)(Math.random()*(n+1));
                        System.out.print(mas1[i]+" ");
                        if(mas1[i]%2==0) {
                            j++;
                        }
                    }
                    System.out.println("\n");
                    if(j!=0) {
                        int[] mas2 = new int[j];
                        j = 0;
                        for(int i=0; i<mas1.length; i++) {
                            if(mas1[i]%2==0) {
                                mas2[j] = mas1[i];
                                System.out.print(mas2[j]+" ");
                                j++;
                            }
                        }
                    } else {
                        System.out.println("Chetnih elementov net");
                    }
                }
            }
        }while(n<=3);
    }
    }

