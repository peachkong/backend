package com.oulim.app.admin.dto;

public class AdminDTO {
	
//	CREATE TABLE tbl_admin_account(
//			Admin_No number,
//			Admin_Id varchar2(20)NOT null,
//			Admin_Pw varchar2(20)NOT null,
//			Admin_Email varchar2(50) NOT NULL,
//			CONSTRAINT pk_admin PRIMARY KEY(Admin_No),
//			CONSTRAINT uk_email UNIQUE(Admin_Email)
//		);
	
	private int adminNum;
	private String adminId;
	private String adminPw;
	private String adminEmail;

	
	

	int getAdminNum() {
		return adminNum;
	}
	public void setAdminNum(int adminNum) {
		this.adminNum = adminNum;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminPw() {
		return adminPw;
	}
	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
}
