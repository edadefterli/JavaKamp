package Entities;

public class Campaign {
	
	private int id;
	private String campaignName;
	private String campaignContent;
	private double discount;
	
	public Campaign() {
		
	}
	public Campaign(int id, String campaignName, String campaignContent, double discount) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.campaignContent = campaignContent;
		this.discount = discount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public String getCampaignContent() {
		return campaignContent;
	}
	public void setCampaignContent(String campaignContent) {
		this.campaignContent = campaignContent;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	

}
