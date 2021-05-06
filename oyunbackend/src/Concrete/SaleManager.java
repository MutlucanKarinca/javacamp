package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class SaleManager implements SaleService{

	@Override
	public void sale(User user, Game game, Campaign campaign) {
		double discountPrice = game.getGamePrice() - (game.getGamePrice()*campaign.getDiscount()/100);
		
		System.out.println(user.getFirstName()+" "+user.getLastName()+" adl� kullan�c� "+
		game.getGameName()+" oyununu "+campaign.getCampaingName()+" kampanyas� ile %" + 
				campaign.getDiscount()+" indirim oran� ile " + discountPrice+" TL'ye sat�n ald�.");
	}

}
