package com.oulim.app.community.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.oulim.app.community.dto.PostImageDTO;
import com.oulim.app.config.MyBatisConfig;

public class CommunityFileDAO {
	public SqlSession sqlSession;

	public CommunityFileDAO() {
		
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void insert(PostImageDTO postImageDTO) {
		System.out.println("이미지 파일 DAO - 파일 저장 : " + postImageDTO);
		
		try {
			int result = sqlSession.insert("communityFile.insertImage", postImageDTO);
			System.out.println("파일 저장 완료 - DB에 저장된 행의 수 : " + result);
			// db저장 확인
			List<PostImageDTO> uploadImage = select(postImageDTO.getPostNo());
			System.out.println("db에서 가져온 파일 : " + uploadImage);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("파일 저장 실패 : " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public List<PostImageDTO> select(int postNo){
		System.out.println("게시글 이미지 DAO - 이미지 파일 조회 메소드");
		return sqlSession.selectList("communityFile.selectImage", postNo);
	}
	
	public void delete(int postNo) {
		sqlSession.delete("communityFile.deleteImage", postNo);
	}
}
