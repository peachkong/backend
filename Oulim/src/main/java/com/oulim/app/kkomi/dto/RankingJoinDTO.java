package com.oulim.app.kkomi.dto;

public class RankingJoinDTO {
	private int userNo;
	private int rankPoint;
	private int ranking;
	private String userNickname;
	private int kkomiLev;
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public int getRankPoint() {
		return rankPoint;
	}
	public void setRankPoint(int rankPoint) {
		this.rankPoint = rankPoint;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	public int getKkomiLev() {
		return kkomiLev;
	}
	public void setKkomiLev(int kkomiLev) {
		this.kkomiLev = kkomiLev;
	}
	@Override
	public String toString() {
		return "RankingJoinDTO [userNo=" + userNo + ", rankPoint=" + rankPoint + ", ranking=" + ranking
				+ ", userNickname=" + userNickname + ", kkomiLev=" + kkomiLev + "]";
	}

	
}
