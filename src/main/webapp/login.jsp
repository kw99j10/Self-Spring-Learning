<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>로그인</h1>
<form action="login.do" method="get">
    id:<input type="text" name="userId"><br/>
    pw:<input type="password" name="password"><br/>
    <%-- gender:<input type="radio"  name="gender"/>남
             <input type="radio"  name="gender"/>여<br/>

     hobby: <input type="checkbox" name="hobby" value="game"/>게임
         <input type="checkbox" name="hobby" value="dance"/>춤<br/>--%>
    <input type="button" value="로그인">
    <input type="reset" value="취소">
</form>
</body>
</html>