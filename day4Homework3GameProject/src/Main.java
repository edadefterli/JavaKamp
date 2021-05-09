import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.SaleManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager(new MernisServiceAdapter());
		CampaignManager campaignManager = new CampaignManager();
		GameManager gameManager = new GameManager();
		SaleManager saleManager = new SaleManager();
		
		User user1 = new User(1,"Edanur","Defterli","1999","00000000000");
		Game game1 = new Game(1,"New Game1","Game1",100);
		Campaign campaign1 = new Campaign(1,"Campaign1","New Campaign1",50);
		
		try {
			userManager.add(user1);
			gameManager.add(game1);
			campaignManager.add(campaign1);
			saleManager.sale(user1, game1);
			saleManager.saleWithCampaign(user1, game1, campaign1);
		}
		catch(Exception e){
			System.out.println(e);
		}
		

	}

}
