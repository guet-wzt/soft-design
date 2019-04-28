<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wzt
  Date: 2019/1/8
  Time: 17:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>广西旅游</title>
    <script type="text/javascript" rel="script" src="MY_JS/bootstrap.min.js"></script>
    <script type="text/css" rel="stylesheet" src="bootstrap/bootstrap-theme.css"></script>
    <script type="text/css" rel="stylesheet" src="bootstrap/bootstrap.min.css"></script>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="MY_JS/jquery-1.7.1.min.js"></script>
    <script type="text/javascript" src="MY_JS/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="MY_JS/js+jquery-1.8.1.js"></script>
    <script type="text/css" rel="stylesheet" src="PAGE_CSS/css_base.css"></script>
    <script type="text/css" rel="stylesheet" src="PAGE_CSS/comm_v7.css"></script>
    <script type="text/css" rel="stylesheet" src="PAGE_CSS/common_2016.css"></script>
    <script type="text/css" rel="stylesheet" src="PAGE_CSS/comm_v7_sidebar.css"></script>
</head>
<body>
<div>
    <div class="content mt20">
        <div class="box_list">
            <div class="box_change">
                <div class="change_con">
                </div>
            </div>
            <div class="city_spots">
                <div class="first_con"></div>
                <div class="city_spots_list">
                    <ul>
                        <c:forEach items="${intrPath}" var="intrPath" varStatus="loop">
                        <li class=""><a href="/sightSpot?id=${intrPath.id}" class="phoPath">
                            <div class="icon"><sup class="t2"></sup></div>
                            <img class="lazy" data-original="${phoPath[loop.count-1]}</"
                                 src="${phoPath[loop.count-1]}" width="287" height="190" alt=""
                                 style="display: block;">
                            <div class="title"><b>${intrPath.name}</b></div>
                        </a>
                            <div class="text_con"><p>${intrPath.place}</p>
                            </div>
                            <>
                            </c:forEach>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
