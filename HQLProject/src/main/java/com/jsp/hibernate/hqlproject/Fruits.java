package com.jsp.hibernate.hqlproject;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Fruits {
	
		@Id
		private int fId;
		private String fName;
		private int fPrice;
		public int getfId() {
			return fId;
		}
		public void setfId(int fId) {
			this.fId = fId;
		}
		public String getfName() {
			return fName;
		}
		public void setfName(String fName) {
			this.fName = fName;
		}
		@Override
		public String toString() {
			return "Fruits [fId=" + fId + ", fName=" + fName + ", fPrice=" + fPrice + "]";
		}
		public int getfPrice() {
			return fPrice;
		}
		public void setfPrice(int fPrice) {
			this.fPrice = fPrice;
		}
	
}
