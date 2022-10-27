package by.epam.hw13.regexpr03.validator;

import by.epam.hw13.regexpr03.validator.exception.UserValidatorException;

public interface UserValidatorBuilder<T> {
	
	T build() throws UserValidatorException; 

}
