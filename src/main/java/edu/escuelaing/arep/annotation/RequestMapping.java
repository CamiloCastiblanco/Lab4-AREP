package edu.escuelaing.arep.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Brayan Camilo Castiblanco
 * @version 1.0 9/20/2023
 * @project EciSpringboot
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RequestMapping {
    public String value();
}
