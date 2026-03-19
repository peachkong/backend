const nickname = document.getElementById("user-nickname");
const userId = document.getElementById("user-id");
const password = document.getElementById("user-password");
const passwordCheck = document.getElementById("user-password-check");

const nicknameError = document.getElementById("is-user-nickname-error");
const userIdError = document.getElementById("is-user-id-error");
const passwordError = document.getElementById("is-user-password-error");
const passwordCheckError = document.getElementById("is-user-password-check-error");

const passwordRegex = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[!@#$%^&*]).{8,}$/;

const signupBtn = document.getElementById("is-signup-btn");
const nicknameCheckBtn = document.getElementById("c-nickname-dbcheck-btn");
const idCheckBtn = document.getElementById("c-id-dbcheck-btn");

let isNicknameChecked = false;
let isNicknameAvailable = false;
let isIdChecked = false;
let isIdAvailable = false;

// 닉네임 값 바뀌면 다시 중복확인 해야 함
nickname.addEventListener("input", () => {
	isNicknameChecked = false;
	isNicknameAvailable = false;

	nicknameError.textContent = "";
	nickname.classList.remove("is-error");
	nicknameError.classList.remove("is-success-text");
	nicknameError.classList.add("is-error-text");
});

// 아이디 값 바뀌면 다시 중복확인 해야 함
userId.addEventListener("input", () => {
	isIdChecked = false;
	isIdAvailable = false;

	userIdError.textContent = "";
	userId.classList.remove("is-error");
	userIdError.classList.remove("is-success-text");
	userIdError.classList.add("is-error-text");
});

// 닉네임 중복확인
nicknameCheckBtn.addEventListener("click", () => {
	const value = nickname.value.trim();

	if (value === "") {
		nicknameError.textContent = "닉네임을 입력해주세요.";
		nickname.classList.add("is-error");
		nicknameError.classList.remove("is-success-text");
		nicknameError.classList.add("is-error-text");
		nickname.focus();

		isNicknameChecked = false;
		isNicknameAvailable = false;
		return;
	}

	fetch(`${contextPath}/user/checkOk.usr?type=nickname&value=${encodeURIComponent(value)}`)
		.then(res => res.text())
		.then(result => {
			result = result.trim();

			if (result === "duplicated") {
				nicknameError.textContent = "이미 사용 중인 닉네임입니다.";
				nickname.classList.add("is-error");
				nicknameError.classList.remove("is-success-text");
				nicknameError.classList.add("is-error-text");

				isNicknameChecked = true;
				isNicknameAvailable = false;
			} else if (result === "available") {
				nicknameError.textContent = "사용 가능한 닉네임입니다.";
				nickname.classList.remove("is-error");
				nicknameError.classList.remove("is-error-text");
				nicknameError.classList.add("is-success-text");

				isNicknameChecked = true;
				isNicknameAvailable = true;
			} else {
				nicknameError.textContent = "중복확인 중 오류가 발생했습니다.";
				nicknameError.classList.remove("is-success-text");
				nicknameError.classList.add("is-error-text");

				isNicknameChecked = false;
				isNicknameAvailable = false;
			}
		})
		.catch(() => {
			nicknameError.textContent = "서버 요청 중 오류가 발생했습니다.";
			nicknameError.classList.remove("is-success-text");
			nicknameError.classList.add("is-error-text");

			isNicknameChecked = false;
			isNicknameAvailable = false;
		});
});

// 아이디 중복확인
idCheckBtn.addEventListener("click", () => {
	const value = userId.value.trim();

	if (value === "") {
		userIdError.textContent = "아이디를 입력해주세요.";
		userId.classList.add("is-error");
		userIdError.classList.remove("is-success-text");
		userIdError.classList.add("is-error-text");
		userId.focus();

		isIdChecked = false;
		isIdAvailable = false;
		return;
	}

	fetch(`${contextPath}/user/checkOk.usr?type=userId&value=${encodeURIComponent(value)}`)
		.then(res => res.text())
		.then(result => {
			result = result.trim();

			if (result === "duplicated") {
				userIdError.textContent = "이미 사용 중인 아이디입니다.";
				userId.classList.add("is-error");
				userIdError.classList.remove("is-success-text");
				userIdError.classList.add("is-error-text");

				isIdChecked = true;
				isIdAvailable = false;
			} else if (result === "available") {
				userIdError.textContent = "사용 가능한 아이디입니다.";
				userId.classList.remove("is-error");
				userIdError.classList.remove("is-error-text");
				userIdError.classList.add("is-success-text");

				isIdChecked = true;
				isIdAvailable = true;
			} else {
				userIdError.textContent = "중복확인 중 오류가 발생했습니다.";
				userIdError.classList.remove("is-success-text");
				userIdError.classList.add("is-error-text");

				isIdChecked = false;
				isIdAvailable = false;
			}
		})
		.catch(() => {
			userIdError.textContent = "서버 요청 중 오류가 발생했습니다.";
			userIdError.classList.remove("is-success-text");
			userIdError.classList.add("is-error-text");

			isIdChecked = false;
			isIdAvailable = false;
		});
});

// 비밀번호 정규식 실시간 검사
password.addEventListener("input", () => {
	const value = password.value.trim();

	if (value === "") {
		passwordError.textContent = "";
		password.classList.remove("is-error");
		passwordError.classList.remove("is-error-text");
		passwordError.classList.remove("is-success-text");
		return;
	}

	if (!passwordRegex.test(value)) {
		passwordError.textContent = "영문, 숫자, 특수문자를 포함한 8자 이상 입력해주세요.";
		password.classList.add("is-error");
		passwordError.classList.remove("is-success-text");
		passwordError.classList.add("is-error-text");
	} else {
		passwordError.textContent = "사용 가능한 비밀번호입니다.";
		password.classList.remove("is-error");
		passwordError.classList.remove("is-error-text");
		passwordError.classList.add("is-success-text");
	}
});

// 비밀번호 확인 실시간 검사
passwordCheck.addEventListener("input", () => {
	const pw = password.value.trim();
	const pwChk = passwordCheck.value.trim();

	if (pwChk === "") {
		passwordCheckError.textContent = "";
		passwordCheck.classList.remove("is-error");
		passwordCheckError.classList.remove("is-error-text");
		passwordCheckError.classList.remove("is-success-text");
		return;
	}

	if (pw !== pwChk) {
		passwordCheckError.textContent = "비밀번호가 일치하지 않습니다.";
		passwordCheck.classList.add("is-error");
		passwordCheckError.classList.remove("is-success-text");
		passwordCheckError.classList.add("is-error-text");
	} else {
		passwordCheckError.textContent = "비밀번호가 일치합니다.";
		passwordCheck.classList.remove("is-error");
		passwordCheckError.classList.remove("is-error-text");
		passwordCheckError.classList.add("is-success-text");
	}
});

// 회원가입 버튼 검사
signupBtn.addEventListener("click", function(e) {
	let hasError = false;

	nicknameError.textContent = "";
	userIdError.textContent = "";
	passwordError.textContent = "";
	passwordCheckError.textContent = "";

	nicknameError.classList.remove("is-success-text");
	userIdError.classList.remove("is-success-text");
	passwordError.classList.remove("is-success-text");
	passwordCheckError.classList.remove("is-success-text");

	nicknameError.classList.add("is-error-text");
	userIdError.classList.add("is-error-text");
	passwordError.classList.add("is-error-text");
	passwordCheckError.classList.add("is-error-text");

	nickname.classList.remove("is-error");
	userId.classList.remove("is-error");
	password.classList.remove("is-error");
	passwordCheck.classList.remove("is-error");

	if (nickname.value.trim() === "") {
		nicknameError.textContent = "닉네임을 입력해주세요.";
		nickname.classList.add("is-error");
		if (!hasError) nickname.focus();
		hasError = true;
	} else if (!isNicknameChecked) {
		nicknameError.textContent = "닉네임 중복확인을 해주세요.";
		nickname.classList.add("is-error");
		if (!hasError) nickname.focus();
		hasError = true;
	} else if (!isNicknameAvailable) {
		nicknameError.textContent = "이미 사용 중인 닉네임입니다.";
		nickname.classList.add("is-error");
		if (!hasError) nickname.focus();
		hasError = true;
	}

	if (userId.value.trim() === "") {
		userIdError.textContent = "아이디를 입력해주세요.";
		userId.classList.add("is-error");
		if (!hasError) userId.focus();
		hasError = true;
	} else if (!isIdChecked) {
		userIdError.textContent = "아이디 중복확인을 해주세요.";
		userId.classList.add("is-error");
		if (!hasError) userId.focus();
		hasError = true;
	} else if (!isIdAvailable) {
		userIdError.textContent = "이미 사용 중인 아이디입니다.";
		userId.classList.add("is-error");
		if (!hasError) userId.focus();
		hasError = true;
	}

	if (password.value.trim() === "") {
		passwordError.textContent = "비밀번호를 입력해주세요.";
		password.classList.add("is-error");
		if (!hasError) password.focus();
		hasError = true;
	} else if (!passwordRegex.test(password.value.trim())) {
		passwordError.textContent = "영문, 숫자, 특수문자를 포함한 8자 이상 입력해주세요.";
		password.classList.add("is-error");
		if (!hasError) password.focus();
		hasError = true;
	}

	if (passwordCheck.value.trim() === "") {
		passwordCheckError.textContent = "비밀번호 확인을 입력해주세요.";
		passwordCheck.classList.add("is-error");
		if (!hasError) passwordCheck.focus();
		hasError = true;
	} else if (password.value !== passwordCheck.value) {
		passwordCheckError.textContent = "비밀번호가 일치하지 않습니다.";
		passwordCheck.classList.add("is-error");
		if (!hasError) passwordCheck.focus();
		hasError = true;
	}

	if (hasError) {
		e.preventDefault();
		alert("입력값을 확인해주세요.");
	}
});

// 토글
const userPw = document.getElementById("user-password");
const pwBtn = document.getElementById("c-password-btn-toggle");
const pwToggleIcon = document.getElementById("c-password-toggle-img");

pwBtn.addEventListener("click", () => {
	if (userPw.type === "password") {
		userPw.type = "text";
		pwToggleIcon.src = contextPath + "/asset/image/user/password-on.png";
	} else {
		userPw.type = "password";
		pwToggleIcon.src = contextPath + "/asset/image/user/password-off.png";
	}
});

// 토글2
const userPw2 = document.getElementById("user-password-check");
const pwBtn2 = document.getElementById("c-password-btn-toggle-2");
const pwToggleIcon2 = document.getElementById("c-password-toggle-img-2");

pwBtn2.addEventListener("click", () => {
	if (userPw2.type === "password") {
		userPw2.type = "text";
		pwToggleIcon2.src = contextPath + "/asset/image/user/password-on.png";
	} else {
		userPw2.type = "password";
		pwToggleIcon2.src = contextPath + "/asset/image/user/password-off.png";
	}
});