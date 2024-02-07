package com.jsp.hibernate.JPA_OneToManyMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {
@Id
	private int subId;
	private String subName;
	
	
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	@Override
	public String toString() {
		return "Subject [subId=" + subId + ", subName=" + subName + "]";
	}
	
}
