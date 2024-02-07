package com.jsp.hibernate.CriteriaQuery;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Consumer {
	@Id
	private int consumerId;
	private String consumerName;
	private String consumerlocation;
	@OneToMany
	List<Product> ProductList =new ArrayList<Product>();
	
	public List<Product> getProductList() {
		return ProductList;
	}
	public void setProductList(List<Product> productList) {
		ProductList = productList;
	}
	public int getConsumerId() {
		return consumerId;
	}
	public void setConsumerId(int consumerId) {
		this.consumerId = consumerId;
	}
	public String getConsumerName() {
		return consumerName;
	}
	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}
	public String getConsumerlocation() {
		return consumerlocation;
	}
	public void setConsumerlocation(String consumerlocation) {
		this.consumerlocation = consumerlocation;
	}
	@Override
	public String toString() {
		return "Consumer [consumerId=" + consumerId + ", consumerName=" + consumerName + ", consumerlocation="
				+ consumerlocation + "]";
	}
	
}
