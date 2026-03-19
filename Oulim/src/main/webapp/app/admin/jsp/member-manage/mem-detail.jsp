<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>사용자 상세</title>
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
  <link rel="stylesheet" href="${pageContext.request.contextPath}/app/admin/css/volunteer-manage/volun-edit.css" />

    <link
      rel="stylesheet"
      href="${pageContext.request.contextPath}/app/admin/css/member-manage/mem-detail.css"
    />

    <script defer src="${pageContext.request.contextPath}/app/admin/js/member-manage/mem-detail.js"></script>
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


      <!-- 메인 헤더 -->
      <section class="l-content">
        <div class="header">
          <h1>회원상세</h1>
        </div>
        <form>
          <div class="userdetail">
            <div class="i-email">
              <h5>사용자 이름</h5>
              <div class="pw-text">
                <input
                  id="email"
                  type="text"
                  class="c-input"
                  name="email"
                  placeholder="사용자 이름"
                />
              </div>
            </div>

            <h5>아이디</h5>
            <div class="user-text">
              <input
                id="verify"
                type="text"
                class="c-input"
                name="verify"
                placeholder="아이디"
              />
            </div>

            <div class="i-nickname">
              <h5>닉네임</h5>
              <div class="user-text">
                <input
                  id="nickname"
                  type="text"
                  class="c-input"
                  name="nickname"
                  placeholder="닉네임"
                />
                <button
                  type="button"
                  class="c-button c-button--primary c-button--md"
                >
                  중복확인
                </button>
              </div>
            </div>

            <div class="i-address">
              <h5>주소</h5>
              <div class="user-address">
                <input
                  id="useraddress"
                  type="text"
                  class="c-input"
                  name="email"
                  placeholder="주소"
                />
                <button
                  type="button"
                  class="c-button c-button--primary c-button--md"
                >
                  돋보기그림
                </button>
              </div>
            </div>

            <h5>포인트</h5>
            <div class="point-num">
              <input
                type="text"
                class="c-input"
                name="address"
                placeholder="포인트"
              />
              <button
                class="c-button c-button--primary c-button--md point-count"
                type="button"
              >
                포인트 상세내역 보기
              </button>
            </div>
          </div>

          <div class="c-button-group">
            <button id="accept" class="c-button c-button--primary c-button--md">
              수정
            </button>
            <button
              id="cancel"
              class="c-button c-button--secondary c-button--md"
            >
              탈퇴
            </button>
          </div>
        </form>
      </section>
    </main>

  </body>
</html>
