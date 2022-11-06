package class_work241022;

public class UncheckedException {
    public static void main(String[] args) {
        UncheckedException uncheckedException = new UncheckedException();
        try {
            uncheckedException.myMethodMyException2();
        }catch (MyException2 e) {
            System.out.println(e.getMessage());
        }

    }
    public void myMethodMyException2 () throws MyException2 {
        throw new MyException2("Hello my unchecked exception ");
    }
}
