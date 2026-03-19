/**
 * rank.js
 * 랭킹 데이터 정렬 및 동적 렌더링
 */

document.addEventListener('DOMContentLoaded', () => {
    if (!Array.isArray(rankData) || rankData.length === 0) {
        renderEmptyRank();
        return;
    }
	console.log(rankData);

    const top10Data = rankData.filter(user => user.ranking <= 10);
    const myRankData = rankData.find(user => user.userNo === loginUserNo);

    renderTop3(top10Data);
    renderRankList(top10Data);
    renderMyRankCard(myRankData);
});

function renderEmptyRank() {
    const top3Container = document.querySelector('.p-rank__top3');
    const listContainer = document.querySelector('.c-rank-list');

    if (top3Container) {
        top3Container.innerHTML = `<p class="c-rank-empty">랭킹 데이터가 없습니다.</p>`;
    }

    if (listContainer) {
        listContainer.innerHTML = '';
    }
}

/**
 * 상단 TOP 3 렌더링 (2등 - 1등 - 3등 순서로 배치)
 */
function renderTop3(data) {
    const top3Container = document.querySelector('.p-rank__top3');
    if (!top3Container) return;

    const first = data.find(user => user.ranking === 1);
    const second = data.find(user => user.ranking === 2);
    const third = data.find(user => user.ranking === 3);

    const displayOrder = [second, first, third].filter(Boolean);

    if (displayOrder.length === 0) {
        top3Container.innerHTML = '';
        return;
    }

    const medalsByRank = {
        1: "🥇",
        2: "🥈",
        3: "🥉"
    };

    const classByRank = {
        1: "first",
        2: "second",
        3: "third"
    };

    top3Container.innerHTML = displayOrder.map(user => `
        <div class="c-rank-card c-rank-card--${classByRank[user.ranking]}">
            <div class="c-rank-card__rank">${medalsByRank[user.ranking]}</div>
            <img src="${contextPath}/asset/image/character/komi-lv${user.level}.svg" class="c-rank-card__img" alt="캐릭터">
            <div class="c-rank-card-user">
                <span class="c-rank-card-user__name">${user.name}</span>
                <span class="c-rank-card-user__score">${Number(user.score).toLocaleString()}p</span>
            </div>
        </div>
    `).join('');
}

/**
 * 4위~10위 리스트 렌더링
 */
function renderRankList(data) {
    const listContainer = document.querySelector('.c-rank-list');
    if (!listContainer) return;

    const others = data.filter(user => user.ranking >= 4 && user.ranking <= 10);

    if (others.length === 0) {
        listContainer.innerHTML = '';
        return;
    }

    listContainer.innerHTML = others.map(user => `
        <li class="c-rank-item">
            <span class="c-rank-item__rank">${user.ranking}</span>
            <span class="c-rank-item__name">${user.name}</span>
            <span class="c-rank-item__score">${Number(user.score).toLocaleString()}p</span>
        </li>
    `).join('');
}
/**
 * 내 랭킹 카드
 */
function renderMyRankCard(myRank) {
    const myRankContainer = document.querySelector('.p-rank__my');
    if (!myRankContainer) return;

    if (!myRank) {
        myRankContainer.innerHTML = '';
        return;
    }

    myRankContainer.innerHTML = `
        <div class="c-my-rank-card">
            <div class="c-my-rank-card__badge">내 랭킹</div>
            <div class="c-my-rank-card__content">
                <div class="c-my-rank-card__left">
                    <img src="${contextPath}/asset/image/character/komi-lv${myRank.level}.svg" class="c-my-rank-card__img" alt="내 캐릭터">
                    <div class="c-my-rank-card__user">
                        <span class="c-my-rank-card__name">${myRank.name}</span>
                        <span class="c-my-rank-card__score">${Number(myRank.score).toLocaleString()}p</span>
                    </div>
                </div>
                <div class="c-my-rank-card__rank">${myRank.ranking}위</div>
            </div>
        </div>
    `;
}