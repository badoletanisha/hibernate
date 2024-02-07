package com.jsp.hibernate.jpa_manytoonemapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class House {
	@Id
	private int hId;
	private String hLoction;
	private int hRent;
	@ManyToOne
	private Owner owner;
	
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public int gethId() {
		return hId;
	}
	public void sethId(int hId) {
		this.hId = hId;
	}
	public String gethLoction() {
		return hLoction;
	}
	public void sethLoction(String hLoction) {
		this.hLoction = hLoction;
	}
	public int gethRent() {
		return hRent;
	}
	public void sethRent(int hRent) {
		this.hRent = hRent;
	}
	@Override
	public String toString() {
		return "House [hId=" + hId + ", hLoction=" + hLoction + ", hRent=" + hRent + "]";
	}
	
}
