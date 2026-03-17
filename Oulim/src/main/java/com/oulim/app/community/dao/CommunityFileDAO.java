package com.oulim.app.community.dao;

import org.apache.ibatis.session.SqlSession;

import com.oulim.app.config.MyBatisConfig;

public class CommunityFileDAO {
	public SqlSession sqlSession;

	public CommunityFileDAO() {
		
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	
	
}
