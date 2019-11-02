//var tagArea = '.tag-area';
var backSpace;
var close = '<a class="close"></a>';
var PreTags = $('.tag-line').val().trim().split(" ");

$('.tag-line').after('<ul class="tag-box"></ul>');

for (i=0 ; i < PreTags.length; i++ ){
    $('.tag-box').append('<li class="tags">'+PreTags[i]+close+'</li>');
}

$('.tag-box').append('<li class="new-tag"><input class="input-tag" type="text"></li>');

// Taging
$('.input-tag').bind("keydown", function (kp) {
    var tag = $('.input-tag').val().trim();
    $(".tags").removeClass("danger");
    if(tag.length > 0){
        backSpace = 0;
        if(kp.keyCode  == 13){
            $(".new-tag").before('<li class="tags">'+tag+close+'</li>');
            $(this).val('');
        }}

    else {if(kp.keyCode == 8 ){
        $(".new-tag").prev().addClass("danger");
        backSpace++;
        if(backSpace == 2 ){
            $(".new-tag").prev().remove();
            backSpace = 0;
        }
    }
    }
});
//Delete tag
$(".tag-box").on("click", ".close", function()  {
    $(this).parent().remove();
});
$(".tag-box").click(function(){
    $('.input-tag').focus();
});
// Edit
$('.tag-box').on("dblclick" , ".tags", function(cl){
    var tags = $(this);
    var tag = tags.text().trim();
    $('.tags').removeClass('edit');
    tags.addClass('edit');
    tags.html('<input class="input-tag" value="'+tag+'" type="text">')
    $(".new-tag").hide();
    tags.find('.input-tag').focus();

    tag = $(this).find('.input-tag').val() ;
    $('.tags').dblclick(function(){
        tags.html(tag + close);
        $('.tags').removeClass('edit');
        $(".new-tag").show();
    });

    tags.find('.input-tag').bind("keydown", function (edit) {
        tag = $(this).val() ;
        if(edit.keyCode  == 13){
            $(".new-tag").show();
            $('.input-tag').focus();
            $('.tags').removeClass('edit');
            if(tag.length > 0){
                tags.html(tag + close);
            }
            else{
                tags.remove();
            }
        }
    });
});
// sorting
$(function() {
    $( ".tag-box" ).sortable({
        items: "li:not(.new-tag)",
        containment: "parent",
        scrollSpeed: 100
    });
    $( ".tag-box" ).disableSelection();
});