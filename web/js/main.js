/** Sticky Navigation*/
let nav = $('.nav-area');

$(window).scroll(function () {
    let oTop = $(".blog").offset().top - window.innerHeight;
    if ($(window).scrollTop() > oTop) {
        nav.addClass('stick');
    } else {
        nav.removeClass('stick');
    }
});

/** Counter addition */
let nCount = function (selector) {
    $(selector).each(function () {
        $(this).animate(
            {
                Counter: $(this).text()
            },
            {
                duration: 5000,
                easing: "swing",
                step: function (value) {
                    $(this).text(Math.ceil(value));
                }
            }
        );
    });
};

let a = 0;
$(window).scroll(function () {
    let oTop = $(".sata").offset().top - window.innerHeight;
    if (a === 0 && $(window).scrollTop() >= oTop) {
        a++;
        nCount(".number");
    }
});

/** window load functions */
$(window).on('load', function () {
    let Loader = $(".loader-section");
    Loader.fadeOut(1000);

});

/** smooth scroll*/
$('#main-menu li a').on('click', function (event) {
    event.preventDefault();
    var anchor = $(this).attr('href');
    var top = $(anchor).offset().top;
    $('html, body').animate({
        scrollTop: $(anchor).offset().top
    }, 1000);
});

/** bg-video play and pause */
$(document).on('click', '.bg-video', function () {
    let video = document.getElementById('bg-mp4');
    if (video.paused) {
        video.play();
        $(".fa-play").attr("class", "fa fa-pause");
    } else {
        video.pause();
        $(".fa-pause").attr("class", "fa fa-play");
    }
});


/** bgm play and pause */
$(document).on('click', '.bgm', function () {
    let music = document.getElementById('bg-music');
    if (music.paused) {
        music.play();
        $(".fa-music").attr("class", "fa fa-volume-off");
    } else {
        music.pause();
        $(".fa-volume-off").attr("class", "fa fa-music");
    }
});

/** bottom to top */
$(document).on('click', '.go-top', function () {
    $("html,body").animate({
        scrollTop: 0
    }, 1000);
});

/** top to bottom */
$(document).on('click', '.go-bottom', function () {
    $("html,body").stop();
    $("html,body").animate({
        scrollTop: $('.footer').offset().top
    }, 1000);
});


