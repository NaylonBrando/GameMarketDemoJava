package Business.Concrate;

import Business.Abstract.GameSaleService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class GameSaleManager implements GameSaleService {

	@Override
	public void SellWithCampaign(Game game, Customer customer, Campaign campaign) {
		double fiyat = game.getPrice() - (game.getPrice() * campaign.getCampaignDiscount() / 100);

		System.out.println(customer.getFirstName() + " oyuncusuna " + game.getPrice() + " degerindeki " + game.getName()
				+ " adli oyun " + campaign.getName() + " kampanyasi kapsaminda yüzde " + campaign.getCampaignDiscount()
				+ " indirimle " + fiyat + " fiyatina satilmistir.");

	}

	@Override
	public void Sell(Game game, Customer customer) {
		System.out.println(customer.getFirstName() + " oyuncusuna " + game.getPrice() + " degerindeki " + game.getName()
				+ " adli oyun " + game.getPrice() + " fiyatina satilmistir.");

	}

}
