package JAVARuntime;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//
@Retention(RetentionPolicy.SOURCE)
//
public @interface MethodArgs {
    String[] value();
}
