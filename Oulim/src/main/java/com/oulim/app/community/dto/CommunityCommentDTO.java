package com.oulim.app.community.dto;

public class CommunityCommentDTO {
//	CREATE TABLE TBL_COMMUNITY_COMMENT (
//			  Comment_No NUMBER,
//			  User_No NUMBER,
//			  Post_No NUMBER NOT NULL,
//			  User_Nickname VARCHAR2(50) NOT NULL,
//			  COMMENT_Content VARCHAR2(100) NOT NULL,
//			  Post_Date DATE DEFAULT SYSDATE NOT NULL,
	private int commentNo;
	private int userNo;
	private int postNo;
	private String userNickname;
	private String commentContent;
	private String postDate;
	
	public int getCommentNo() {
		return commentNo;
	}
	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
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
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public String getPostDate() {
		return postDate;
	}
	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
