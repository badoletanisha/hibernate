package com.jsp.hibernate.ManyToManyMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity

public class Cart {
	@Id	
	private int cId;
	private int cCapacity;

	@ManyToMany
	private List<Item> itemsList =new ArrayList<Item>();

	public List<Item> getItemsList() {
		return itemsList;
	}
	public void setItemsList(List<Item> itemsList) {
		this.itemsList = itemsList;
	}

	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public int getcCapacity() {
		return cCapacity;
	}
	public void setcCapacity(int cCapacity) {
		this.cCapacity = cCapacity;
	}
	@Override
	public String toString() {
		return "Cart [cId=" + cId + ", cCapacity=" + cCapacity + "]";
	}
}
