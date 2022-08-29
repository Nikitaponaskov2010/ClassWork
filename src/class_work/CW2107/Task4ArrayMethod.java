package CW2107;

import java.util.Random;

public class Task4ArrayMethod {
      public void creatArray(int[] a) {
          for (int i = 0; i < a.length; i ++) {
              System.out.print(a[i] + " ");
          }
          System.out.println();
      }
      public double getAverage (int[] a) {
          double getAverage = 0;
          for (int i = 0; i < a.length; i ++) {
              getAverage += a[i];
          }
          getAverage/= a.length;
          return getAverage;

      }
      public int [] ran (int b) {
          Random random = new Random();
          int [] a = new int[b];
          for (int i = 0; i < a.length; i ++) {
              a[i]= random.nextInt(5);
          }
          return a;

      }
      public static void main(String[] args) {
          Task4ArrayMethod arrayMethod  = new Task4ArrayMethod();
          int[] arrayNum1= arrayMethod.ran(5);
          int[] arrayNum2= arrayMethod.ran(5);

          arrayMethod.creatArray(arrayNum1);
          arrayMethod.creatArray(arrayNum2);
          if (arrayMethod.getAverage(arrayNum1) > arrayMethod.getAverage(arrayNum2)) {
              System.out.println("Average of array 1 is bigger");
          } else if (arrayMethod.getAverage(arrayNum1) < arrayMethod.getAverage(arrayNum2)) {
              System.out.println("Average of array 2 is bigger");

          }else System.out.println("Average is eqals" );


      }
}
