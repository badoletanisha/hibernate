package com.jsp.hibernate.ManyToManyMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity

public class Item {
	@Id
private int iId;
private String iName;
private int iPrice;
@ManyToMany(mappedBy = "itemsList")
private List<Cart> cartList = new ArrayList<Cart>();

public List<Cart> getCartList() {
	return cartList;
}
public void setCartList(List<Cart> cartList) {
	this.cartList = cartList;
}
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
}
