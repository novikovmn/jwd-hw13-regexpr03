package by.epam.hw13.regexpr03.validator;

import java.util.HashMap;
import java.util.Map;

import by.epam.hw13.regexpr03.validator.exception.UserValidatorException;

public class UserValidator {
	
	private Map<String, String> invalidFields;

	public UserValidator(UserValidatorBuilderImpl userValidatorBuilderImpl) throws UserValidatorException {
		this.invalidFields = userValidatorBuilderImpl.invalidFields;
		
		if (!invalidFields.isEmpty()) {
			 throw new UserValidatorException("There are fields that have not been validated", invalidFields);
		}
		
	}

//////////////////////////// UserValidatorBuilderImpl class/////////////////////////////////////////////
	public static class UserValidatorBuilderImpl implements UserValidatorBuilder<UserValidator> {

		private Map<String, String> invalidFields = new HashMap<>();

		private final String ID_PATTERN = "\\d+";
		public UserValidatorBuilderImpl validateId(String userId) {
			if (userId != null && !userId.matches(ID_PATTERN)) {
				invalidFields.put("userId", userId);
			}
			return this;
		}

		private final String NICKNAME_PATTERN = "[\\w\\.]{4,}";
		public UserValidatorBuilderImpl validateNickName(String nickName) {
			if (nickName != null && !nickName.matches(NICKNAME_PATTERN)) {
				invalidFields.put("nickName", nickName);
			}			
			return this;
		}

		private final String EMAIL_PATTERN = "[\\w\\.]+@\\w+\\.\\w+";
		public UserValidatorBuilderImpl validateEmail(String email) {
			if (email != null && !email.matches(EMAIL_PATTERN)) {
				invalidFields.put("email", email);
			}
			return this;
		}

		private final String PHONE_NUMBER_PATTERN = "\\+375(29|44|25|33)\\-\\d{3}\\-\\d{2}-\\d{2}";
		public UserValidatorBuilderImpl validatePhoneNumber(String phoneNumber) { 
			if (phoneNumber != null && !phoneNumber.matches(PHONE_NUMBER_PATTERN)) {
				invalidFields.put("phoneNumber", phoneNumber);
			}
			return this;
		}

		@Override
		public UserValidator build() throws UserValidatorException { 
			return new UserValidator(this);
		}

	}
////////////////////////////////////////////////////////////////////////////////////////////////////



}
