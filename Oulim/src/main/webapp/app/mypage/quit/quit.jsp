<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>quit</title>

  <!-- base css -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/core/reset.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/core/variable.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/core/Typography.css" />

  <!-- component css -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/input.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/button.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/checkbox.css">

  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/pages/mypage/quit/quit.css" />
    	<link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/pages/main/header-login.css"/>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/pages/main/footer.css" />

  <script defer src="${pageContext.request.contextPath}/asset/js/pages/mypage/quit/quit.js"></script> 
</head>

<body data-message="${param.message}">
<jsp:include page="/app/include/header.jsp" />
  <main class="l-main">

    <div class="main-container">

      <!-- aside -->
      <div class="main-aside">
        <aside>
          <div class="main-aside-list">

            <h2>마이페이지</h2>

            <ul class="list1">
              <li>나의 정보</li>
              <br>
              <a href="${pageContext.request.contextPath}/mypage/profile.mp">
                <li>- 내 정보 보기</li>
              </a>
              <br>
              <a href="${pageContext.request.contextPath}/mypage/userEdit.mp">
                <li>- 내 정보 수정</li>
              </a>
              <br>
            </ul>

            <ul class="list2">
              <li>봉사조회</li>
              <br>
              <a href="${pageContext.request.contextPath}/mypage/comingVolun.mp">
                <li>- 예정된 봉사 이력 조회</li>
              </a>
              <br>
              <a href="${pageContext.request.contextPath}/mypage/finishVolun.mp">
                <li>- 완료된 봉사 이력 조회</li>
              </a>

            </ul>

            <ul class="list3">
              <a href="${pageContext.request.contextPath}/mypage/point.mp">
                <li>포인트 조회</li>
              </a>
            </ul>

            <ul class="list4">
              <a href="${pageContext.request.contextPath}/mypage/myPost.mp">
                <li>작성글 조회</li>
              </a>
            </ul>

            <ul class="list5">
              <a href="${pageContext.request.contextPath}/mypage/quit.mp">
                <li>회원 탈퇴</li>
              </a>
            </ul>

          </div>
        </aside>
      </div>


      <!-- content -->
      <div class="main-2">

        <div class="main-text-box">
          <div class="m2-text-box-1">
            <h1>회원 탈퇴</h1>
          </div>
        </div>


        <!-- 탈퇴 약관 -->
				<div class="term">
					<fieldset><p>회원 탈퇴 약관 (어울림)</p>
<p>본 약관은 “어울림”(이하 “회사”)의 회원 탈퇴와 관련된 조건 및 절차를 규정함을 목적으로 합니다.</p>
<br>
<p>
제1조 (목적)
본 약관은 회원이 서비스 이용을 종료하고 탈퇴를 요청하는 경우, 회사와 회원 간의 권리, 의무 및 책임사항을 규정하는 것을 목적으로 합니다.
</p>
<p>
제2조 (회원 탈퇴 신청)
회원은 언제든지 서비스 내 제공되는 탈퇴 기능을 통해 회원 탈퇴를 신청할 수 있습니다.
탈퇴 신청 시, 회사는 본인 확인 절차를 요구할 수 있습니다.
</p>
<p>
제3조 (회원 탈퇴 처리)
회사는 회원의 탈퇴 요청을 접수한 후, 관련 법령 및 내부 정책에 따라 신속하게 처리합니다.
탈퇴가 완료되면 회원의 계정은 즉시 비활성화되며, 서비스 이용이 제한됩니다.
</p>
<p>
제4조 (개인정보 처리)
회사는 회원 탈퇴 시 관련 법령에 따라 일정 기간 동안 회원 정보를 보관할 수 있습니다.
그 외의 개인정보는 지체 없이 파기합니다.
단, 다음의 경우에는 예외로 합니다.
법령에 의해 보존이 요구되는 경우
부정 이용 방지를 위한 최소한의 정보 보관이 필요한 경우
</p>
<p>
제5조 (탈퇴 후 재가입)
탈퇴한 회원은 동일한 정보로 재가입할 수 있습니다.
단, 서비스 운영 정책에 따라 일정 기간 동안 재가입이 제한될 수 있습니다.
</p>
<p>
제6조 (탈퇴 시 유의사항)
회원 탈퇴 시 보유하고 있던 포인트, 혜택, 게시물 등은 복구되지 않습니다.
탈퇴 이후에는 기존 데이터의 복원이 불가능하므로 신중히 결정해야 합니다.
</p>
<p>
제7조 (책임 제한)
회사는 회원의 탈퇴로 인해 발생하는 불이익에 대해 책임을 지지 않습니다. 다만, 회사의 고의 또는 중대한 과실이 있는 경우는 예외로 합니다.
</p>
<p>
본 약관은 서비스 운영 정책에 따라 변경될 수 있으며, 변경 시 사전 공지합니다.
</p></fieldset>
				</div>


        <!-- 체크 -->
        <div class="chk-box">
          <label class="c-checkbox">
            <input type="checkbox" id="chk-box-label">
            <span class="c-checkbox__box"></span>
            <span>
              <h5>탈퇴 약관을 읽고 이해하였으며, 이에 동의합니다.</h5>
            </span>
          </label>
        </div>



        <!-- 비밀번호 -->
        <form action="${pageContext.request.contextPath}/mypage/quitOk.mp" method="post">

          <div class="main-pw">

            <h5>비밀번호 입력</h5>

            <div class="pw-input">
              <input type="password" class="c-input" id="userPw" name="userPw" placeholder="비밀번호 입력" />
            </div>

          </div>


          <div class="c-button-group">
            <button type="submit" id="accept" class="c-button c-button--primary c-button--md">
              탈퇴
            </button>

            <button type="button" id="cancel" class="c-button c-button--secondary c-button--md">
              취소
            </button>
          </div>

        </form>

      </div>

    </div>

  </main>

  <jsp:include page="/app/include/footer.jsp" />

</body>

</html>