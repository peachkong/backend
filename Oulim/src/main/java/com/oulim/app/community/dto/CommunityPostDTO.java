package com.oulim.app.community.dto;

public class CommunityPostDTO {
//	CREATE TABLE TBL_COMMUNITY_POST (
//			  Post_No NUMBER,
//			  User_No NUMBER,
//			  Post_Title VARCHAR2(100) NOT NULL,
//			  Post_Content VARCHAR2(4000) NOT NULL,
//			  Post_Date DATE DEFAULT SYSDATE NOT NULL,
//			  Post_View_Count NUMBER DEFAULT 0 NOT NULL,
//			  User_Nickname VARCHAR2(20),
//			  CONSTRAINT PK_TBL_COMMUNITY_POST PRIMARY KEY (Post_No),
//			  CONSTRAINT FK_COMMUNITY_POST_USER FOREIGN KEY (User_No) REFERENCES TBL_USER(User_No) ON DELETE SET NULL
//			);
	private int postNo;
	private int userNo;
	private String postTitle;
	private String postContent;
	private String postDate;
	private int postViewCount;
	private String userNickname;
	
	public int getPostNo() {
		return postNo;
	}
	public void setPostNo(int postNo) {
		this.postNo = postNo;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getPostTitle() {
		return postTitle;
	}
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	public String getPostContent() {
		return postContent;
	}
	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}
	public String getPostDate() {
		return postDate;
	}
	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}
	public int getPostViewCount() {
		return postViewCount;
	}
	public void setPostViewCount(int postViewCount) {
		this.postViewCount = postViewCount;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}	
}
