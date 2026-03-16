package com.oulim.app.community.dto;

public class PostLikeDTO {
//	CREATE TABLE TBL_POST_LIKE (
//			  Post_Like_No NUMBER,
//			  User_No NUMBER,
//			  Post_No NUMBER,
	
	private int postLikeNo;
	private int userNo;
	private int postNo;
	
	public int getPostLikeNo() {
		return postLikeNo;
	}

	public void setPostLikeNo(int postLikeNo) {
		this.postLikeNo = postLikeNo;
	}

	public int getUserNo() {
		return userNo;
	}
	
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public int getPostNo() {
		return postNo;
	}

	public void setPostNo(int postNo) {
		this.postNo = postNo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}		
}
