package com.programing.class5.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//First step forward creating the custom annotation is to declare
//using keyword @interface
//nexT to add meta data - runTime visibility type means it can
//apply to classes
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface JsonSerializable {
	
}
