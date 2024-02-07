package com.jsp.hibernate.onetomanymapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehical {
@Id	
private int vId;
private String vName;

public int getvId() {
	return vId;
}
public void setvId(int vId) {
	this.vId = vId;
}
public String getvName() {
	return vName;
}
public void setvName(String vName) {
	this.vName = vName;
}
@Override
public String toString() {
	return "Vehical [vId=" + vId + ", vName=" + vName + "]";
}
	
}