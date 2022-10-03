package classwork031022;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(RepaAnna.class)
public @interface MayAnnation {
    int value();


}
