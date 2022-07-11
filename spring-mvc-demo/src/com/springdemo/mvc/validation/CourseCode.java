package com.springdemo.mvc.validation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;



@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD , ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	public String value() default "LUV";
	
	public String message() default "must";
	
	public Class<?>[] groups default {};
	
	public Class<? extends Payload>[] payload default{};
}
