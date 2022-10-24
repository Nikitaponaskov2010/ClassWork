package class_work.class_work241022;

public class MyExceptionChecked {
    public static void main(String[] args) {
      MyExceptionChecked myExceptionChecked = new MyExceptionChecked();
      try {
          myExceptionChecked.myMethodMyException();
      }catch (MyException e) {
          System.out.println(e.getMessage());
      }

    }
    public void myMethodMyException () throws
}
