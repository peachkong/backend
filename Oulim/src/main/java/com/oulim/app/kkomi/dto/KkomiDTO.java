package com.oulim.app.kkomi.dto;

public class KkomiDTO {
//	CREATE TABLE TBL_KKOMI (
//			  User_No NUMBER,
//			  Kkomi_No NUMBER,
//			  Kkomi_Lev NUMBER NOT NULL,
//			  Kkomi_Exp NUMBER DEFAULT 0 NOT NULL,
//			  CONSTRAINT PK_TBL_KKOMI PRIMARY KEY (User_No),
//			  CONSTRAINT FK_KKOMI_USER FOREIGN KEY (User_No) REFERENCES TBL_USER(User_No) ON DELETE CASCADE
//			);

	private int userNo;
	private int kkomiNo;
	private int kkomiLev;
	private int kkomiExp;

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public int getKkomiNo() {
		return kkomiNo;
	}

	public void setKkomiNo(int kkomiNo) {
		this.kkomiNo = kkomiNo;
	}

	public int getKkomiLev() {
		return kkomiLev;
	}

	public void setKkomiLev(int kkomiLev) {
		this.kkomiLev = kkomiLev;
	}

	public int getKkomiExp() {
		return kkomiExp;
	}

	public void setKkomiExp(int kkomiExp) {
		this.kkomiExp = kkomiExp;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
