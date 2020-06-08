package com.chugunoff.GEngine.Annotations;

import java.lang.annotation.*;

@Retention(value= RetentionPolicy.RUNTIME)
@Inherited
public @interface GameRoom {
    boolean  initFrame() default true;
    boolean drawFrame() default true;
    boolean initListeners() default true;
    boolean debug() default true;
    boolean after() default true;
}
