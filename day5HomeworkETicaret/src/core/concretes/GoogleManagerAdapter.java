package day5HomeworkETicaret.core.concretes;

import day5HomeworkETicaret.Google.GoogleManager;
import day5HomeworkETicaret.core.abstracts.RegisterService;
import day5HomeworkETicaret.entities.concretes.User;

public class GoogleManagerAdapter implements RegisterService {

	@Override
	public void register(User user) {
		GoogleManager googleManager = new GoogleManager();
		googleManager.register(user.getMail());
	}

}
