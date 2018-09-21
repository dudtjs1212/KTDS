<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/Youtube/css/layout.css"/>
<script src="/Youtube/js/jquery-3.3.1.min.js" type="text/javascript"></script>
</head>
<body>

	<div id="wrapper">
		<header>
			Header
			<c:if test="${not empty sessionScope._USER_}">
				${sessionScope._USER_.name} (${sessionScope._USER_.point} 점)
			</c:if>
		</header>
		<section class="inline">
			<aside>
				Aside
			</aside>
		<section>
				