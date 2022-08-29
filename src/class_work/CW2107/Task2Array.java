package CW2107;

public class Task2Array {
    public static void main(String[] args) {
        int[] mas = new int[12];
        int max=0,j=0;
        for(int i=0; i<mas.length; i++){
            mas[i]=(int)(Math.random()*31-15);
            System.out.print(mas[i]+" ");
        }
        for(int i=0; i<mas.length; i++) {
            if(mas[i]>=max) {
                max = mas[i];
                j = i;
            }
        }
        System.out.println("\nMaximalnim elementom massiva yavljaetsa "+mas[j]);
        System.out.println("Indeks ego poslednego vhojdeniya - "+j);
    }
    }

