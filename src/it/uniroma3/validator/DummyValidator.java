package it.uniroma3.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class DummyValidator implements Validator{

	//codice da copiare per ogni volta che abbiamo un form
	//indica quali oggetti possono essere validati da questo validator
	@Override
	public boolean supports(Class<?> paramClass) {
		return Dummy.class.equals(paramClass);
	}

	@Override
	public void validate(Object obj, Errors errors) {

		Dummy emp = (Dummy) obj;

		if(emp.getNumericValue() <=0){
			errors.rejectValue("numericValue", "negativeValue", new Object[]{"'numericValue'"}, "numericValue can't be negative");
		}

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstString", "firstString.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastString", "lastString.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "objectOne", "objectOne.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "objectTwo", "objectTwo.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "numericValue", "numericValue.required");
	}
}


}
