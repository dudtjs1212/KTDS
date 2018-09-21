<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/view/common/layout/layout_header.jsp" /> 
<script type="text/javascript">
	$().ready(function(){
		$("#login").click(function(){
			if ($("#uploaderId").val() == "") {
				alert("ID 를 입력해 주세요.")
				return;
			}
			else if ($("#password").val() == "") {
				alert("Password를 입력해 주세요.")
				return;
			}
			$("#loginForm").attr({
				"method" : "post",
				"action" : "/Youtube/uploader/login"
			}).submit();
		});
	});
</script>	
	<h1>Login</h1>
	<div>
		<c:if test= "${param.error eq '1' }">
			<article>
				<div class="error"> 
					ID 또는 Password가 맞지 않습니다.
				</div>
			</article>
		</c:if>
		<form:form id="loginForm" modelAttribute="uploaderVO">
			<div>
				<input type="text" id="uploaderId" name="uploaderId" value="${uploaderVO.uploaderId}" placeholder="ID"/>
			</div>
			<div>
				<input type="password" id="password" name="password" value="${uploaderVO.password}" placeholder="Password"/>
			</div>
			<div>
				<input type="button" id="login" value="Login"/>
			</div>
		</form:form>
	</div>
<jsp:include page="/WEB-INF/view/common/layout/layout_footer.jsp" />