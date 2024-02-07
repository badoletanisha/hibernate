package com.jsp.hibernate.hqlproject;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Company {
	@Id
private int cId;
private String cName;
private String department;

public int getcId() {
	return cId;
}
public void setcId(int cId) {
	this.cId = cId;
}
public String getcName() {
	return cName;
}
public void setcName(String cName) {
	this.cName = cName;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}

@Override
public String toString() {
	return "Company [cId=" + cId + ", cName=" + cName + ", department=" + department + "]";
}

}
