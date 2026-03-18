<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>회원 수정</title>
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
  <link rel="stylesheet" href="${pageContext.request.contextPath}/app/admin/css/mem-edit/mem-edit.css" />
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
          <h1>회원수정</h1>
        </div>
        <div id="content-area">
          <div id="userNumber">
            <p>유저번호 : 1</p>
          </div>
          <div id="userName">
            <p>유저 이름 : 사람</p>
          </div>
          <div id="userNickname">
            <p>유저 닉네님 : 닉네임1</p>
            <button class="c-button c-button--primary c-button--md">
              닉네임 초기화 하기
            </button>
          </div>
          <div id="myPoint">
            <p>현재 보유 포인트 : 3000</p>
            <input
              type="text"
              class="c-input"
              placeholder="변경할 포인트 입력"
            />
            <button class="c-button c-button--primary c-button--md">
              적용하기
            </button>
          </div>
          <!-- ====================================수정할곳 -->
          <div class="l-mypage--content">
            <div class="p-point-history--header">
              <h1>포인트 조회</h1>
            </div>
            <div class="p-point-history--body">
              <div class="p-point-history--nav">
                <nav>
                  <div id="plus">적립 포인트</div>
                </nav>
                <hr />
              </div>

              <div id="a" class="p-point-history--earn-list">
                <ul>
                  <li>
                    <div>
                      <h5>포인트 적립</h5>
                      <h5>2026-01-04</h5>
                    </div>
                    <div>20p</div>
                  </li>
                  <li>
                    <div>
                      <h5>포인트 적립</h5>
                      <h5>2026-01-04</h5>
                    </div>
                    <div>300p</div>
                  </li>
                  <li>
                    <div>
                      <h5>포인트 적립</h5>
                      <h5>2026-01-04</h5>
                    </div>
                    <div>300p</div>
                  </li>
                  <li>
                    <div>
                      <h5>포인트 적립</h5>
                      <h5>2026-01-04</h5>
                    </div>
                    <div>300p</div>
                  </li>
                </ul>
              </div>
            </div>
          </div>
        </div>
      </section>
    </main>

  </body>
</html>
