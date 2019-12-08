/** Choose Tags */
$('#all-tags li').on('click', function () {
    let li = document.createElement("li");
    li.innerText = this.innerText;
    li.classList.add('tag');
    document.getElementById('my-tags').appendChild(li);
});