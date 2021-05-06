package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi : " +campaign.getCampaingName() +  " - " + 
	"Ýndirim oraný : % "+ campaign.getDiscount());	
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi : " +campaign.getCampaingName() +  " - " + 
	"Ýndirim oraný : % "+ campaign.getDiscount());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi :" + campaign.getCampaingName());
		
	}

}
