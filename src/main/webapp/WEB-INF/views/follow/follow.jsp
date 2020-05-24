<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <link rel="stylesheet" href="/css/model.css">
</head>
<body>
<%@ include file="../include/nav.jsp" %>

<main id="explore">

    <c:forEach var="follow" items="${follows}">
    <ul class="explore__users u-default-box">
        <li class="explore__user">
            <div class="explore__content">
                <img src="/images/avatar.jpg" />
                <div class="explore__info">
                    <span class="explore__username">${follow.toUser.username}</span>
                </div>
            </div>
            <button onclick="follow(false, ${user.id})" class="following_btn">팔로잉</button>
        </li>
        </c:forEach>
        </li>
    </ul>
</main>

<%@ include file="../include/footer.jsp"%>
</body>
</html>
