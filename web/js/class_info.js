function getTags() {

}

function uploadComment() {
    let userName = document.getElementById("userName").value;
    let comment = document.getElementById("comment").value;

    let url = "";

    let commentData = {
        comment: comment,
        courseId: 0,
        userId: 0
    };

    fetch(url, {
        headers: {
            'content-type': 'application/json'
        },
        mode: 'cors',
        method: "POST",
        body: JSON.stringify(commentData)
    })
        .then(response => response.json())
        .then(result => {
            console.log(result);
        }).catch(error => {
        console.error(error);
    });
}