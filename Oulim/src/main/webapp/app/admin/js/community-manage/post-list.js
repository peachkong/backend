
const postDetail = document.querySelectorAll(".clicktitle");

postDetail.forEach((btn) => {
    btn.addEventListener("click", function(){
    location.href = "/Oulim/admin/html/community-manage/post-detail.html";
});
});