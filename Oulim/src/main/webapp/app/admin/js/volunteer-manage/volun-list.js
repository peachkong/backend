// const volunDetail = document.querySelector(".volundetail");

// volunDetail.addEventListener("click", function(){
//     location.href = "/Oulim/admin/html/volunteer-manage/volun-detail.html";
// });

const volunDetail = document.querySelectorAll(".volundetail");

volunDetail.forEach((btn) => {
  btn.addEventListener("click", function () {
    location.href = "/Oulim/admin/html/volunteer-manage/volun-detail.html";
  });
});
