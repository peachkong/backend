package com.oulim.app.kkomi.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.oulim.app.config.MyBatisConfig;
import com.oulim.app.kkomi.dto.KkomiDTO;
import com.oulim.app.kkomi.dto.KkomiJoinDTO;
import com.oulim.app.kkomi.dto.RankingDTO;
import com.oulim.app.kkomi.dto.RankingJoinDTO;
import com.oulim.app.kkomi.dto.UserMissionDTO;

public class KkomiDAO {
	SqlSession sqlSession;
	
	public KkomiDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public KkomiDAO(SqlSession session) {
		this.sqlSession = session;
	}
	
	public KkomiJoinDTO getKkomiInfo(int userNo) {
		System.out.println("꼬미 정보 조회 - getKkomiInfo");		
		return sqlSession.selectOne("kkomi.selectKkomiJoin",userNo);
	}
	
	public KkomiDTO getOnlyKkomi(int userNo) {
		System.out.println("나의 꼬미 정보 조회 - getMyKkomi");
		return sqlSession.selectOne("kkomi.selectKkomi", userNo);
	}
	
	public boolean upsertKkomi(KkomiDTO kkomi) {
		System.out.println("꼬미 도력 쌓기 수행 - upsertKkomi");
		int result = sqlSession.update("kkomi.upsertKkomi",kkomi);
		return result < 1 ? false : true;
	}
	
	public List<RankingJoinDTO> getRankingInfo(int userNo) {
		System.out.println("랭킹 상위권 및 내 랭킹 조회 - getRankingInfo");
		return sqlSession.selectList("kkomi.selectTopRanking", userNo);
	}
	
	public RankingJoinDTO getMyRankingJoinInfo(int userNo) {
		System.out.println("조인된 나의 랭킹 정보 조회 - getMyRankingJoinInfo");
		return sqlSession.selectOne("kkomi.selectMyJoinRanking", userNo);
	}
	
	public RankingDTO getMyRanking(int userNo) {
		System.out.println("내 랭킹 정보 조회 - getMyRanking");
		return sqlSession.selectOne("kkomi.selectMyRanking", userNo);
	}
	
	public boolean upsertRanking(RankingDTO ranking) {
		System.out.println("랭킹 갱신 - upsertRanking");
		int result = sqlSession.update("kkomi.upsertRanking", ranking);
		return result < 1 ? false : true;
	}
	
	public List<UserMissionDTO> getMyMission(int userNo){
		System.out.println("미션 조회 - getMyMission");
		return sqlSession.selectList("kkomi.selectUserMission", userNo);
	}
	
	public boolean upsertMission(UserMissionDTO userMission) {
		System.out.println("미션 정보 수정");
		int result = sqlSession.update("kkomi.upsertUserMission", userMission);
		return result < 1 ? false : true;
	}
}
