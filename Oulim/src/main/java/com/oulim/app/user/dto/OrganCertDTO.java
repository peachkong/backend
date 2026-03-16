package com.oulim.app.user.dto;

import java.util.Arrays;

public class OrganCertDTO {
	
	private int organCertNum;
	private int userNo;
	private int organNo;
	private byte[] organCertFile;
	
	public int getOrganCertNum() {
		return organCertNum;
	}
	public void setOrganCertNum(int organCertNum) {
		this.organCertNum = organCertNum;
	}
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
	public byte[] getOrganCertFile() {
		return organCertFile;
	}
	public void setOrganCertFile(byte[] organCertFile) {
		this.organCertFile = organCertFile;
	}
	
	@Override
	public String toString() {
		return "OrganCertDTO [organCertNum=" + organCertNum + ", userNo=" + userNo + ", organNo=" + organNo
				+ ", organCertFile=" + Arrays.toString(organCertFile) + "]";
	}
	
	
}
