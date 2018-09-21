<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!-- header 와 footer 중복을 막기위해 따로 jsp파일을 만들고 불러오기. -->
<jsp:include page="/WEB-INF/view/common/layout/layout_header.jsp" /> 
<script type="text/javascript">
	$().ready(function() {
		$("#upload").click(function(){
			if ( $("#video").val() == "" ) {
				alert("비디오를 선택해 주세요.")
				$("#video").focus()
				return
			}
			else if ( $("#title").val() == "" ) {
				alert("제목을 입력해 주세요.")
				$("#title").focus()
				return
			}
			else if ( $("#uploaderId").val() == "" ) {
				alert("Uploader를 입력해 주세요.")
				$("#uploaderId").focus()
				return
			}
			else if ( $("#poster").val() == "" ) {
				alert("포스터를 선택해 주세요.")
				$("#poster").focus()
				return
			}
			$("#videoUploadForm").attr({    //실무에서 사용하는 File Upload Code //속성을 부여하겠다. 3가지의 속성.
				"method" : "post",			// 같은 Form이라도 전송이 되는 위치가 달라지기 때문 또한 Validation Check를 하기 위해서 .
				"action" : "/Youtube/video/create",
				"enctype": "multipart/form-data"
			})  
			.submit()
		})
	})
</script>
		<h1>Video Upload</h1>
		<form:form id="videoUploadForm"  modelAttribute="videoVO">
			<div>
				<input type="file" id="videoPath" name="video"  accept=".mp4, .avi"/> <!-- 동영상 파일만 선택되도록 설정 -->
			</div>
			<div>
				<input type="text" id="title" name="title"/>
			</div>
			<div>
				<input type="hidden" id="uploaderId" name="uploaderId" value="${sessionScope._USER_.uploaderId}"/>
			</div>
			<div>
				<input type="file" id="posterPath" name="poster"  accept=".jpg, .jpeg, .png"/> 
			</div>
			<div>
				<input type="button" id="upload" value="Upload"/>
			</div>
		</form:form>
		<a href="/Youtube/video/list">목록</a>
	<jsp:include page="/WEB-INF/view/common/layout/layout_footer.jsp" />