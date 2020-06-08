<%@page import="model.Users"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="include/nav.jsp"%>
<%
	Users principal = (Users) session.getAttribute("principal");
%>

<h1>
	<%
		if (principal != null) {
	%>
	<%=principal.getUsername()%>
	<%
		}
	%>
</h1>
<div class="container">

	<div class="card m-2" style="width: 100%">
		<div class="card-body">
			<h4 class="card-title">제목 들어갈 자리</h4>
			<p class="card-text">본문 미리 보기...</p>
			<a href="#" class="btn btn-primary">상세보기</a>
		</div>
	</div>

	<div class="card m-2" style="width: 100%">
		<div class="card-body">
			<h4 class="card-title">제목 들어갈 자리</h4>
			<p class="card-text">본문 미리 보기...</p>
			<a href="#" class="btn btn-primary">상세보기</a>
		</div>
	</div>

	<div class="card m-2" style="width: 100%">
		<div class="card-body">
			<h4 class="card-title">제목 들어갈 자리</h4>
			<p class="card-text">본문 미리 보기...</p>
			<a href="#" class="btn btn-primary">상세보기</a>
		</div>
	</div>

</div>
<%@ include file="include/footer.jsp"%>