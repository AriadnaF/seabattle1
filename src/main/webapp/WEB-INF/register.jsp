<%--
  Created by IntelliJ IDEA.
  User: JavaCourses1
  Date: 25.01.2018.
  Time: 18:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register - Sea Battle</title>
</head>
<body>
<form action="register" method="post">
<%--
  action - chto budet vyzyvatjsja path for brouser (if with "\" then saebattle disappears)
  method post - not to show all parameters
  how to draw boxes?
--%>
Enter your name:
<input type="text" name="player-name">
<input type="submit" name="register" value="Start!">
</form>
</body>
</html>
