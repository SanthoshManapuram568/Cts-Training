package validators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
@Constraint(validatedBy = CourseCodeConstraintValidator.class)				//which class provides logic for this
@Target({ElementType.FIELD , ElementType.METHOD})//where we are using it 
@Retention(RetentionPolicy.RUNTIME)//must add for compilation /runtime
public @interface CourseCode { //@interface was used as a validators 
	
	//for attribute a method is declared
	public String message() default "Invalid Country Code!!!";
	public String code() ;
	public Class<?>[] groups() default{};
	public Class<? extends Payload>[] payload() default{};
	
}
