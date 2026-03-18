<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>post-detail</title>

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
  <link rel="stylesheet" href="${pageContext.request.contextPath}/app/admin/css/community-manage/post-detail.css" />
  <script defer src="${pageContext.request.contextPath}/app/admin/js/community-manage/post-detail.js"></script>
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
        <!-- 메인위에 헤더 -->
        <div class="header">
          <h1>게시글 상세</h1>
        </div>
        <div id="content-area">
          <div class="post-name">
            <p>봉사활동 후기제목</p>
            <div class="c-list__actions">
              <button class="c-button c-button--primary c-button--sm">
                수정
              </button>
              <button class="c-button c-button--secondary c-button--sm">
                삭제
              </button>
            </div>
          </div>
          <div id="post-comment">
            <p>작성일 : 0000-00-00</p>
            <p>작성자 :</p>
          </div>
          <div id="post-count">
            <p>조회수 : 1</p>
            <p>추천수 : 1</p>
          </div>
          <div id="happy-count">
            <button class="recommend-btn c-button c-button--primary c-button--md">
              추천
            </button>
          </div>
          <!-- 게시글 내용 -->
          <div class="post-text">
            <div class="photobox">
              <img src="" width="200px" height="200px" />
            </div>
            <p>
              게시글 내용이 들어가는 영역입니다. 봉사활동 후기나 설명 등이
              표시됩니다. 여러 줄의 텍스트가 들어갈 수 있도록 구성되어
              있습니다.
            </p>
          </div>

          <!-- 댓글 영역 -->
          <div class="comment-area">
            <h3 class="comment-title">댓글</h3>

            <!-- 댓글 목록 -->
            <div class="comment-list">
              <div class="comment">
                <p class="comment-user">작성자1</p>
                <p class="comment-text">좋은 활동이네요!</p>
              </div>

              <div class="comment">
                <p class="comment-user">작성자2</p>
                <p class="comment-text">저도 참여하고 싶습니다.</p>
              </div>

              <div class="comment">
                <p class="comment-user">작성자3</p>
                <p class="comment-text">수고하셨습니다.</p>
              </div>
            </div>
          </div>
        </div>
    </div>
    </section>
  </main>

</body>

</html>