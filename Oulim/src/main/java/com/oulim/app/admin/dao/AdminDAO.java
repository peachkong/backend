package com.oulim.app.admin.dao;

import org.apache.ibatis.session.SqlSession; 
import com.oulim.app.admin.dto.AdminDTO; 
import com.oulim.app.config.MyBatisConfig; 


public class AdminDAO {
    SqlSession sqlSession;
    
    public AdminDAO() {
        sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(false);
    }
//mybatis가 맵퍼로 보냄
    public AdminDTO login(AdminDTO adminDTO) {
        return sqlSession.selectOne("admin.login", adminDTO );
    }
}