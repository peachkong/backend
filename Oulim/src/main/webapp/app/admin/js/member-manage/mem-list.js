// const editMember = document.querySelector(".memedit");

// editMember.addEventListener("click", function(){
//     location.href = "/Oulim/admin/html/member-manage/mem-edit.html";
// });

const editMember = document.querySelectorAll(".memdetail");

editMember.forEach((btn) => {
  btn.addEventListener("click", function () {
    location.href = "/Oulim/admin/html/member-manage/mem-detail.html";
  });
});
