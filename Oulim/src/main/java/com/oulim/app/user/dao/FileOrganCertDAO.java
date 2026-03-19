package com.oulim.app.user.dao;

import org.apache.ibatis.session.SqlSession;

import com.oulim.app.config.MyBatisConfig;
import com.oulim.app.user.dto.OrganCertDTO;

public class FileOrganCertDAO {
	public SqlSession sqlSession;

	public FileOrganCertDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	public void insert(OrganCertDTO organCertDTO) {
		System.out.println("PDF 파일 DAO - 파일 저장 : " + organCertDTO);

		try {
			int result = sqlSession.insert("user.insertPdf", organCertDTO);
			System.out.println("파일 저장 완료 - DB에 저장된 행의 수 : " + result);
		} catch (Exception e) {
			System.out.println("파일 저장 실패 : " + e.getMessage());
			e.printStackTrace();
		}
	}
}