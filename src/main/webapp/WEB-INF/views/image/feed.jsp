<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Feed | Jejugram</title>
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
          rel="stylesheet">
    <link rel="shortcut icon" href="/images/favicon.ico">
    <link rel="stylesheet" href="/css/styles.css">
    <link rel="stylesheet" href="/css/modal.css">
</head>
<body>


-- nav 인클라우드~
<%@ include file="../include/nav.jsp" %>
-- nav 인클라우드~
<main id="feed">
    <div class="photo u-default-box">
        <header class="photo__header">
            <img src="/images/avatar.jpg" />
            <span class="photo__username">serranoarevalo</span>
        </header>
        <img src="/images/feedPhoto.jpg" />
        <div class="photo__info">
            <div class="photo__actions">
            <span class="photo__action">
              <i class="fa fa-heart-o heart"></i>
            </span>
                <span class="photo__action">
              <i class="fa fa-comment-o"></i>
            </span>
            </div>
            <span class="photo__likes">5,103 likes</span>
            <ul class="photo__comments">
                <li class="photo__comment">
                    <span class="photo__comment-author">serranoarevalo</span> i love this!
                </li>
                <li class="photo__comment">
                    <span class="photo__comment-author">serranoarevalo</span> i don't love this!
                </li>
            </ul>
            <span class="photo__date">1 hour ago</span>
            <div class="photo__add-comment-container">
                <textarea placeholder="Add a comment..."></textarea>
                <i class="fa fa-ellipsis-h"></i>
            </div>
        </div>
    </div>
    <div class="photo u-default-box">
        <header class="photo__header">
            <img src="/images/avatar.jpg" />
            <span class="photo__username">serranoarevalo</span>
        </header>
        <img src="/images/feedPhoto.jpg" />
        <div class="photo__info">
            <div class="photo__actions">
            <span class="photo__action">
              <i class="fa fa-heart-o heart"></i>
            </span>
                <span class="photo__action">
              <i class="fa fa-comment-o"></i>
            </span>
            </div>
            <span class="photo__likes">5,103 likes</span>
            <ul class="photo__comments">
                <li class="photo__comment">
                    <span class="photo__comment-author">serranoarevalo</span> i love this!
                </li>
                <li class="photo__comment">
                    <span class="photo__comment-author">serranoarevalo</span> i don't love this!
                </li>
            </ul>
            <span class="photo__date">1 hour ago</span>
            <div class="photo__add-comment-container">
                <textarea placeholder="Add a comment..."></textarea>
                <i class="fa fa-ellipsis-h"></i>
            </div>
        </div>
    </div>
</main>



<!-- Modal 시작 -->
<div id="modal">
    <div id="follow_popup_list">

        <div class="follow_popup_item">
            <img src="/images/avatar.jpg" alt="코스사진">
            <p><a href="#">코스</a></p>
            <button class="following_btn">팔로잉</button>
        </div>

        <div class="follow_popup_item">
            <img src="/images/avatar.jpg" alt="코스사진">
            <p><a href="#">코스</a></p>
            <button class="follower_btn">팔로워</button>
        </div>

        <div class="follow_popup_close">
            <button type="button">닫기</button>
        </div>
    </div>

</div>
<!-- Modal 끝 -->
<script src="js/modal.js"></script>
</body>
</html>