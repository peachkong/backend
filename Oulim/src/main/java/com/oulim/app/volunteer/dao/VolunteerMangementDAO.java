package com.oulim.app.volunteer.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.oulim.app.config.MyBatisConfig;
import com.oulim.app.volunteer.dto.VolunActivityDTO;

public class VolunteerMangementDAO {

	public SqlSession sqlSession;

	public VolunteerMangementDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<VolunActivityDTO> selectVolManageList(VolunActivityDTO volunActivityDTO) {
		return sqlSession.selectList("VolunteerManagement.volManageSelect", volunActivityDTO);
	}

}
