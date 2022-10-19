package klass_work131022;

import java.util.Objects;

public class Task1 {
    static Integer i1 = 10;
    static Integer i2 = 20;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task1 task1 = (Task1) o;
        return Objects.equals(i1, task1.i1) &&
                Objects.equals(i2, task1.i2);
    }

    public static void main(String[] args) {
        System.out.println(i1.equals(i2));
        System.out.println(i2.equals(i1));
    }
}
