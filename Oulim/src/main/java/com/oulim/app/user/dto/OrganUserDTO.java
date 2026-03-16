package com.oulim.app.user.dto;

public class OrganUserDTO {
	
	private int userNo;
	private int organNo;
	
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public int getOrganNo() {
		return organNo;
	}
	public void setOrganNo(int organNo) {
		this.organNo = organNo;
	}
	
	@Override
	public String toString() {
		return "OrganUserDTO [userNo=" + userNo + ", organNo=" + organNo + "]";
	}
	
}
