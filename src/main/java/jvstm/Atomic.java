package jvstm;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import pt.ist.esw.advice.AdviceFactory;

@Target(ElementType.METHOD)
public @interface Atomic {
    boolean readOnly() default false;

    boolean canFail() default true;

    boolean speculativeReadOnly() default true;

    Class<? extends AdviceFactory> adviceFactory() default jvstm.atomic.AtomicAdviceFactory.class;
}
