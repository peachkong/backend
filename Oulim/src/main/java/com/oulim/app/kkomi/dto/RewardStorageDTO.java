package com.oulim.app.kkomi.dto;

public class RewardStorageDTO {
//	CREATE TABLE TBL_REWARD_STORAGE (
//			  Reward_ID NUMBER,
//			  User_No NUMBER,
//			  REWARD_COUNT NUMBER,
//			  CONSTRAINT PK_TBL_REWARD_STORAGE PRIMARY KEY (Reward_ID,User_No),
//			  CONSTRAINT FK_REWARD_STORAGE_USER FOREIGN KEY (User_No) REFERENCES TBL_USER(User_No) ON DELETE CASCADE,
//			  CONSTRAINT FK_REWARD_STORAGE_REWARD FOREIGN KEY (Reward_ID) REFERENCES TBL_REWARD(Reward_ID) ON DELETE CASCADE
//			);

	private int rewardId;
	private int userNo;
	private int rewardCount;

	public int getRewardId() {
		return rewardId;
	}

	public void setRewardId(int rewardId) {
		this.rewardId = rewardId;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public int getRewardCount() {
		return rewardCount;
	}

	public void setRewardCount(int rewardCount) {
		this.rewardCount = rewardCount;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
