let tags = [];
let tagsDTO = [];
let courseId = getQueryVariable("courseId");

function initTagCallBack(result) {
    tags = result;
    for (let i = 0; i < result.length; ++i) {
        result[i].seq = i;
        $("#all-tags").append(
            formatTemplate(result[i], $('script[type="text/template-tag"]').html()));
    }
}

function addTagCallBack(result) {
    if (result.code === 200) {
        alert("添加标签成功！");
    }
    window.location.href = "class_info.html?courseId=" + courseId;

}

/** Choose Tags */
$(document).on("click", '.my-tag', function () {
    let li = document.createElement("li");
    li.innerText = this.innerText;
    li.classList.add('tag');
    document.getElementById('my-tags').appendChild(li);

    let tagSeq = $(this).children('label')[0].innerText;
    let cId = parseInt(courseId.toString());
    let tag = {
        courseId: cId,
        tagId: tags[tagSeq].id
    };
    tagsDTO.push(tag);
});

function addTag() {
    let url = baseUrl + "tag/add";
    request(url, "POST", tagsDTO, addTagCallBack);
}

function addCommentCallBack(result) {
    if (result.code === 200) {
        alert("评论成功！");
    }
    window.location.href = "class_info.html?courseId=" + courseId;
}

function addComment() {
    let user = getCookie("user");
    let comment = document.getElementById("comment").value;
    console.log(comment);
    let url = baseUrl + "comment/add";

    let commentDTO = {
        comment: comment,
        courseId: courseId,
        userId: user.id
    };

    request(url, "POST", commentDTO, addCommentCallBack);
}

function initCourseCallBack(result) {
    document.getElementById("course-name").innerText = result.name;
    document.getElementById("course-teacher").innerText = "授课教师：" + result.teacher;
    document.getElementById("course-time").innerText = "授课时间：" + result.schoolTime;
    document.getElementById("course-campus").innerText = "校区：" + result.campus;
    document.getElementById("course-type").innerText = "课程类型：" + result.courseType;
    document.getElementById("course-remark").innerText = "备注：" + result.remark;
    document.getElementById("course-introduction").innerText = result.introduction;
}

function initCourseTagCallBack(result) {

    for (let i = 0; i < result.length; ++i) {
        for (let j = 0; j < tags.length; ++j) {
            if (result[i].tagId === tags[j].id) {
                result[i].courseTagName = tags[j].tag;
            }
        }
        $("#course-tags").append(
            formatTemplate(result[i], $('script[type="text/template-course-tag"]').html()));
    }
}

function initCommentCallBack(result) {
    for (let i = 0; i < result.length; ++i) {
        $("#comment-list").append(
            formatTemplate(result[i], $('script[type="text/template-comment"]').html()));
    }
}

function init() {
    let user = getCookie("user");
    let url_course = baseUrl + "course/" + courseId;
    let url_courseTag = baseUrl + "tag/" + courseId;
    let url_tag = baseUrl + "tag/getAll";
    let url_comment = baseUrl + "comment/" + courseId;

    request(url_course, "GET", null, initCourseCallBack);
    request(url_tag, "GET", null, initTagCallBack);
    request(url_courseTag, "GET", null, initCourseTagCallBack);
    request(url_comment, "GET", null, initCommentCallBack);
    document.getElementById("comment-username").innerText = user.name;
}

init();