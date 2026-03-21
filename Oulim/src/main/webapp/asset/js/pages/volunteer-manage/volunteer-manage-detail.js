document.addEventListener("DOMContentLoaded", function () {
	const attendanceToggleBtn = document.getElementById("attendanceToggleBtn");
	const detailSection = document.getElementById("detailSection");
	const attendanceSection = document.getElementById("attendanceSection");
	const viewInput = document.querySelector('input[name="view"]');
	const paginationLinks = document.querySelectorAll("#attendancePagination .c-pagination__link[href]");
	
	if (!attendanceToggleBtn || !detailSection || !attendanceSection) return;
		
	//페이징 계속보기
	function updatePaginationView(viewValue) {
		paginationLinks.forEach(function (link) {
			const url = new URL(link.href, window.location.origin);
			url.searchParams.set("view", viewValue);
			link.href = url.pathname + "?" + url.searchParams.toString();
		});
	}
	// 출석 상태 토글
	function showDetail() {
		detailSection.style.display = "block";
		attendanceSection.style.display = "none";
		attendanceToggleBtn.textContent = "출석 처리";
		if (viewInput) viewInput.value = "detail";
		updatePaginationView("detail");
	}

	function showAttendance() {
		detailSection.style.display = "none";
		attendanceSection.style.display = "block";
		attendanceToggleBtn.textContent = "상세 보기";
		if (viewInput) viewInput.value = "attendance";
		updatePaginationView("attendance");
	}

	const params = new URLSearchParams(window.location.search);
	const currentView = params.get("view");

	if (currentView === "attendance") {
		showAttendance();
	} else {
		showDetail();
	}

	attendanceToggleBtn.addEventListener("click", function () {
		const isDetailVisible = detailSection.style.display !== "none";

		if (isDetailVisible) {
			showAttendance();
			params.set("view", "attendance");
		} else {
			showDetail();
			params.set("view", "detail");
		}

		history.replaceState(null, "", window.location.pathname + "?" + params.toString());
	});
	
	//전체 선택 체크 박스
	const checkAllAttendance = document.getElementById("checkAllAttendance");
	const attendanceCheckboxes = document.querySelectorAll('input[name="attendanceUser"]');

	if (checkAllAttendance) {
		checkAllAttendance.addEventListener("change", function () {
			attendanceCheckboxes.forEach(function (checkbox) {
				checkbox.checked = checkAllAttendance.checked;
			});
		});

		attendanceCheckboxes.forEach(function (checkbox) {
			checkbox.addEventListener("change", function () {
				const checkedCount = document.querySelectorAll('input[name="attendanceUser"]:checked').length;
				checkAllAttendance.checked = attendanceCheckboxes.length > 0 && checkedCount === attendanceCheckboxes.length;
			});
		});
	}
	// 출석 결석 버튼 알림
	const attendBtn = document.getElementById("attendBtn");
	const absentBtn = document.getElementById("absentBtn");

	function validateAttendanceSubmit(event) {
		const checkedBoxes = document.querySelectorAll('input[name="attendanceUser"]:checked');

		if (checkedBoxes.length === 0) {
			alert("봉사자를 한 명 이상 선택해주세요.");
			event.preventDefault();
			return;
		}

		for (let checkbox of checkedBoxes) {
			const status = checkbox.dataset.attendanceStatus;

			if (status !== "0") {
				alert("미처리 상태인 봉사자만 출석/결석 처리할 수 있습니다.");
				event.preventDefault();
				return;
			}
		}
	}

	if (attendBtn) {
		attendBtn.addEventListener("click", validateAttendanceSubmit);
	}

	if (absentBtn) {
		absentBtn.addEventListener("click", validateAttendanceSubmit);
	}
	
	
});

// 지도
window.addEventListener("DOMContentLoaded", function () {
    const mapContainer = document.getElementById("map");
    const addressElement = document.getElementById("volunteerLocation");

    if (!mapContainer || !addressElement) return;

    kakao.maps.load(function () {
        const address = addressElement.textContent.trim();

        const map = new kakao.maps.Map(mapContainer, {
            center: new kakao.maps.LatLng(37.5665, 126.9780), // 기본 좌표
            level: 3
        });

        if (!address) {
            console.error("주소값이 없습니다.");
            return;
        }

        const geocoder = new kakao.maps.services.Geocoder();

        geocoder.addressSearch(address, function (result, status) {
            if (status === kakao.maps.services.Status.OK) {
                const coords = new kakao.maps.LatLng(result[0].y, result[0].x);

                new kakao.maps.Marker({
                    map: map,
                    position: coords
                });

                map.setCenter(coords);
            } else {
                console.error("주소 검색 실패:", address);
            }
        });
    });
});