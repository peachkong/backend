<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />

  <!-- 페이지 제목 -->
  <title>회원 정보 상세</title>

  <!-- 공통 reset / 변수 / 타이포 -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/core/reset.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/core/variable.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/core/Typography.css" />

  <!-- 공통 컴포넌트 css -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/pagination.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/input.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/button.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/list.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/card.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/DetailCard.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/badge.css" />

  <!-- 회원 상세 전용 css -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/app/admin/css/member-manage/mem-detail.css" />
</head>

<body>
  <main class="l-main">


    <!-- 좌측 사이드바 시작 -->

    <aside>
      <!-- 관리자 정보 / 로그아웃 -->
      <div class="adminnow">
        <img src="" width="40" height="40" />

        <button class="c-button c-button--primary c-button--md">
          로그아웃
        </button>
      </div>

      <!-- 사이드 메뉴 -->
      <nav class="sidebar-menu">
        <ul>
          <li class="menu-item">
            <a href="${pageContext.request.contextPath}/app/admin/jsp/dashboard/dashboard.jsp">통계</a>
          </li>

          <!-- 회원관리 -->
          <li class="menu-item dropdown">
            <a href="#" class="menu-title">회원관리</a>

            <ul class="submenu">
              <li>
                <a href="${pageContext.request.contextPath}/app/admin/jsp/member-manage/company-certification.jsp">
                  기업회원 승인 관리
                </a>
              </li>
              <li>
                <a href="${pageContext.request.contextPath}/app/admin/jsp/member-manage/mem-list.jsp">
                  회원조회
                </a>
              </li>
            </ul>
          </li>

          <!-- 봉사활동관리 -->
          <li class="menu-item dropdown">
            <a href="${pageContext.request.contextPath}/app/admin/jsp/volunteer-manage/volun-list.jsp" class="menu-title">
              봉사활동관리
            </a>
          </li>

          <!-- 게시판관리 -->
          <li class="menu-item dropdown">
            <a href="${pageContext.request.contextPath}/app/admin/jsp/community-manage/post-list.jsp" class="menu-title">
              게시판관리
            </a>
          </li>
        </ul>
      </nav>
    </aside>



 
    <!-- 우측 메인 컨텐츠 시작 -->

    <section class="l-content">

      <!-- 페이지 제목 -->
      <div class="header">
        <h1>회원 정보 상세</h1>
      </div>

      <!-- 상세 전체 박스 -->
      <div class="detail-wrap">

   
        <p class="detail-guide">
          *회원정보수정은 꼭 회원의 요청에 의해서만 진행하세요. 관리자의 임의 수정은 지양해 주세요.<br />
          비밀번호는 고객이 직접 재설정하도록 안내만 주세요.
        </p>

        <!-- 회원번호 + 상세 폼 묶음 -->
        <div class="detail-body">

          <!-- 우측 상세 입력/표시 영역 -->
          <form class="detail-form">

            <!-- 이름 -->
            <div class="detail-item">
              <label class="detail-label" for="userName">이름</label>
              <input
                id="userName"
                type="text"
                class="c-input detail-input"
                name="userName"
                value="박하늘별님구름햇님보다사랑스러우리"
                placeholder="이름"
              />
              
            </div>

            <!-- 아이디 -->
            <div class="detail-item">
              <label class="detail-label" for="userId">아이디</label>
              <input
                id="userId"
                type="text"
                class="c-input detail-input"
                name="userId"
                value="test1234"
                placeholder="아이디"
                readonly
              />
              
            </div>

            <!-- 닉네임 -->
            <div class="detail-item">
              <label class="detail-label" for="userNickname">닉네임 수정</label>

              <!-- 입력창 + 버튼 한 줄 -->
              <div class="inline-row">
                <input
                  id="userNickname"
                  type="text"
                  class="c-input detail-input flex-input"
                  name="userNickname"
                  value="박하우리"
                  placeholder="닉네임"
                />
                

                <button type="button" class="c-button c-button--primary c-button--md side-button">
                  중복확인
                </button>
              </div>

              
              <div class="detail-help">
                *회원 닉네임은 초기화만 가능합니다. 재설정은 회원이 직접 설정하게 하세요.<br />
                *user001 ~ user999까지 임의로 작성해서 중복확인 진행해 주세요.
              </div>
            </div>

            <!-- 주소 -->
            <div class="detail-item">
              <label class="detail-label" for="userAddress">주소</label>

              <div class="inline-row">
                <input
                  id="userAddress"
                  type="text"
                  class="c-input detail-input flex-input"
                  name="userAddress"
                  value="서울시 강남구 어쩌고 1564-15"
                  placeholder="주소"
                />
                

                <button type="button" class="c-button c-button--primary c-button--md side-button icon-button">
                  돋보기
                </button>
              </div>
            </div>

            <!-- 보유포인트 -->
            <div class="detail-item">
              <label class="detail-label" for="totalPoint">보유포인트</label>

              <div class="inline-row">
                <input
                  id="totalPoint"
                  type="text"
                  class="c-input detail-input point-input"
                  name="totalPoint"
                  value="54000P"
                  placeholder="포인트"
                  readonly
                />
                

                <button type="button" class="c-button c-button--primary c-button--md point-button">
                  포인트상세내역 보기
                </button>
              </div>
            </div>

            <!-- 하단 버튼 -->
            <div class="button-group">
              <button type="submit" class="c-button c-button--primary c-button--md action-button">
                수정
              </button>

              <button type="button" class="c-button c-button--secondary c-button--md action-button">
                탈퇴
              </button>
            </div>
          </form>
        </div>
      </div>
    </section>


  </main>
</body>
</html>