package com.jsp.hibernate.onetomanymapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {
@Id
private int pId;
private String pName;
@OneToMany
private List<Vehical> vlist = new ArrayList<Vehical>();

public List<Vehical> getVlist() {
	return vlist;
}
public void setVlist(List<Vehical> vlist) {
	this.vlist = vlist;
}
public int getpId() {
	return pId;
}
public void setpId(int pId) {
	this.pId = pId;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
@Override
public String toString() {
	return "Person [pId=" + pId + ", pName=" + pName + "]";
}

}