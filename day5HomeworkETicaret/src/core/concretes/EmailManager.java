package day5HomeworkETicaret.core.concretes;

import day5HomeworkETicaret.core.abstracts.EmailService;

public class EmailManager implements EmailService {

	@Override
	public void sendEmail(String message) {
		// TODO Auto-generated method stub
		System.out.println("Email baþarýyla gönderildi: "+message);
	}

}
