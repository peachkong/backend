<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>dashboard</title>

    <!-- base css 필수 삽입-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/core/reset.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/core/variable.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/core/Typography.css" />
    <!-- 컨포넌트 css 선택-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/pagination.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/input.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/button.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/list.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/card.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/DetailCard.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/badge.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/app/admin/css/dashboard/dashboard.css" />
  <script defer src="${pageContext.request.contextPath}/app/admin/js/dashboard/dashboard.js"></script>
  </head>

  <body>


    <main class="l-main">
      <!-- 사이드바 -->
    <aside>
      <!-- 관리자 영역 -->
      <div class="adminnow">
        <img src="" width="40" height="40" />

        <button class="c-button c-button--primary c-button--md">
          로그아웃
        </button>
      </div>

      <!-- 사이드바 메뉴 -->
      <nav class="sidebar-menu">
        <ul>
          <li class="menu-item">
            <a href="${pageContext.request.contextPath}/app/admin/jsp/dashboard/dashboard.jsp">통계</a>
          </li>

          <!-- 회원관리 -->
          <li class="menu-item dropdown">
            <a href="#" class="menu-title"> 회원관리 </a>

            <ul class="submenu">
              <li><a href="${pageContext.request.contextPath}/app/admin/jsp/member-manage/company-certification.jsp">기업회원</a></li>
              <li><a href="${pageContext.request.contextPath}/app/admin/jsp/member-manage/mem-list.jsp">회원조회</a></li>
            </ul>
          </li>

          <!-- 봉사활동관리 -->
          <li class="menu-item dropdown">
            <a href="${pageContext.request.contextPath}/app/admin/jsp/volunteer-manage/volun-list.jsp" class="menu-title"> 봉사활동관리 </a>
          </li>

          <!-- 게시판관리 -->
          <li class="menu-item dropdown">
            <a href="${pageContext.request.contextPath}/app/admin/jsp/community-manage/post-list.jsp" class="menu-title"> 게시판관리 </a>
          </li>
        </ul>
      </nav>
    </aside>


      <!-- 메인 컨텐츠 -->
      <section class="l-content">
        <div class="header">
          <h1>통계</h1>
        </div>

        <div id="content-area">
          <p>2026-03-04</p>
        </div>
        <div class="today">
          <div id="content-area">
            <p>현재 진행중 봉사: 1000000</p>
          </div>
          <div id="content-area">
            <p>결제 미처리 봉사건 : 3000</p>
          </div>
          <div id="content-area">
            <p>가입 기업: 30</p>
          </div>
          <div id="content-area">
            <p>신규 신청 기업회원 : 3000</p>
          </div>
          <div id="content-area">
            <p>총 단체 회원수 : 3000</p>
          </div>
          <div id="content-area">
            <p>총 회원수 : 3000</p>
          </div>
        </div>
        <!-- 미처리 봉사건 -->
        <div class="volun-notyet">
          <div class="notyet-head">
            <p>미처리 봉사 건</p>
            <button class="volun-list">바로가기</button>
          </div>
          <div class="c-list c-list--4col">
            <div class="c-list__header">
              <span class="c-list__col">봉사번호</span>
              <span class="c-list__col">단체명</span>
              <span class="c-list__col">종료일</span>
              <span class="c-list__col">처리</span>
            </div>
            <div class="c-list__body">
              <div class="c-list__row">
                <span class="c-list__col clicktitle"> 1 </span>
                <span class="c-list__col clicktitle"> 봉사만세 </span>
                <span class="c-list__col clicktitle"> 2023-01-15 </span>
                <div class="c-list__actions">
                  <button class="c-button c-button--primary c-button--md">
                    메일 발송
                  </button>
                </div>
              </div>
              <div class="c-list__row">
                <span class="c-list__col clicktitle"> 1 </span>
                <span class="c-list__col clicktitle"> 봉사만세 </span>
                <span class="c-list__col clicktitle"> 2023-01-15 </span>
                <div class="c-list__actions">
                  <button class="c-button c-button--primary c-button--md">
                    메일 발송
                  </button>
                </div>
              </div>
              <div class="c-list__row">
                <span class="c-list__col clicktitle"> 1 </span>
                <span class="c-list__col clicktitle"> 봉사만세 </span>
                <span class="c-list__col clicktitle"> 2023-01-15 </span>
                <div class="c-list__actions">
                  <button class="c-button c-button--primary c-button--md">
                    메일 발송
                  </button>
                </div>
              </div>
              <div class="c-list__row">
                <span class="c-list__col clicktitle"> 1 </span>
                <span class="c-list__col clicktitle"> 봉사만세 </span>
                <span class="c-list__col clicktitle"> 2023-01-15 </span>
                <div class="c-list__actions">
                  <button class="c-button c-button--primary c-button--md">
                    메일 발송
                  </button>
                </div>
              </div>
              <div class="c-list__row">
                <span class="c-list__col clicktitle"> 1 </span>
                <span class="c-list__col clicktitle"> 봉사만세 </span>
                <span class="c-list__col clicktitle"> 2023-01-15 </span>
                <div class="c-list__actions">
                  <button class="c-button c-button--primary c-button--md">
                    메일 발송
                  </button>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- =======새로운 기업 신청 -->
        <div class="new-company">
          <div class="new-company-list">
            <p>신규 기업 회원 관리</p>
            <button>바로가기</button>
          </div>
          <div class="c-list c-list--4col">
            <div class="c-list__header">
              <span class="c-list__col">단체명</span>
              <span class="c-list__col">이름</span>
              <span class="c-list__col">신청일</span>
              <span class="c-list__col">이메일</span>
            </div>
            <div class="c-list__body">
              <div class="c-list__row">
                <span class="c-list__col clicktitle"> 봉사만세</span>
                <span class="c-list__col clicktitle"> 김말순 </span>
                <span class="c-list__col clicktitle"> 2026-01-01 </span>
                <span class="c-list__col clicktitle"> qwer@asdf.com</span>
              </div>
              <div class="c-list__row">
                <span class="c-list__col clicktitle"> 봉사만세</span>
                <span class="c-list__col clicktitle"> 김말순 </span>
                <span class="c-list__col clicktitle"> 2026-01-01 </span>
                <span class="c-list__col clicktitle"> qwer@asdf.com</span>
              </div>
              <div class="c-list__row">
                <span class="c-list__col clicktitle"> 봉사만세</span>
                <span class="c-list__col clicktitle"> 김말순 </span>
                <span class="c-list__col clicktitle"> 2026-01-01 </span>
                <span class="c-list__col clicktitle"> qwer@asdf.com</span>
              </div>
            </div>
          </div>
        </div>
      </section>
    </main>

  </body>
</html>
