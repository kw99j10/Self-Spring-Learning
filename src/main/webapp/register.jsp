<%--
  Created by IntelliJ IDEA.
  User: Jung kyoungwon
  Date: 2023-07-04
  Time: 오후 2:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>사용자 등록</h1>
<div style="color: red">${errorMsg}</div>
<form action="register.do" method="post">
    id : <input type="text" name="userId"> <br/>
    pw : <input type="password" name="password"> <br/>
    name : <input type="text" name="name"> <br/>
    email : <input type="text" name="email"> <br/>
    <!-- 		gender : <input type="radio" name="gender" value="male" /> 남
                    <input type="radio" name="gender" value="female" /> 여
                     <br/>
            hobby : <input type="checkbox" name="hobby" value="game" /> 게임
                    <input type="checkbox" name="hobby" value="dance" /> 춤
                     <br/>  -->
    <input type="submit" value="사용자 등록">
    <input type="reset" value="취소">
</form>
</body>
</html>
