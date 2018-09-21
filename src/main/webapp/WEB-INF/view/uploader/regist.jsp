<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="/WEB-INF/view/common/layout/layout_header.jsp" /> 
<script type="text/javascript">
	$().ready(function(){
		$("#regist").click(function(){
			if ($("#uploaderId").val() == "") {
				alert("ID 를 입력해 주세요.");
				return;
			}
			else if ($("#name").val() == "") {
				alert("이름을 입력해 주세요.");
				return;
			}
			else if ($("#password").val() == "") {
				alert("Password를 입력해 주세요.");
				return;
			}
			else if ($("#file").val() == "") {
				alert("사진을 등록해 주세요.");
				return;
			}
			$("#uploadRegistForm").attr({
				"method" : "post",
				"action" : "/Youtube/uploader/regist",
				"enctype": "multipart/form-data"
			})
			.submit();
		})
	})
	
</script>
		<h1>Uploader Regist</h1>
		<form:form id="uploadRegistForm"  modelAttribute="uploaderVO">
			<div>
				<input type="text" id="uploaderId" name="uploaderId" placeholder="ID"/> <!-- 동영상 파일만 선택되도록 설정 -->
			</div>
			<div>
				<input type="text" id="name" name="name" placeholder="NAME"/>
			</div>
			<div>
				<input type="password" id="password" name="password" placeholder="PASSWORD"/>
			</div>
			<div>
				<input type="file" id="file" name="file" placeholder="PICTURE" accept=".jpg, .jpeg, .png"/>
			</div>
			<div>
				<input type="button" id="regist" value="Regist"/>
			</div>
		</form:form>
		<a href="/Youtube/uploader/login">로그인</a>
	<jsp:include page="/WEB-INF/view/common/layout/layout_footer.jsp" />