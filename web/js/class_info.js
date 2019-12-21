/* Choose Tags */
$('#all-tags li').on('click', function () {
    let li = document.createElement("li");
    li.innerText = this.innerText;
    li.classList.add('tag');
    document.getElementById('my-tags').appendChild(li);
});



function commentCallBack (result) {
    if(result.code == 200){
        //页面跳转
        window.location.href = "http://localhost/pces/class_info.html";
    }
}


function getTags() {
    let course = getCookie("course");


}

function submitComment() {
    let url = baseUrl +"comment/add";
    let user = getCookie("user");
    let course = getCookie("course");
    let comment = document.getElementById("user-comment").value;

    let commentData = {
        comment: comment,
        courseId: course.id,
        userId: user.id
    };

    request(url,"POST",commentData,commentCallBack);
}