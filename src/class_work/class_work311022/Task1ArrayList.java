package class_work.class_work311022;


import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Task1ArrayList {
    public static void main(String[] args) {
        List<Integer> arrayList= new ArrayList();
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
    public static  <E> void Sum (List<E> list) {
        for (E val : list) {
            System.out.println(val);
        }
    }
}
