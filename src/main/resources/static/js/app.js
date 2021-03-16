$(document).ready(function() {
    $cog = $(".fa-cog"),
        $overlay = $(".profile__overlay"),
        $closeBtn = $(".fa-times"),
        $cancelBtn = $("#cancel"),
        $logoutBtn = $("#logout");

    $cog.click(function () {
        $overlay.fadeIn();
    });
});


