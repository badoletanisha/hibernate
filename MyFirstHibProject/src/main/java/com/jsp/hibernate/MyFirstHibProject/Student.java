package com.jsp.hibernate.MyFirstHibProject;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {
	
@Id	
private int sId;
private String sName;
private long sContact;
private double sPercentage;
public int getsId() {
	return sId;
}

public void setsId(int sId) {
	this.sId = sId;
}
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
public long getsContact() {
	return sContact;
}
public void setsContact(long sContact) {
	this.sContact = sContact;
}
public double getsPercentage() {
	return sPercentage;
}
public void setsPercentage(double sPercentage) {
	this.sPercentage = sPercentage;
}

@Override
public String toString() {
	return "Student [sId=" + sId + ", sName=" + sName + ", sContact=" + sContact + ", sPercentage=" + sPercentage + "]";
}
}
