package com.oulim.app.admin.dao;

import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import com.oulim.app.config.MyBatisConfig;

public class AdmVolunDetaDAO {
    private SqlSession sqlSession;
    public AdmVolunDetaDAO() {
        sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
    }
    // =========================
    // 신청자 삭제
    // =========================
    public void deleteApplyUser(Map<String, Integer> paramMap) {
        System.out.println("\n========== [AdmVolunDetaDAO.deleteApplyUser START] ==========");
        // 1. 파라미터 확인
        System.out.println("전달받은 paramMap: " + paramMap);
        try {
            // 2. delete 실행
        	int result = sqlSession.update("AdmVolManDeta.deleteApplyUser", paramMap);
            // 3. 결과 확인
            System.out.println("delete 실행 결과 (영향받은 row): " + result);
            if (result > 0) {
                System.out.println("삭제 성공");
            } else {
                System.out.println("삭제 실패 (조건에 맞는 데이터 없음)");
            }
        } catch (Exception e) {
            System.out.println("삭제 중 오류 발생");
            e.printStackTrace();
        }
        System.out.println("========== [AdmVolunDetaDAO.deleteApplyUser END] ==========\n");
    }
}