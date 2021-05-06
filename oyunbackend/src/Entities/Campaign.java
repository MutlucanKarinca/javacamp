package Entities;

import Abstract.Entity;

public class Campaign implements Entity{
	private int id;
	private String campaingName;
	private int discount;
	
	public Campaign(int id, String campaingName, int discount) {
		super();
		this.id = id;
		this.campaingName = campaingName;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaingName() {
		return campaingName;
	}

	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
}
