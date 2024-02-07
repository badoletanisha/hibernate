package com.jsp.hibernate.jpa_manytoonemapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Owner {
	@Id
	private int oId;
	private String oName;
//	@OneToMany(mappedBy = "owner")
//	private List<House> hList=new ArrayList<House>();
//	
//	public List<House> gethList() {
//		return hList;
//	}
//	public void sethList(List<House> hList) {
//		this.hList = hList;
//	}
	public int getoId() {
		return oId;
	}
	public void setoId(int oId) {
		this.oId = oId;
	}
	public String getoName() {
		return oName;
	}
	public void setoName(String oName) {
		this.oName = oName;
	}
	@Override
	public String toString() {
		return "Owner [oId=" + oId + ", oName=" + oName + "]";
	}
	
}
