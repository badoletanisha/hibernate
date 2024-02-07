package com.jsp.hibernate.MyFirstHibProject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pan")
public class PersonPan {
	@Id
	private int  panId;
	private String  nameOnPan;
	private  String locOnPan;

	public int getPanId() {
		return panId;
	}
	public void setPanId(int panId) {
		this.panId = panId;
	}
	public String getNameOnPan() {
		return nameOnPan;
	}
	public void setNameOnPan(String nameOnPan) {
		this.nameOnPan = nameOnPan;
	}
	public String getLocOnPan() {
		return locOnPan;
	}
	public void setLocOnPan(String locOnPan) {
		this.locOnPan = locOnPan;
	}
	@Override
	public String toString() {
		return "PersonPan [panId=" + panId + ", nameOnPan=" + nameOnPan + ", locOnPan=" + locOnPan + "]";
	}


}
