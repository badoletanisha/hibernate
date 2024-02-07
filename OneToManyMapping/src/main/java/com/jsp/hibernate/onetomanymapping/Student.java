package com.jsp.hibernate.onetomanymapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
@Id	
private int sId;
private String sName;
@OneToMany
private List<Subject> subList = new ArrayList<Subject>();


public List<Subject> getSubList() {
	return subList;
}
public void setSubList(List<Subject> subList) {
	this.subList = subList;
}
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
@Override
public String toString() {
	return "Student [sId=" + sId + ", sName=" + sName + "]";
}

}