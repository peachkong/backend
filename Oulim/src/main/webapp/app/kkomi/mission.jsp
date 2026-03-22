<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!doctype html>
<html lang="ko">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>mission</title>
<!-- 기본css -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/core/reset.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/core/variable.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/core/Typography.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/core/layout.css" />
<!-- 컴포넌트 -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/button.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/tab.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/pages/kkomi/mission.css" />
<!-- 스크립트 -->
  <script src="${pageContext.request.contextPath}/asset/js/pages/kkomi/mission.js"></script>
  <script src="${pageContext.request.contextPath}/asset/js/components/tab.js"></script>
  <link rel="stylesheet"
	href="${pageContext.request.contextPath}/asset/css/pages/main/header-login.css" />
  <link rel="stylesheet"
	href="${pageContext.request.contextPath}/asset/css/pages/main/footer.css" />

   <script>
		const contextPath = "${pageContext.request.contextPath}";
		const missionData = [
		<c:forEach var="mission" items="${missionList}" varStatus="status">
		{
		    missionID: ${mission.missionID},
		    missionType: ${mission.missionType},
		    missionName: "${mission.missionName}",
		    missionDetail: "${mission.missionDetail}",
		    missionCurrCount: ${mission.missionCurrCount},
		    missionNeedCount: ${mission.missionNeedCount},
		    rewardCount: ${mission.rewardCount},
		    missionIsReward: ${mission.missionIsReward}
		}<c:if test="${!status.last}">,</c:if>
		</c:forEach>
		];
   </script>
</head>
<body>
  <jsp:include page="/app/include/header.jsp" />
    <main class="l-main">
        <div class="l-container">
            <section class="mission-header">
                <h2 class="mission-title">도력 찾기</h2>
                <p class="mission-desc">봉사를 통해 도력을 쌓고 인간이 되기 위한 꼬리를 찾아보세요!</p>
            </section>

            <div class="c-tab">
                <button class="c-tab__item is-active" data-tab="normal">일반 미션</button>
                <button class="c-tab__item" data-tab="special">특별 미션</button>
            </div>

            <div class="c-tab-content">
                <div class="c-tab-panel is-active" data-panel="normal">
                    <div class="mission-list">
                    </div>
                </div>

                <div class="c-tab-panel" data-panel="special">
                    <div class="empty-state">준비된 특별 미션이 없습니다.</div>
                </div>
            </div>

            <div class="mission-footer">
                <button class="c-button c-button--secondary c-button--lg" onclick="location.href='${contextPath}/kkomi/info.kko'">수련소로 돌아가기</button>
            </div>
        </div>
    </main>  
    <jsp:include page="/app/include/footer.jsp" />  
</body>

</html>