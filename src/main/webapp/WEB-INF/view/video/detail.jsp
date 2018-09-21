<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!-- header 와 footer 중복을 막기위해 따로 jsp파일을 만들고 불러오기. -->
<jsp:include page="/WEB-INF/view/common/layout/layout_header.jsp" /> 

	<script type="text/javascript">
		$().ready(function(){
			setInterval(function(){
				var time=parseInt($("video").prop("currentTime"));
				$("#subscriptList").find("li").each(function(index, li){
					var start = parseInt($(li).data("start"));
					var end = parseInt($(li).data("end"));
					if ( time >= start && time <= end){
						$("#subscript").css({
							position:"relative"
							, "z-index": 9
							, width:$("video").css("width") + "px"
							, padding:"15px, 0px"
							, "font-size":"13pt"
							, top:"-100px"
							, color:"#FFF"
							, "text-align": "center"
						})
						.html($(li).html())
						.show();
						if ( time== end ){
							$("#subscript").hide();
						}
					}  
				})
			}, 1000);
		});
	</script>

	<div>
		<video	preload="metadata"
				autoplay controls="controls" 
				poster="<c:url value='/video/download/${video.posterPath}' />">
			<source src="<c:url value='/video/download/${video.videoPath}' />" />
		</video>
		<div id = "subscript" style="background-color: rgba(0,0,0,0.3); display : none">
		</div>
	</div>
	<div>
		${video.title}
	</div>
	<div>
		<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRHr0jD3TqFuo5_VqSAzH49dNcsfOByrfYRmIHRF4bmgxIQAas2"
			 id="icon" /> ${video.uploaderId} ${video.dateDiff} 조회수 : ${video.viewCount}
	</div>
	<div style="display:none;">
		<ul id="subscriptList">
			<li data-start="3" data-end="5">안녕하세요</li>
			<li data-start="7" data-end="15">오늘은 동영상 자막에<br/> 대해 알아볼게요</li>
			<li data-start="17" data-end="25">자막은 Floating Div를<br/> 이용해 구현합니다.</li>
			<li data-start="27" data-end="35">배경은 Alpha 값으로 <br/>투명하게 지정할 수 있어요.</li>
			<li data-start="37" data-end="53">감사합니다.</li>
		</ul>
	</div>
	<a href="/Youtube/video/list">목록</a>
	
<jsp:include page="/WEB-INF/view/common/layout/layout_footer.jsp" />