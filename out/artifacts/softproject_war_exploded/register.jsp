<%--
  Created by IntelliJ IDEA.
  User: wzt
  Date: 2019/1/6
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register</title>
    <link rel="stylesheet" href="PAGE_CSS/register.css">
</head>
<body>
<h1 align="center"><b>用户注册</b></h1>
<div id="register" class="Register" align="center">
    <form id="register_form" action="register" method="post">
        <table align="center" width="40%" cellpadding="4px">
            <tr>
                <td align="right" width="43%">用户名：</td>
                <td width="57%"><input id="user_name" name="user_name" type="text" value=""></td>
            </tr>
            <tr>
                <td align="right">密码：</td>
                <td><input id="password" type="password" name="password" value=""></td>
            </tr>
            <tr>
                <td align="right">确认密码：</td>
                <td><input id="REpassword" type="password" name="repassword" value=""></td>
            </tr>
        </table>
        <p></p>
        <div class="REGISTER">
            <input type="submit" value="提交" class="Submit"/>
            <input type="reset" value="重置" class="Reset"/>
        </div>
    </form>
</div>
</body>
</html>
