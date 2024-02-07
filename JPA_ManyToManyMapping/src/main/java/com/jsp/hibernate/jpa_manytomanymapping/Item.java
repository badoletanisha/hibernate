package com.jsp.hibernate.jpa_manytomanymapping;

public class Item {
	private int iId;
	private String iName;
	private int iPrice;
	
	
	public int getiId() {
		return iId;
	}
	public void setiId(int iId) {
		this.iId = iId;
	}
	public String getiName() {
		return iName;
	}
	public void setiName(String iName) {
		this.iName = iName;
	}
	public int getiPrice() {
		return iPrice;
	}
	public void setiPrice(int iPrice) {
		this.iPrice = iPrice;
	}
	@Override
	public String toString() {
		return "Item [iId=" + iId + ", iName=" + iName + ", iPrice=" + iPrice + "]";
	}
	
}
