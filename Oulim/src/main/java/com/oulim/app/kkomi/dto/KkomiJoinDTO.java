package com.oulim.app.kkomi.dto;

public class KkomiJoinDTO {
	private int userNo;
	private int kkomiId;
	private int kkomiLev;
	private int kkomiExp;
	private int point;
	private int myRanking;
	
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public int getKkomiId() {
		return kkomiId;
	}
	public void setKkomiId(int kkomiId) {
		this.kkomiId = kkomiId;
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
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getMyRanking() {
		return myRanking;
	}
	public void setMyRanking(int myRanking) {
		this.myRanking = myRanking;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}	
}
