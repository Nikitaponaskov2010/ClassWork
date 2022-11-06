package class_work241022;

public class ExceptionChecked {
    public static void main(String[] args) {
      ExceptionChecked exceptionChecked = new ExceptionChecked();
      try {
          exceptionChecked.myMethodMyException();
      }catch (MyException e) {
          System.out.println(e.getMessage());
      }

    }
    public void myMethodMyException () throws MyException {
        throw new MyException("Hello my exception");
    }
}
