package Entities;

public class Campaign {
	private int id;
	private int gameId;
	private String name;
	private int campaignDiscount;
	
	public Campaign(int gameId, String name, int campaignDiscount) {
		this.gameId = gameId;
		this.name = name;
		this.campaignDiscount=campaignDiscount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCampaignDiscount() {
		return campaignDiscount;
	}

	public void setCampaignDiscount(int campaignDiscount) {
		this.campaignDiscount = campaignDiscount;
	}

}
