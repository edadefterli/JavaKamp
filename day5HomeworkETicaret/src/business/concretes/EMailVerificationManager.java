package day5HomeworkETicaret.business.concretes;

import java.util.Scanner;

import day5HomeworkETicaret.business.abstracts.EMailVerificationService;


public class EMailVerificationManager implements EMailVerificationService{

	@Override
	public boolean activate() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Doðrulama yapmak için 'Y' harfine giriniz.");
		String val = input.nextLine();
		if(val.equals("Y")) {
			return true;
		}
		return false;
	}
	

}
