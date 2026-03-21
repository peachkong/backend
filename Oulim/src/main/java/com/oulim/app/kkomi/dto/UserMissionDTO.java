package com.oulim.app.kkomi.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.oulim.app.common.util.DefineType;

public class UserMissionDTO {
//	CREATE TABLE TBL_USER_MISSION(
//			Mission_ID NUMBER,
//			User_No NUMBER,
//			MISSION_COUNT NUMBER,
//			MISSION_IS_REWARD NUMBER(1),
//			Mission_last_update_date date,
//			CONSTRAINT PK_TBL_USER_MISSION PRIMARY KEY(Mission_ID, User_No),
//			CONSTRAINT FK_USERMISSION_USER FOREIGN KEY(User_No) REFERENCES TBL_USER(User_No) ON DELETE CASCADE,
//			CONSTRAINT FK_USERMISSION_MISSION FOREIGN KEY(Mission_ID) REFERENCES TBL_MISSION(Mission_ID) ON DELETE CASCADE
//	  Mission_ID NUMBER,
//	  Mission_Name VARCHAR2(30) NOT NULL,
//	  Mission_Detail VARCHAR2(50) NOT NULL,
//	  Mission_NeedCount NUMBER NOT NULL,
//	  Reward_ID NUMBER NOT NULL,
//	  MISSION_TYPE NUMBER(2) NOT NULL,
//		);


	private int missionID; 	// 미션ID
	private int userNo; // 유저 번호
	private String missionName; // 미션 제목
	private String missionDetail; // 미션 내용
	private int missionCurrCount; // 진행 횟수
	private int missionNeedCount; // 총 횟수
	private boolean missionIsReward; // 보상 수령 여부
	private LocalDateTime lastUpdateDate; // 마지막 미션 변동 시기 
	private int missionType; // 미션 타입
	private int rewardCount;
	
	public boolean isNeedReset() {
		return this.missionType == DefineType.DAILY_MISSION &&
				(lastUpdateDate == null || lastUpdateDate.toLocalDate().isBefore(LocalDate.now()));
	}
	public int getMissionID() {
		return missionID;
	}
	public void setMissionID(int missionID) {
		this.missionID = missionID;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getMissionName() {
		return missionName;
	}
	public void setMissionName(String missionName) {
		this.missionName = missionName;
	}
	public String getMissionDetail() {
		return missionDetail;
	}
	public void setMissionDetail(String missionDetail) {
		this.missionDetail = missionDetail;
	}
	public int getMissionCurrCount() {
		return missionCurrCount;
	}
	public void setMissionCurrCount(int missionCurrCount) {
		this.missionCurrCount = missionCurrCount;
	}
	public int getMissionNeedCount() {
		return missionNeedCount;
	}
	public void setMissionNeedCount(int missionNeedCount) {
		this.missionNeedCount = missionNeedCount;
	}
	public boolean isMissionIsReward() {
		return missionIsReward;
	}
	public void setMissionIsReward(boolean missionIsReward) {
		this.missionIsReward = missionIsReward;
	}
	public LocalDateTime getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(LocalDateTime lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public int getMissionType() {
		return missionType;
	}
	public void setMissionType(int missionType) {
		this.missionType = missionType;
	}
	public int getRewardCount() {
		return rewardCount;
	}
	public void setRewardCount(int rewardCount) {
		this.rewardCount = rewardCount;
	}
	@Override
	public String toString() {
		return "UserMissionDTO [missionID=" + missionID + ", userNo=" + userNo + ", missionName=" + missionName
				+ ", missionDetail=" + missionDetail + ", missionCurrCount=" + missionCurrCount + ", missionNeedCount="
				+ missionNeedCount + ", missionIsReward=" + missionIsReward + ", lastUpdateDate=" + lastUpdateDate
				+ ", missionType=" + missionType + ", rewardCount=" + rewardCount + "]";
	}

}
