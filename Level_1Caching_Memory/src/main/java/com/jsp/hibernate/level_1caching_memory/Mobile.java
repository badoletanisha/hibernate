package com.jsp.hibernate.level_1caching_memory;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {
@Id	
private int mobileId;
private String mobileName;
private int mobilePrice;
public int getMobileId() {
	return mobileId;
}
public void setMobileId(int mobileId) {
	this.mobileId = mobileId;
}
public String getMobileName() {
	return mobileName;
}
public void setMobileName(String mobileName) {
	this.mobileName = mobileName;
}
public int getMobilePrice() {
	return mobilePrice;
}
public void setMobilePrice(int mobilePrice) {
	this.mobilePrice = mobilePrice;
}
@Override
public String toString() {
	return "Mobile [mobileId=" + mobileId + ", mobileName=" + mobileName + ", mobilePrice=" + mobilePrice + "]";
}

}
