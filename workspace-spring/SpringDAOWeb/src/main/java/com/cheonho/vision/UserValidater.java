package com.cheonho.vision;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UserValidater implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// 검증하려는 객체가 User타입인지 확인
//		return User.class.equals(clazz);
		return User.class.isAssignableFrom(clazz);      // clazz가 User또는 그 자손인지 확인
	}

	@Override
	public void validate(Object target, Errors errors) {
		User user = (User) target;
		String id = user.getId();
		
		//user 객체를 검증하는 내용
//		if(id == null || "".equals(id.trim())) {}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pwd", "required");
		
		//id가 5~12 사이가 아니면 id라는 필드에 에러코드 저장
		if(id == null || id.length() < 5 || id.length() > 12) {
			errors.rejectValue("id", "invalidLength", new String[] {"5", "12"}, null);
		}
	}

}
