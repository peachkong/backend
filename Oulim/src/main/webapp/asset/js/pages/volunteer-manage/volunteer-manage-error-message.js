document.addEventListener("DOMContentLoaded", () => {
	const message = document.body.dataset.message;

	if (!message) return;

	if (message === "insertSuccess") {
		alert("봉사활동이 등록되었습니다.");
	} else if (message === "insertFail") {
		alert("봉사활동 등록에 실패했습니다.");
	} else if (message === "updateSuccess") {
		alert("봉사활동이 수정되었습니다.");
	} else if (message === "updateFail") {
		alert("봉사활동 수정에 실패했습니다.");
	}
	else if (message === "deleteSuccess") {
		alert("봉사활동 삭제에 성공했습니다.");
	}
	else if (message === "deleteFail") {
		alert("봉사활동 삭제에 실패했습니다.");
	}



});