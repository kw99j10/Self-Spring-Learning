<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>파라미터 처리</h1>
	
	<form action="param.do" method="post">
		이름 : <input type="text" name="name"> <br/>
		성별 : <input type="radio" name="gender" value="male" /> 남
				<input type="radio" name="gender" value="female" /> 여
				 <br/>
		취미 : <input type="checkbox" name="hobby" value="game" /> 게임
				<input type="checkbox" name="hobby" value="dance" /> 춤
				 <br/> 
		<input type="submit" value="전송">
		<input type="reset" value="취소">
	</form>
</body>
</html>