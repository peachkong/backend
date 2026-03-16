package com.oulim.app.user.dto;

public class OrganDTO {
	
	private int organNo;
	private String organName;
	private String organCert;
	
	public int getOrganNo() {
		return organNo;
	}
	public void setOrganNo(int organNo) {
		this.organNo = organNo;
	}
	public String getOrganName() {
		return organName;
	}
	public void setOrganName(String organName) {
		this.organName = organName;
	}
	public String getOrganCert() {
		return organCert;
	}
	public void setOrganCert(String organCert) {
		this.organCert = organCert;
	}
	
	@Override
	public String toString() {
		return "OrganDTO [organNo=" + organNo + ", organName=" + organName + ", organCert=" + organCert + "]";
	}
	
}
