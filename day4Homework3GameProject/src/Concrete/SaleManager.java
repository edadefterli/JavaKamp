package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class SaleManager implements SaleService{

	@Override
	public void sale(User user, Game game) {
		System.out.println(user.getFirstName()+" adlý oyuncu " + game.getName()+" adlý oyunu satýn aldý.");
		
	}

	@Override
	public void saleWithCampaign(User user, Game game, Campaign campaign) {
		System.out.println(user.getFirstName()+" adlý oyuncu "+ campaign.getCampaignName()+" adlý kampanya ile " + game.getName()+" adlý oyunu satýn aldý.");
		
	}

}
