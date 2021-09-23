package Business.Concrate;

import Business.Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya olusturuldu!");
		
	}

	@Override
	public void delete(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Campaign[] getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Campaign getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
