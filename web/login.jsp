<%--
  Created by IntelliJ IDEA.
  User: wzt
  Date: 2019/1/6
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="PAGE_CSS/login.css" />
    <title>Login</title>
</head>
<body bgcolor="#FFFFFF">
<h1 align="center"><b>用户登录</b></h1>
<form  class="Login_Form" action="LoginJudge" method="post">
    <p></p>
    <table width="40%" border="1" align="center">
        <tr bgcolor="#FFFFCC">
            <td align="center" width="43%">
                <div align="center">用户名:</div>
            </td>
            <td width="57%">
                <div align="left">
                    <input type="text" name="username" />
                </div>
            </td>
        </tr>
        <tr bgcolor="#CCFF99">
            <td align="center" width="43%">
                <div align="center">密码：</div>
            </td>
            <td width="57%">
                <div align="left">
                    <input type="password" name="password" />
                </div>
            </td>
        </tr>
    </table>
    <p align="center">
        <input class="SUBMIT" type="submit" name="Submit" value="提交" />
        <input class="RESET" type="reset" name="Reset" value="重置" />
    </p>
</form>
</body>
</html>
