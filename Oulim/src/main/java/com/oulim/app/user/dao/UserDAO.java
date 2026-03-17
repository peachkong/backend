package com.oulim.app.user.dao;

import org.apache.ibatis.session.SqlSession;

import com.oulim.app.config.MyBatisConfig;
import com.oulim.app.user.dto.UserDTO;


public class UserDAO {
    SqlSession sqlSession;

    public UserDAO() {
        sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
    }

    public UserDTO login(UserDTO userDTO) {
    	return sqlSession.selectOne("user.login", userDTO);
    }
}