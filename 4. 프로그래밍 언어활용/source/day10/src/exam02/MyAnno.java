package exam02;

import static java.lang.annotation.ElementType.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({TYPE, METHOD, FIELD})
@Retention(RetentionPolicy.RUNTIME)

public @interface MyAnno {
    int min() default 50; // min 설정 항목
    int max() default 500; // max 설정 항목
    String[] names() default {"jon"};
    String value();
}
