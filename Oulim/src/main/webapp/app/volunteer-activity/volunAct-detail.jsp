<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
String path = request.getContextPath();
%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>봉사 활동 상세</title>

  <!-- base css 필수 삽입-->
<link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/core/reset.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/core/variable.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/core/Typography.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/core/layout.css">

<link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/pagination.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/input.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/button.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/list.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/card.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/DetailCard.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/badge.css">

<link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/pages/volunteer-activity/volunAct-detail.css">

<link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/pages/volunteer-activity/volunAct-detail.css">

<script defer src="${pageContext.request.contextPath}/asset/js/pages/volunteer-activity/volunAct-detail.js"></script>

  <!-- css 연결 -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/pages/volunteer-activity/volunAct-detail.css">
  <!-- js 연결 -->
  <script defer src="${pageContext.request.contextPath}/asset/js/pages/volunteer-activity/volunAct-detail.js"></script>
  <!-- <script defer src="/Oulim/asset/js/pages/main/include.js"></script> -->

</head>
<script defer>
fetch('${pageContext.request.contextPath}/header-login.jsp')
fetch('${pageContext.request.contextPath}/footer.jsp')
</script>
<div id="header"></div>

<body>
  <div class="l-main">
    <div class="l-container">
      <div class="p-volunteer-manage-detail_header">
        <h1 class="p-volunteer-manage-detail_title">봉사 상세</h1>
      </div>
      <div class="c-detail-card"
          data-recruit-start-date="2026-01-03"
          data-recruit-end-date="2026-02-01"
          data-volunteer-start-date="2026-02-03"
          data-volunteer-end-date="2026-04-06">
            <div class="c-detail-card__header">
              <span class="c-badge c-badge--primary" id="volunteerStatus"> 완료 </span>
              <span class="c-badge c-badge--orange"> 독거노인 </span>
            </div>
            <h2 class="c-detail-card__title">주민과 함께하는 제설작업 봉사</h2>
            <div class="c-detail-card__info">
              <div class="c-detail-card__row">
                <span class="c-detail-card__label"> 봉사장소 </span>
                <span class="c-detail-card__value"> 서울특별시 도봉구 </span>
              </div>
              <div class="c-detail-card__row">
                <span class="c-detail-card__label"> 봉사기간 </span>
                <span class="c-detail-card__value"> 26.02.03 ~ 26.02.06 </span>
              </div>
              <div class="c-detail-card__row">
                <span class="c-detail-card__label"> 모집기간 </span>
                <span class="c-detail-card__value"> 26.01.08 ~ 26.02.01 </span>
              </div>
              <div class="c-detail-card__row">
                <span class="c-detail-card__label"> 봉사시간 </span>
                <span class="c-detail-card__value"> 4시간 </span>
              </div>
              <div class="c-detail-card__row">
                <span class="c-detail-card__label"> 모집인원 </span>
                <span class="c-detail-card__value"> 30명 </span>
              </div>
              <div class="c-detail-card__row">
                <span class="c-detail-card__label"> 포인트 </span>
                <span class="c-detail-card__value"> 2000p </span>
              </div>
              <div class="c-detail-card__row">
                <span class="c-detail-card__label"> 봉사자연령 </span>
                <span class="c-detail-card__value"> 직장인(30 ~) </span>
              </div>
            </div>     
        </div>

      <div class="l-volunAct-detail-content">
        <div class="c-volunAct-detail-content-title">
          <h3>상세 설명</h3>
        </div>
        <div class="c-volunteer-detail-desc__box">
          봉사 예시입니다.<br>
          봉사 에시예시예시예시예시예시예시<br>
          봉사 에시예시예시예시예시예시예시<br>
        </div>
      </div>

      <div class="l-volunAct-apply">
        <button class="c-button c-button--primary c-button--lg">신청하기</button>
      </div>

      <div class="l-return-button">
        <button class="c-button c-button--primary">목록으로 돌아가기</button>
      </div>
    </div>

</body>
<div id="footer"></div>

</html>