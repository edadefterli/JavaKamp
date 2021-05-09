package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class SaleManager implements SaleService{

	@Override
	public void sale(User user, Game game) {
		System.out.println(user.getFirstName()+" adl� oyuncu " + game.getName()+" adl� oyunu sat�n ald�.");
		
	}

	@Override
	public void saleWithCampaign(User user, Game game, Campaign campaign) {
		System.out.println(user.getFirstName()+" adl� oyuncu "+ campaign.getCampaignName()+" adl� kampanya ile " + game.getName()+" adl� oyunu sat�n ald�.");
		
	}

}
