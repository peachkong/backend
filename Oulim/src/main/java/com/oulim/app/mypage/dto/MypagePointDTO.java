package com.oulim.app.mypage.dto;

//-- 포인트 적립 조회
//SELECT
//    LOG_REASON AS 포인트항목,
//    TO_CHAR(LOG_DATE, 'YYYY.MM.DD') AS 적립일,
//    CHANGE_AMOUNT AS 포인트
//FROM TBL_LOG_POINT
//WHERE USER_NO = 11
//  AND CHANGE_AMOUNT > 0
//ORDER BY LOG_DATE DESC, LOG_NO DESC;
//
//-- 포인트 사용 조회
//SELECT
//    LOG_REASON AS 포인트항목,
//    TO_CHAR(LOG_DATE, 'YYYY.MM.DD') AS 사용일,
//    ABS(CHANGE_AMOUNT) AS 포인트
//FROM TBL_LOG_POINT
//WHERE USER_NO = 11
//  AND CHANGE_AMOUNT < 0
//ORDER BY LOG_DATE DESC, LOG_NO DESC;
public class MypagePointDTO {
	String logReason;
	String logDate;
	int changeAmount;
	
	
}
