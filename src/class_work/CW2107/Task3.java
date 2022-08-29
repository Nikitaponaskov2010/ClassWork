package CW2107;

public class Task3 {
    public static void main(String[] args) {
        int[] mas = new int[8];
        for(int i=0; i<mas.length; i++){
            mas[i] = (int)(Math.random()*10+1);
        }
        for(int i=0; i<mas.length; i++){
            System.out.print(mas[i]+" ");
        }
        System.out.println();
        for(int i=0; i<mas.length; i++) {
            if(i%2==0) {
                mas[i]=0;
            }
            System.out.print(mas[i]+" ");
        }
    }
}
