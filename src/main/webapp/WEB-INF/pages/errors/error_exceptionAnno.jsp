<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>@ExceptionHandler方式处理的异常信息</h1>
	<% 
		Exception ex = (Exception)request.getAttribute("ex");
		out.println(ex.getMessage());
		out.println(ex.getClass());
	%>
</body>
</html>