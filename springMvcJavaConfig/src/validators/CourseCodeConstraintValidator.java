package validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
private String expectedCode;
	@Override
	public void initialize(CourseCode constraintAnnotation) {
		// TODO Auto-generated method stub
		
		this.expectedCode=constraintAnnotation.code();
	}

	@Override
	public boolean isValid(String actualData, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		
		if(actualData.startsWith(this.expectedCode))
		return true;
		return false;
	}

}
