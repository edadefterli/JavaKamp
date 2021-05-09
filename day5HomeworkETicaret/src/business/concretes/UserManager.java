package day5HomeworkETicaret.business.concretes;

import day5HomeworkETicaret.business.abstracts.BaseRegisterService;
import day5HomeworkETicaret.business.abstracts.EMailVerificationService;
import day5HomeworkETicaret.business.abstracts.UserValidationService;
import day5HomeworkETicaret.core.abstracts.EmailService;
import day5HomeworkETicaret.dataAccess.abstracts.UserDao;
import day5HomeworkETicaret.entities.concretes.User;

public class UserManager extends BaseRegisterService{
	
	private UserValidationService validationService;
	private UserDao userDao;
	private EMailVerificationService verificationService;
	private EmailService emailService;
	
	

	public UserManager(UserValidationService validationService, UserDao userDao, EMailVerificationService verificationService, EmailService emailService) {
		this.validationService = validationService;
		this.userDao = userDao;
		this.verificationService = verificationService;
		this.emailService = emailService;
	}



	@Override
	public void register(User user) throws Exception {
		if(validationService.validate(user)) {
			if(userDao.getByMail(user.getMail())==null) {
				emailService.sendEmail(user.getMail());
				if(verificationService.activate()) {
					System.out.println("Kullan�c� sisteme ba�ar�yla kay�t edildi: "+user.getMail());
				}
				else {
					throw new Exception("E-Mail Do�rulanamad�.");
				}
			}
			else {
				throw new Exception("Bu email zaten sisteme kay�tl�.");
			}
		}
		else {
			throw new Exception("Kullan�c� bilgileri yanl��.");
		}
	}

}
