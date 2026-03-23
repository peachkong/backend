const cancel = document.getElementById("cancel");

document.addEventListener("DOMContentLoaded", () => {
    const message = document.body.dataset.message;

    if (message === "fail") {
        alert("비밀번호가 일치하지 않습니다.");
        window.location.href = "/mypage/quit.mp";
    } else if (message === "null") {
        alert("비밀번호를 입력해주세요.");
        window.location.href = "/mypage/quit.mp";
    }


    const form = document.querySelector("form");
    const checkbox = document.querySelector("#chk-box-label");
    const passwordInput = document.querySelector("#userPw");

    form.addEventListener("submit", (event) => {
        // 1. 약관 체크 확인
        if (!checkbox.checked) {
            alert("탈퇴 약관에 동의해주세요.");
            event.preventDefault();
            return;
        }

        // 2. 비밀번호 입력 확인
        if (passwordInput.value.trim() === "") {
            alert("비밀번호를 입력해주세요.");
            event.preventDefault();
            return;
        }

        
    });
});


cancel.addEventListener("click", () => {
    window.location.href = "/";
});