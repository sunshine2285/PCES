let tags = [];
let tagsDTO = [];

/** Choose Tags */
$('#all-tags li').on('click', function () {
    let li = document.createElement("li");
    li.innerText = this.innerText;
    li.classList.add('tag');
    document.getElementById('my-tags').appendChild(li);

    let tagSeq = $(this).find("label").innerText;
    tagsDTO.push(tags[parseInt(tagSeq)]);
});

function initTagCallBack(result) {
    tags = result;
    for (let i = 0; i < result.length; ++i) {
        result[i].seq = i;
        $("all-tags").append(
            formatTemplate(result[i], $('script[type="text/template-tag"]').html()));
    }
}

function addTagCallBack(result) {
    let courseId = getQueryVariable("courseId");
    if (result.code === 200) {
        alert("评论成功！");
    }
    window.location.href = "class_info.html?courseId=" + courseId;
}

function addTag() {
    let user = getCookie("user");
    let userName = user.name;
    let comment = document.getElementById("comment").value;
    let url = baseUrl + "tag/add";
    let courseId = getQueryVariable("courseId");

    request(url, "POST", tagsDTO, addTagCallBack);
}

function addCommentCallBack(result) {
    let courseId = getQueryVariable("courseId");
    if (result.code === 200) {
        alert("评论成功！");
    }
    window.location.href = "class_info.html?courseId=" + courseId;
}

function addComment() {
    let user = getCookie("user");
    let userName = user.name;
    let comment = document.getElementById("comment").value;
    let url = baseUrl + "comment/add";
    let courseId = getQueryVariable("courseId");

    let commentDTO = {
        comment: comment,
        courseId: courseId,
        userId: user.id
    };

    request(url, "POST", commentDTO, addCommentCallBack);
}

function initCourseCallBack(result) {
    document.getElementById("course-name").innerText = result.name;
    document.getElementById("course-time").innerText = result.teacher;
    document.getElementById("course-campus").innerText = result.campus;
    document.getElementById("course-type").innerText = result.type;
    document.getElementById("course-remark").innerText = result.remark;
    document.getElementById("course-introduction").innerText = result.introduction;
}

function initCourseTagCallBack(result) {
    // console.log(result);
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
    // console.log(result);
    for (let i = 0; i < result.length; ++i) {
        $("#comment-list").append(
            formatTemplate(result[i], $('script[type="text/template-comment"]').html()));
    }
}

function init() {
    let user = getCookie("user");
    let courseId = getQueryVariable("courseId");
    let url_course = baseUrl + "course/" + courseId;
    let url_courseTag = baseUrl + "tag/" + courseId;
    let url_tag = baseUrl + "comment/getAll";
    let url_comment = baseUrl + "comment/" + courseId;

    request(url_course, "GET", null, initCourseCallBack);
    request(url_tag, "GET", null, initTagCallBack);
    request(url_courseTag, "GET", null, initCourseTagCallBack);
    request(url_comment, "GET", null, initCommentCallBack);
    document.getElementById("comment-username").innerText = user.name;
}

init();