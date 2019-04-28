<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="bean.ViewspotEntity" %><%--
  Created by IntelliJ IDEA.
  User: wzt
  Date: 2019/1/8
  Time: 17:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script rel="stylesheet" type="text/css" src="PAGE_CSS/siteShow.css"></script>
    <title>广西旅游</title>
    <script type="text/javascript" rel="script" src="MY_JS/bootstrap.min.js"></script>
    <script type="text/css" rel="stylesheet" src="bootstrap/bootstrap-theme.css"></script>
    <script type="text/css" rel="stylesheet" src="bootstrap/bootstrap.min.css"></script>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="MY_JS/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="MY_JS/js+jquery-1.8.1.js"></script>
    <script type="text/css">
        .carousel-inner div{
            width: 700px;
            height: 600px;
            text-align: center;
            alignment: center;
        }
        .carousel-inner img{
            alignment: center;
            width: 600px;
            height: 600px;
        }
    </script>
</head>
<body>
<div>
    <div style="text-align: center">
        <h3>景点详情</h3>
    </div>
    <div>
        <div id="myCarousel" class="carousel slide">
            <!-- 轮播（Carousel）指标 -->
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li>
                <li data-target="#myCarousel" data-slide-to="3"></li>
                <li data-target="#myCarousel" data-slide-to="4"></li>
                <li data-target="#myCarousel" data-slide-to="5"></li>
                <li data-target="#myCarousel" data-slide-to="6"></li>
                <li data-target="#myCarousel" data-slide-to="7"></li>
                <li data-target="#myCarousel" data-slide-to="8"></li>
                <li data-target="#myCarousel" data-slide-to="9"></li>
            </ol>

            <!-- 轮播（Carousel）项目 -->
            <%int i = 0;%>
            <div class="carousel-inner" align="center">
                <c:forEach items="${picture}" var="picture">
                    <%if (i==0){%>
                    <div class="item active" align="center">
                        <img align="center" style="width: 700px;height: 600px;alignment: center;text-align: center" src="${picture}">
                    </div>
                    <%i=1;}else{%>
                    <div class="item" >
                        <img align="center"  style="width: 700px;height: 600px;alignment: center;text-align: center" src="${picture}">
                    </div>
                    <%}%>
                </c:forEach>
            </div>
            <!-- 轮播（Carousel）导航 -->
            <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>
        <script>
            $(function(){
                // 初始化轮播
                $("#myCarousel").carousel('cycle');
            });
        </script>
    </div>
    <div>
        <h4 >景点介绍：</h4>
    </div>
    <div style="text-align: center">
        <div style="width: 700px;alignment: center;text-align: center">
            <c:forEach items="${context}" var="context">
                ${context}
            </c:forEach>
        </div>
    </div>
</div>
</body>
</html>
