package class_work171022;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int [] number = {155, 25};
        int [] number2 = {155, 25};
        Task3 t = new Task3();
        t.compareArr(number, 1,0,number2, 0,1);
        t.compareArr(number, 0,5,number2, 0,1);
        t.compareArr(null, 0,5,number2, 0,1);

    }

    public void compareArr(int[] a, int aFromIndex, int aToIndex,
                           int[] b, int bFromIndex, int bToIndex) {
        try{
            Arrays.compare(a,aFromIndex,aToIndex, b,bFromIndex, bToIndex  );

        }catch (IllegalArgumentException e){
            System.out.println("Hello from IllegalArgumentException");
        }catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("Hello from ArrayIndexOutOfBoundsException ");
        }catch (NullPointerException e3) {
            System.out.println("Hello from NullPointerException");
        }



    }

}
