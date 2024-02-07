package com.jsp.hibernate.jpa_onetoonemapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Person {
	@Id
	private int pId;
	private String pName;
	private int pContact;
	
	@OneToOne
	private PassPort passport;
	
	public PassPort getPassport() {
		return passport;
	}
	public void setPassport(PassPort passport) {
		this.passport = passport;
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
	public int getpContact() {
		return pContact;
	}
	public void setpContact(int pContact) {
		this.pContact = pContact;
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", pContact=" + pContact + "]";
	}
	
	
}
