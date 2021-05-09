package day5HomeworkETicaret.business.concretes;

import day5HomeworkETicaret.business.abstracts.UserValidationService;
import day5HomeworkETicaret.entities.concretes.User;
import java.util.regex.Pattern;

public class UserValidationManager implements UserValidationService {
	private static final String eMailPattern =  "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

	@Override
	public boolean validate(User user) {
		if(!user.getFirstName().isEmpty() && !user.getLastName().isEmpty() && !user.getMail().isEmpty() && !user.getPassword().isEmpty()) {
			if(user.getPassword().length()<6){
				return false;
			}
			if(user.getFirstName().length()<2 || user.getLastName().length()<2) {
				return false;
			}
			if(!Pattern.compile(eMailPattern).matcher(user.getMail()).matches()) {
				return false;
			}
			return true;
		}
		return false;
	}

}
