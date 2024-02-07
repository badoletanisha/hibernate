package com.jsp.hibernate.MyFirstHibProject;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="person")
public class Person {
	@Id
	private int pId;
	private String pName;
	private int pContact;
	@OneToOne
	//private PersonPan PersonPan;
	private PassPort passport;

	public PassPort getPassport() {
		return passport;
	}
	public void setPassport(PassPort passport) {
		this.passport = passport;
	}
//	public PersonPan getPersonPan() {
//		return PersonPan;
//	}
//	public void setPersonPan(PersonPan personPan) {
//		PersonPan = personPan;
//	}
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
