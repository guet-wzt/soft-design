<%--
  Created by IntelliJ IDEA.
  User: wzt
  Date: 2018/12/7
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link rel="Stylesheet" type="text/css" href="PAGE_CSS/home_page.css" />
  <script rel="script" type="text/javascript" src="MY_JS/homepage.js"></script>
  <script type="text/javascript" src="MY_JS/jquery-1.7.1.min.js"></script>
  <script type="text/javascript" src="MY_JS/jquery-3.3.1.min.js"></script>
  <script type="text/javascript" src="MY_JS/js+jquery-1.8.1.js"></script>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>旅游图文</title>
  <script type="text/javascript" rel="script" src="MY_JS/bootstrap.min.js"></script>
  <script type="text/css" rel="stylesheet" src="bootstrap/bootstrap-theme.css"></script>
  <script type="text/css" rel="stylesheet" src="bootstrap/bootstrap.min.css"></script>
  <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
  <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<div id="homepage" class="hmpage">
  <div id="top-panel" class="top-menu">
    <ul id="menu" class="menu-link">
      <li class="homepg">
        <a href="index.jsp">首页</a>
      </li>
      <li class="destination">
          <a href="index.jsp">目的地</a>
      </li>
      <div class="LoginPart">
        <li class="register">
          <a class="Register" href="login.jsp">登录</a>
        </li>
        <li class="login_in">
          <a class="Login_in" href="register.jsp">注册</a>
        </li>
      </div>
    </ul>
  </div>
  <div class="Search_Part">
    <form method="post" action="SearchInput">
      <input type="text" class="search_text" name="search" value="" placeholder="搜索目的地">
      <input type="submit" class="submit" value="搜索">
    </form>
  </div>
  <div>

    <div id="myCarousel" class="carousel slide">
      <!-- 轮播（Carousel）指标 -->
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
      </ol>

      <!-- 轮播（Carousel）项目 -->
      <div class="carousel-inner">
        <div class="item active">
          <img src="photo/view1.jpeg">
        </div>
        <div class="item">
          <img src="photo/view2.jpeg">
        </div>
        <div class="item">
          <img src="photo/view8.jpeg">
        </div>
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
</div>
</body>
</html>
