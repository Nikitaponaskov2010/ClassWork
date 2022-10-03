package classwork031022;

import javax.sound.midi.ControllerEventListener;
import java.lang.annotation.Annotation;

@MayAnnation(value = 50)
@MayAnnation(200)
@MayAnnation(300)
@AnnatNoRep(150)
public class Main {
    public static void main(String[] args) {
        int c = 50;
        myMethod();
        System.out.println(isControllerAnnatPresent());
    }

    public static void myMethod() {
        Main v = new Main();
        try {
            Annotation[] array = v.getClass().getAnnotations();
            for (Annotation annotation : array) {
                System.out.println(annotation);
            }

        }catch (Exception e) {
    }
}
        public static void aBoolean() {
        Main v = new Main();

        }

        public static boolean isControllerAnnatPresent () {
        return Main.class.isAnnotationPresent(AnnatNoRep.class);
        }
}


