document.addEventListener('DOMContentLoaded', async () => {
    // 1. 데이터
	let volunData;
	try{
	const volunRes = await fetch(`${contextPath}/volunteer-activity/main.va`, {
		method: "GET",
		headers : {
			"X-Requested-With" : "fetch"
		}
	});

	if(!volunRes.ok){
		throw new Error("봉사활동 요청 실패");
	}

	volunData = await volunRes.json();

	}catch(err){
		console.log(err);
	}
    const vList = volunData?.volunActList || [];
	
	let postData;
	try{
	const postRes = await fetch(`${contextPath}/community/main.commu`, {
		method: "GET",
		headers : {
			"X-Requested-With" : "fetch"
		}
	});
	
	if(!postRes.ok){
		throw new Error("게시글 요청 실패");
	}
	
	
	postData = await postRes.json();
	
	}catch(err){
		console.log(err);
	}
	
	
    const rList = postData?.postList || [];

    // 2. 렌더링 (슬라이더 & 후기)
    const track = document.querySelector('.js-volunteer-slider');
    const rGrid = document.querySelector('.js-review-container');

    if(track) {
        track.innerHTML = vList.map(v => `
			<a href="${contextPath}/volunteer-activity/detail.va?volunActNo=${v.volunActNo}">
            <div class="c-volunteer-card">
                <span class="c-volunteer-card__recruitment">${v.volunActStatus}</span>
                <h3 style="margin:10px 0; height:44px;">${v.volunActTitle}</h3>
                <p> ${v.volunActAddress}</p>
                <div style="margin-top:15px; border-top:1px dashed #eee; padding-top:10px; display:flex; justify-content:space-between;">
                    <small>성장 도력</small><strong>${v.volunActPoint} P</strong>
                </div>
            </div>
			</a>
        `).join('');
    }

    if(rGrid) {
        rGrid.innerHTML = rList.map(r => `
			<a href="${contextPath}/community/detail.commu?postNo=${r.postNo}">
            <div class="c-review-card">
                <div class="review-img"><img src="${contextPath}/upload/${r.postImage}"
				onerror="this.onerror=null; this.src='${contextPath}/asset/image/logo/logo.png';"></div>
                <div class="review-content">
                    <h4>${r.postTitle}</h4>
                    <p style="color:#76b13a; margin-top:10px;">${r.userNickname}</p>
                </div>
            </div>
			</a>
        `).join('');
    }

    // 3. 슬라이더 로직
    const prev = document.getElementById('prevBtn');
    const next = document.getElementById('nextBtn');
	let idx = 0;
	    const cardW = 310 + 20;

	    const move = () => {
	        if (!track) return;
	        track.style.transform = `translateX(-${idx * cardW}px)`;
	        if (prev) prev.disabled = (idx === 0);
	        if (next) next.disabled = (idx >= Math.max(0, vList.length - 3));
	    };

	    if (next) {
	        next.addEventListener('click', () => {
	            if (idx < Math.max(0, vList.length - 3)) {
	                idx++;
	                move();
	            }
	        });
	    }

	    if (prev) {
	        prev.addEventListener('click', () => {
	            if (idx > 0) {
	                idx--;
	                move();
	            }
	        });
	    }
    move();
});