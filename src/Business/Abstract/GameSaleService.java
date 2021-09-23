package Business.Abstract;


import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface GameSaleService {
	public void SellWithCampaign(Game game, Customer customer, Campaign campaign);
	public void Sell(Game game, Customer customer);

}
