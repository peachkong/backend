package com.oulim.app.user.dto;

import java.util.Arrays;

public class OrganCertDTO {
	
    private int organCertNo;
    private int userNo;
    private int organNo;
    private String organFileSystemName;
    private String organFileOriginalName;
    
	
	public int getOrganCertNo() {
		return organCertNo;
	}

	public void setOrganCertNo(int organCertNo) {
		this.organCertNo = organCertNo;
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

	public String getOrganFileSystemName() {
		return organFileSystemName;
	}

	public void setOrganFileSystemName(String organFileSystemName) {
		this.organFileSystemName = organFileSystemName;
	}

	public String getOrganFileOriginalName() {
		return organFileOriginalName;
	}

	public void setOrganFileOriginalName(String organFileOriginalName) {
		this.organFileOriginalName = organFileOriginalName;
	}

	@Override
	public String toString() {
		return "OrganCertDTO [organCertNo=" + organCertNo + ", userNo=" + userNo + ", organNo=" + organNo
				+ ", organFileSystemName=" + organFileSystemName + ", organFileOriginalName=" + organFileOriginalName
				+ "]";
	}
	
}
