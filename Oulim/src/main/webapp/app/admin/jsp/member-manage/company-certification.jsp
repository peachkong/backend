<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>company-certification</title>

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
  <link rel="stylesheet" href="${pageContext.request.contextPath}/app/admin/css/company-certification/company-certification.css" />
  <script defer src="${pageContext.request.contextPath}/app/admin/js/company-certification/company-certification.js"></script>
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


    <!-- 메인 -->
    <section class="l-content">
        <!-- 메인헤더 -->
        <div class="header">
          <h1>기업회원관리</h1>
        </div>
        <div id="content-area">
          <p id="company-count">총440</p>
          <div class="bind-button">
            <button class="c-button c-button--secondary c-button--md">
              선택반려
            </button>
            <button class="c-button c-button--primary c-button--md">
              선택승인
            </button>
          </div>
        </div>

        <div class="c-list c-list--6col">
          <!-- header -->
          <div class="c-list__header">
            <label class="c-checkbox">
              <input type="checkbox" />
              <span class="c-checkbox__box"></span>
            </label>
            <span class="c-list__col">유저번호</span>
            <span class="c-list__col">회사명</span>
            <span class="c-list__col">아이디</span>
            <span class="c-list__col">가입일</span>
            <span class="c-list__col">회사코드</span>
          </div>
          <!-- body -->
          <div class="c-list__body">
            <div class="c-list__row">
              <label class="c-checkbox">
                <input type="checkbox" />
                <span class="c-checkbox__box"></span>
              </label>
              <span class="c-list__col company-detail"> 1 </span>
              <span class="c-list__col company-detail"> 현대자동차 </span>
              <span class="c-list__col company-detail"> aaa </span>
              <span class="c-list__col company-detail"> 2023-01-15 </span>
              <span class="c-list__col company-detail"> 00001 </span>
            </div>
            <div class="c-list__row">
              <label class="c-checkbox">
                <input type="checkbox" />
                <span class="c-checkbox__box"></span>
              </label>
              <span class="c-list__col company-detail"> 1 </span>
              <span class="c-list__col company-detail"> 현대자동차 </span>
              <span class="c-list__col company-detail"> aaa </span>
              <span class="c-list__col company-detail"> 2023-01-15 </span>
              <span class="c-list__col company-detail"> 00001 </span>
            </div>
            <div class="c-list__row">
              <label class="c-checkbox">
                <input type="checkbox" />
                <span class="c-checkbox__box"></span>
              </label>
              <span class="c-list__col company-detail"> 1 </span>
              <span class="c-list__col company-detail"> 현대자동차 </span>
              <span class="c-list__col company-detail"> aaa </span>
              <span class="c-list__col company-detail"> 2023-01-15 </span>
              <span class="c-list__col company-detail"> 00001 </span>
            </div>
            <div class="c-list__row">
              <label class="c-checkbox">
                <input type="checkbox" />
                <span class="c-checkbox__box"></span>
              </label>
              <span class="c-list__col company-detail"> 1 </span>
              <span class="c-list__col company-detail"> 현대자동차 </span>
              <span class="c-list__col company-detail"> aaa </span>
              <span class="c-list__col company-detail"> 2023-01-15 </span>
              <span class="c-list__col company-detail"> 00001 </span>
            </div>
            <div class="c-list__row">
              <label class="c-checkbox">
                <input type="checkbox" />
                <span class="c-checkbox__box"></span>
              </label>
              <span class="c-list__col company-detail"> 1 </span>
              <span class="c-list__col company-detail"> 현대자동차 </span>
              <span class="c-list__col company-detail"> aaa </span>
              <span class="c-list__col company-detail"> 2023-01-15 </span>
              <span class="c-list__col company-detail"> 00001 </span>
             </div>
            <div class="c-list__row">
              <label class="c-checkbox">
                <input type="checkbox" />
                <span class="c-checkbox__box"></span>
              </label>
              <span class="c-list__col company-detail"> 1 </span>
              <span class="c-list__col company-detail"> 현대자동차 </span>
              <span class="c-list__col company-detail"> aaa </span>
              <span class="c-list__col company-detail"> 2023-01-15 </span>
              <span class="c-list__col company-detail"> 00001 </span>
            </div>
            <div class="c-list__row">
              <label class="c-checkbox">
                <input type="checkbox" />
                <span class="c-checkbox__box"></span>
              </label>
              <span class="c-list__col company-detail"> 1 </span>
              <span class="c-list__col company-detail"> 현대자동차 </span>
              <span class="c-list__col company-detail"> aaa </span>
              <span class="c-list__col company-detail"> 2023-01-15 </span>
              <span class="c-list__col company-detail"> 00001 </span>
            </div>
            <div class="c-list__row">
              <label class="c-checkbox">
                <input type="checkbox" />
                <span class="c-checkbox__box"></span>
              </label>
              <span class="c-list__col company-detail"> 1 </span>
              <span class="c-list__col company-detail"> 현대자동차 </span>
              <span class="c-list__col company-detail"> aaa </span>
              <span class="c-list__col company-detail"> 2023-01-15 </span>
              <span class="c-list__col company-detail"> 00001 </span>
            </div>
            <div class="c-list__row">
              <label class="c-checkbox">
                <input type="checkbox" />
                <span class="c-checkbox__box"></span>
              </label>
              <span class="c-list__col company-detail"> 1 </span>
              <span class="c-list__col company-detail"> 현대자동차 </span>
              <span class="c-list__col company-detail"> aaa </span>
              <span class="c-list__col company-detail"> 2023-01-15 </span>
              <span class="c-list__col company-detail"> 00001 </span>
            </div>
            <div class="c-list__row">
              <label class="c-checkbox">
                <input type="checkbox" />
                <span class="c-checkbox__box"></span>
              </label>
              <span class="c-list__col company-detail"> 1 </span>
              <span class="c-list__col company-detail"> 현대자동차 </span>
              <span class="c-list__col company-detail"> aaa </span>
              <span class="c-list__col company-detail"> 2023-01-15 </span>
              <span class="c-list__col company-detail"> 00001 </span>
            </div>
            <div class="c-list__row">
              <label class="c-checkbox">
                <input type="checkbox" />
                <span class="c-checkbox__box"></span>
              </label>
              <span class="c-list__col company-detail"> 1 </span>
              <span class="c-list__col company-detail"> 현대자동차 </span>
              <span class="c-list__col company-detail"> aaa </span>
              <span class="c-list__col company-detail"> 2023-01-15 </span>
              <span class="c-list__col company-detail"> 00001 </span>
            </div>
            <div class="c-list__row">
              <label class="c-checkbox">
                <input type="checkbox" />
                <span class="c-checkbox__box"></span>
              </label>
              <span class="c-list__col company-detail"> 1 </span>
              <span class="c-list__col company-detail"> 현대자동차 </span>
              <span class="c-list__col company-detail"> aaa </span>
              <span class="c-list__col company-detail"> 2023-01-15 </span>
              <span class="c-list__col company-detail"> 00001 </span>
            </div>
          </div>
        </div>
        <div class="page">
          <!-- 페이지네이션  c-pagination-->
          <nav class="c-pagination">
            <a class="c-pagination__link is-disabled">‹‹</a>
            <a class="c-pagination__link is-disabled">‹</a>
            <a class="c-pagination__link is-active">1</a>
            <a class="c-pagination__link">2</a>
            <a class="c-pagination__link">3</a>
            <a class="c-pagination__link">4</a>
            <a class="c-pagination__link">5</a>
            <a class="c-pagination__link">6</a>
            <a class="c-pagination__link">7</a>
            <a class="c-pagination__link">8</a>
            <a class="c-pagination__link">9</a>
            <a class="c-pagination__link">10</a>
            <a class="c-pagination__link">›</a>
            <a class="c-pagination__link">››</a>
          </nav>
      </section>
  </main>

</body>

</html>