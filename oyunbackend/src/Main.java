import java.util.Date;

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
		User user1=new User(1,"Engin","Demiroð",new Date(1985,1,6),"28861499108");
		
		Game game1=new Game(1,"AoE 2",30);
		
		Campaign campaign1=new Campaign(1,"Yaz Ýndirimi",20);
		
		UserManager userManager=new UserManager(new MernisServiceAdapter());
		GameManager gameManager=new GameManager();
		CampaignManager campaignManager=new CampaignManager();
		SaleManager saleManager=new SaleManager();
		
		userManager.add(user1);
		gameManager.add(game1);
		campaignManager.add(campaign1);
		saleManager.sale(user1, game1, campaign1);
	}

}
