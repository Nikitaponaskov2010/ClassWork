package class_work.class_work311022;


import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Task1ArrayList {

    List<Integer> arrayList = new ArrayList<>();


        public static void main(String[] args) {
            Task1ArrayList arr = new Task1ArrayList();
            arr.createdArrayList();
            arr. ();
            arr.addedNewNumber();
            System.out.println();
            arr.watchedArrayList();
        }

            public void createdArrayList()   {
            arrayList.add(10);
            arrayList.add(5);
            arrayList.add(10);
            arrayList.add(15);
            arrayList.add(null);
             showArray(arrayList);


    }
    public static  <E> void showArray (List<E> list){
        for (E val : list) {
            System.out.println(val);
        }
    }
    public static<E>void sum(List<E> list) {
        int sum = 0;
        for (E s : list) {
            try {
                sum += (Integer) s;
            } catch (NullPointerException e) {
                System.out.println("Есть null значения");
            }
        }
        System.out.println("Сумма допустимых чисел = " + sum);
        System.out.println();
    }
    }
