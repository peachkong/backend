const USER_TYPE = {
	ADMIN: 0,
	USER: 1,
	COMPANY: 2
};
// 글 제목
const title = document.querySelector(".c-community-repost-title .c-input");

const fileNameInput = document.querySelector(".c-community-repost-file-name");
// 파일 요소
const fileInput = document.getElementById('file');
const fileList = document.querySelector('.file-list');
const writeForm = document.getElementById('write-form');
const cntElement = document.querySelector('.cnt');

// 글 작성 본문
const postContent = document.querySelector(".c-textarea");

// 수정버튼
const repostRepostBtn = document.querySelector("#repost-button");
const cancelBtn = document.querySelector("#cancel-button");
const deleteBtn = document.querySelector("#deleteBtn");

repostRepostBtn.addEventListener("click",(e) => {
    console.log("등록 버튼 클릭");
    // 임시로 submit 막기
    if (!isLogin) {
        alert("로그인이 필요합니다.")
	    e.preventDefault();
        return;
    }

    if (userType !== USER_TYPE.USER) {
        alert("기업 회원 및 관리자는 사용할 수 없습니다.");
	    e.preventDefault();
        return;
    }

    if(title.value.trim() === ""){
        alert("제목을 입력해주세요.")
	    e.preventDefault();
        return;
    }

    if(postContent.value.trim() === ""){
        alert("작성 내용이 없습니다.");
	    e.preventDefault();
        return;
    }

    const result = confirm("수정하시겠습니까?");
    if(!result)
    {
		e.preventDefault();
		return;
    }
});

cancelBtn.addEventListener("click", (e) =>{
	/*TODO MyPage로 이동*/
    location.href=`${contextPath}/community/list.commu`;
});

deleteBtn.addEventListener("click",async (e) =>{
	if(!postNo){
		return alert("존재하지 않는 글입니다.");
	}
	
	if(!confirm("정말 삭제하시겠습니까?")){
		return;
	}
	
	try{
		const res = await fetch(`/community/postDelete.commu?postNo=${encodeURIComponent(postNo)}`,{
			method:"POST",
			headers:{"X-Requested-With" : "fetch"},
		});
		if(!res.ok){
			throw new Error("삭제 요청 실패");
		}
		
		alert("게시글이 삭제되었습니다.");
		window.location.href=`${contextPath}/community/list.commu`;
	}catch(err){
		console.error("게시글 삭제 실패 : ", err);
		alert("게시글 삭제에 실패했습니다");
	}
});

fileInput.addEventListener('change', (event) => {
	const files = event.target.files;

	console.log("파일등록");
	// 기존 미리보기 초기화
	fileList.innerHTML = '';

	if (files.length > 1) {
		const dataTransfer = new DataTransfer();
		fileInput.files = dataTransfer.files;
		alert("파일은 최대 1개만 첨부 가능합니다.");
		cntElement.textContent = 0;
		return;
	}

	// 선택 파일들 순회하며 미리보기
	for (let i = 0; i < files.length; i++) {
		const file = files[i];
		fileNameInput.value=file.name;
		const src = URL.createObjectURL(file);
		const listItem = document.createElement('li');
		listItem.innerHTML =
			`<div class="show-img-box">
			<img src="${src}" alt="${file.name}">
			</div>
		<div class="btn-box">
		    <button type='button' class='img-cancel-btn' data-name='${file.name}'>삭제</button>
		</div>
		`;
		fileList.appendChild(listItem);
	}

	cntElement.textContent = files.length;

	// 새로 생성된 삭제 버튼에 클릭 이벤트 리스너 추가
	const cancelButtons = document.querySelectorAll('.img-cancel-btn');
	cancelButtons.forEach(button => {
		button.addEventListener('click', (e) => {
			const fileName = e.target.dataset.name;
			const currentFiles = fileInput.files;
			const dataTransfer = new DataTransfer();

			// 삭제할 파일을 제외하고 새로운 FileList 생성
			for (let i = 0; i < currentFiles.length; i++) {
				if (currentFiles[i].name !== fileName) {
					dataTransfer.items.add(currentFiles[i]);
				}
			}

			// 파일 입력(input)의 files 속성을 업데이트
			fileInput.files = dataTransfer.files;
			fileNameInput.value="";
			// DOM에서 미리보기 요소 제거
			e.target.closest('li').remove();

			// 파일 개수 업데이트
			cntElement.textContent = fileInput.files.length;
		});
	});
});
