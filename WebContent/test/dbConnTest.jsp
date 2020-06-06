<%@page import="java.sql.Connection"%>
<%@page import="db.DBConn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DB 연결 Test</title>
</head>
<body>
	<%
	Connection conn = DBConn.getConnection();
	%>
	
	<%if(conn != null) { %>
	<h1>DB 연결 성공</h1>
	<% }else{ %>
	<h1>DB 연결 실패</h1>
	<% } %>
	
</body>
</html>