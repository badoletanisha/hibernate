package com.jsp.hibernate.MyFirstHibProject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Passport")
public class PassPort {
	
@Id	
private int PassPortId;
private String NameOnPassport;

public int getPassPortId() {
	return PassPortId;
}
public void setPassPortId(int passPortId) {
	PassPortId = passPortId;
}
public String getNameOnPassport() {
	return NameOnPassport;
}
public void setNameOnPassport(String nameOnPassport) {
	NameOnPassport = nameOnPassport;
}
@Override
public String toString() {
	return "PassPort [PassPortId=" + PassPortId + ", NameOnPassport=" + NameOnPassport + "]";
}

	
	
	
	
}
