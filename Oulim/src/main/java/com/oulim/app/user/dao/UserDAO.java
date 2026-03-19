package com.oulim.app.user.dao;

import org.apache.ibatis.session.SqlSession;

import com.oulim.app.config.MyBatisConfig;
import com.oulim.app.user.dto.OrganDTO;
import com.oulim.app.user.dto.UserDTO;


public class UserDAO {
    SqlSession sqlSession;

    public UserDAO() {
        sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
    }
    
    public int checkId(String userId) {
    	return sqlSession.selectOne("user.chkUserId", userId);
    }
    
    public int checkEmail(String userEmail) {
    	return sqlSession.selectOne("user.chkUserEmail", userEmail);
    }
    
    public int checkNickname(String userNickname) {
    	return sqlSession.selectOne("user.chkUserId", userNickname);
    }
    
    public int checkPhoneNum(String userPhoneNum) {
    	return sqlSession.selectOne("user.chkUserPhoneNum", userPhoneNum);
    }
    
    public void normaljoin(UserDTO userDTO) {
    	sqlSession.insert("user.normaljoin", userDTO);
    }
    
    public OrganDTO selectOrganByCertNum(String organCertNum) {
        return sqlSession.selectOne("user.selectOrganByCertNum", organCertNum);
    }

    public void organjoin(UserDTO userDTO) {
    	sqlSession.insert("user.organjoin", userDTO);
    }
    
    public void insertorgan(OrganDTO organDTO) {
    	sqlSession.insert("user.insertorgan", organDTO);
    }
    
    public UserDTO login(UserDTO userDTO) {
    	return sqlSession.selectOne("user.login", userDTO);
    }
    
    public String findId(UserDTO userDTO) {
        return sqlSession.selectOne("user.findId", userDTO);
    }
    
    public UserDTO findPw(UserDTO userDTO) {
    	return sqlSession.selectOne("user.findPw", userDTO);
    }
    
    public void updatePw(UserDTO userDTO) {
    	sqlSession.update("user.updatePw", userDTO);
    }
}