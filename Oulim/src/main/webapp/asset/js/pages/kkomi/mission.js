/**
 * mission.js
 * 테스트 데이터를 활용한 미션 목록 렌더링 및 인터랙션 로직
 */

// 1. 테스트 데이터 (실제 프로젝트에서는 DB에서 불러온 JSON 형태가 됩니다)

document.addEventListener('DOMContentLoaded', () => {
    // 초기 렌더링 (전체/일반 탭 시작)
    renderMissions('normal');

    // 탭 클릭 이벤트 (데이터 필터링)
    document.querySelectorAll('.c-tab__item').forEach(tab => {
        tab.addEventListener('click', (e) => {
            const type = tab.dataset.tab;
            renderMissions(type);
        });
    });

    // 보상받기 버튼 이벤트 위임 (동적 생성된 버튼 대응)
    document.querySelector('.c-tab-content').addEventListener('click', (e) => {
        if (e.target.classList.contains('js-reward-btn')) {
            handleReward(e.target);
        }
    });
});

/**
 * 데이터 기반 카드 생성 함수
 */
function renderMissions(type) {
    const listContainer = document.querySelector('.mission-list');
	if (!listContainer || !Array.isArray(missionData)) return;

	const filteredData = missionData.filter(item => {
	    if (type === 'normal') return item.missionType === 1;
	    if (type === 'daily') return item.missionType === 2;
	    return false;
	});
    if (filteredData.length === 0) {
        listContainer.innerHTML = `<div class="empty-state">준비된 미션이 없습니다.</div>`;
        return;
    }

    listContainer.innerHTML = filteredData.map(item => {
		const percent = item.missionNeedCount > 0
		    ? Math.min((item.missionCurrCount / item.missionNeedCount) * 100, 100)
		    : 0;

        const isComplete = item.missionCurrCount >= item.missionNeedCount;
        const isRewarded = item.missionIsReward;

        return `
            <div class="mission-card ${isRewarded ? 'is-complete' : ''}">
                <div class="mission-card__info">
                    <h3 class="mission-card__title">${item.missionName}</h3>
                    <p class="mission-card__text">${item.missionDetail}</p>
                    <div class="mission-card__progress-container">
                        <div class="mission-card__progress-bar" style="width: ${isComplete ? 100 : percent}%;"></div>
                        <span class="mission-card__progress-text">
                            진행도 ${item.missionCurrCount} / ${item.missionNeedCount}
                        </span>
                    </div>
                </div>
                <div class="mission-card__reward">
                    <span class="reward-label">보상</span>
                    <span class="reward-value">${item.rewardCount} DP</span>
                    <button 
                        class="c-button c-button--primary c-button--md js-reward-btn ${(!isComplete || isRewarded) ? 'is-disabled' : ''}"
                        data-mission-id="${item.missionID}"
                        ${(!isComplete || isRewarded) ? 'disabled' : ''}>
                        ${isRewarded ? '수령완료' : '보상받기'}
                    </button>
                </div>
            </div>
        `;
    }).join('');

    initProgressAnimations();
}

/**
 * 보상받기 클릭 로직
 */
function handleReward(btn) {
    const missionId = Number(btn.dataset.missionId);
    const mission = missionData.find(item => item.missionID === missionId);

    if (!mission) return;

    if (confirm(`[${mission.missionName}] 미션 보상을 받으시겠습니까?`)) {
        mission.missionIsReward = true;

        btn.disabled = true;
        btn.innerText = '수령완료';
        btn.classList.add('is-disabled');

        const card = btn.closest('.mission-card');
        card.classList.add('is-complete');

        alert('보상이 지급되었습니다!');
    }
}
/**
 * 진행바 애니메이션
 */
function initProgressAnimations() {
    setTimeout(() => {
        document.querySelectorAll('.mission-card__progress-bar').forEach(bar => {
            bar.style.transition = 'width 1s ease-in-out';
        });
    }, 100);
}