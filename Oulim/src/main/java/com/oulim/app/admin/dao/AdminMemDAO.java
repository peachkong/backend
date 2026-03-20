package com.oulim.app.admin.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.oulim.app.admin.dto.AdminMemDetailDTO;
import com.oulim.app.admin.dto.AdminMemListDTO;
import com.oulim.app.config.MyBatisConfig;

public class AdminMemDAO {
	
	public SqlSession sqlSession;
	
	
    public AdminMemDAO() {
    	sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
    } 
        //관리자 멤버 선택리스트
    public List<AdminMemListDTO> selectList(AdminMemListDTO adminMemListDTO) {
    	System.out.println("");
        return sqlSession.selectList("adminMem.selectList", adminMemListDTO);
    }
    	//관리자 회원 카운트
    public int selectCount(AdminMemListDTO adminMemListDTO) {
        return sqlSession.selectOne("adminMem.selectCount", adminMemListDTO);
    }
    	//관리자 멤서 상세
    public AdminMemDetailDTO selectDetail(int userNo) {
        return sqlSession.selectOne("adminMem.selectDetail", userNo);
    }


}
