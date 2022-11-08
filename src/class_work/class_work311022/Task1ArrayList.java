package class_work311022;


import java.time.Instant;
import java.util.*;

public class Task1ArrayList {


        public static void main(String[] args) {
            List<Integer> arrayList = new ArrayList<>();
            Task1ArrayList arr = new Task1ArrayList();
            arrayList.add(10);
            arrayList.add(5);
            arrayList.add(10);
            arrayList.add(15);
            arrayList.add(null);
            showArray(arrayList);

            showArray(arrayList);
            sum(arrayList);

            arrayList.add(2, 8);
            showArray(arrayList);
            sum(arrayList);

            List <Integer> list2 = new LinkedList<>();
            list2.add(9);
            list2.add(null);
            list2.add(9);

            showArray(list2);
            sum(list2);

            list2.add(9,7);
            showArray(list2);
            sum(list2);

            Set<Integer> set1 = new HashSet<>();
            set1.add(22);
            set1.add(22);
            showSet(set1);


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
    public static void showSet(Set <Integer> set1) {
        for (Integer s : set1) {
            System.out.println(s);
        }
    }
    }
