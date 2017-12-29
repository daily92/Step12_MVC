<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>views/showtime.jsp</title>
</head>
<body>
	<%
		String time= (String) request.getAttribute("time");
	%>
	<%--얘는 위의 java 코드 있어야 동작함 --%>
	<p> 현재 시간 : <strong><%=time %></strong></p>
	<%--얘는 위의 java 코드 없어도 동작함 --%>
	<p> 현재 시간 : <strong>${time }</strong></p>
</body>
</html>