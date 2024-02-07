package com.jsp.hibernate.Mapping;
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
	@OneToMany(mappedBy = "owner")
	private List<House> hlist =new ArrayList<House>();

	public List<House> getHlist() {
		return hlist;
	}
	public void setHlist(List<House> hlist) {
		this.hlist = hlist;
	}
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
		return "Owner [oId=" + oId + ", oName=" + oName + ", hlist=" + hlist + "]";
	}
	
}