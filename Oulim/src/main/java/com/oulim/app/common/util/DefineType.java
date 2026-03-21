package com.oulim.app.common.util;

import java.time.LocalDate;
import java.time.LocalDateTime;

// 백단에서 사용할 타입 값 정의
public class DefineType {
	// 유저 타입 선언
	public static final int NORMAL_USER_TYPE = 1;
	public static final int ORGAN_USER_TYPE = 2;
	public static final int ADMIN_USER_TYPE = 999;
	
	// 포인트 ID 선언 
	public static final int POINT_ID = 1;
	
	// Default 꼬미 선언
	public static final int KKOMI_ID = 1;

	// ErrorCode 선언
	public static final int SUCCESS = 100;
	public static final int DB_PROBLEM = 101;
	public static final int LACK_OF_CURRENCY = 102;
	
	// 페이지 당 행 갯수 선언
	public static final int ROWCOUNT_PER_PAGE = 10;
	public static final int MAX_PAGE_COUNT=10;
	

	// 미션 관련
	// 미션 타입 선언
	public static final int DAILY_MISSION = 1;
	public static final int NORMAL_MISSION = 2;
	
	// 미션 ID
	public static final int ATTENDANCE_MISSION_ID = 1;
	
	// 임시 미션 고정 보상
	public static final int DEFAULT_MISSION_REWARD_COUNT = 500;
}
