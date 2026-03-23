const cancel = document.getElementById("cancel");

const password = document.getElementById("userPw");


document.addEventListener("DOMContentLoaded", () => {
	const message = document.body.dataset.message;

	if (!message) return;
	

	if (message === "fail") {
		alert("비밀번호가 일치하지 않습니다.");
		window.location.href = "/mypage/check.mp";
	}
	
	if (message === "null") {
		alert("비밀번호를 입력해주세요.");
		window.location.href = "/mypage/check.mp";
	}
	
	});
	


cancel.addEventListener("click", () => {
    window.location.href = "/";
});

const pwBtn = document.getElementById("c-password-btn-toggle");
const pwToggleIcon = document.getElementById("c-password-toggle-img");

pwBtn.addEventListener("click", (e) => {
	e.preventDefault();
  if (password.type === "password") {
    password.type = "text";
    pwToggleIcon.src = contextPath + "/asset/image/user/password-on.png";
  } else {
    password.type = "password";
    pwToggleIcon.src = contextPath + "/asset/image/user/password-off.png";
  }
});




