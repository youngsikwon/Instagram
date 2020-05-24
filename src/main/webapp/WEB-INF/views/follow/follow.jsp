<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>YongsikStagram</title>
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
          rel="stylesheet">
    <link rel="shortcut icon" href="images/favicon.ico">
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
<%@ include file="../include/nav.jsp" %>


<nav class="navigation">
    <a href="feed.html">
        <img src="/images/logo.png" />
    </a>
    <input type="text" placeholder="Search">
    <div class="navigation__links">
        <a href="explore.html" class="navigation__link">
            <i class="fa fa-compass"></i>
        </a>
        <a href="#" class="navigation__link">
            <i class="fa fa-heart-o"></i>
        </a>
        <a href="profile.html" class="navigation__link">
            <i class="fa fa-user-o"></i>
        </a>
    </div>
</nav>
<main id="explore">
    <ul class="explore__users u-default-box">
        <li class="explore__user">
            <div class="explore__content">
                <img src="/images/avatar.jpg" />
                <div class="explore__info">
                    <span class="explore__username">serranoarevalo</span>
                    <span class="explore__full-name">Nicolás Serrano Arévalo</span>
                </div>
            </div>
            <button>Follow</button>
        </li>
        <li class="explore__user">
            <div class="explore__content">
                <img src="/images/avatar.jpg" />
                <div class="explore__info">
                    <span class="explore__username">serranoarevalo</span>
                    <span class="explore__full-name">Nicolás Serrano Arévalo</span>
                </div>
            </div>
            <button>Follow</button>
        </li>
        <li class="explore__user">
            <div class="explore__content">
                <img src="/images/avatar.jpg" />
                <div class="explore__info">
                    <span class="explore__username">serranoarevalo</span>
                    <span class="explore__full-name">Nicolás Serrano Arévalo</span>
                </div>
            </div>
            <button>Follow</button>
        </li>
        <li class="explore__user">
            <div class="explore__content">
                <img src="images/avatar.jpg" />
                <div class="explore__info">
                    <span class="explore__username">serranoarevalo</span>
                    <span class="explore__full-name">Nicolás Serrano Arévalo</span>
                </div>
            </div>
            <button>Follow</button>
        </li>
        <li class="explore__user">
            <div class="explore__content">
                <img src="/images/avatar.jpg" />
                <div class="explore__info">
                    <span class="explore__username">serranoarevalo</span>
                    <span class="explore__full-name">Nicolás Serrano Arévalo</span>
                </div>
            </div>
            <button>Follow</button>
        </li>
    </ul>
</main>

<%@ include file="../include/footer.jsp"%>
</body>
</html>
