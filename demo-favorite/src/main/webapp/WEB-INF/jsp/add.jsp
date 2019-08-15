<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/styles.css">
<style type="text/css">
ul,li{
list-style: none;
}
</style>
<script type="text/javascript" src="js/jquery.min.js"></script>
</head>
<body>
	<form action="doAdd.do" method="post">
		<input name ="state" type = "hidden" value="${param.state }">
		<input name ="id" type = "hidden" value="${param.id }">
		<label>名称：</label> <input type="text" name="fLabel" value="${favorite.fLabel}"><br />
		<label>连接：</label> <input type="text" name="fUrl" value="${favorite.fUrl }"><br />
		<label>Tag：</label> <input type="text" name="fTags" value="${favorite.fTags }"><br />
		<label>描述：</label>
		<textarea rows="3" cols="20" name="fDesc">${favorite.fDesc }</textarea>
		<br /> <input type="button" value="取消" onclick="cancle()"> 
		<input type="submit" onclick="test()" value="提交">
	</form>
</body>
<script type="text/javascript">
$(function(){
	showState();	
});
function test(){
	alert( $("input[name='id']").val());
	alert( $("input[name='fLabel']").val());
	alert( $("input[name='fUrl']").val());
	alert( $("input[name='fTags']").val());
	alert( $("textarea[name='fDesc']").val());
	 
}
function showState(){
	var state = $("input[name='state']").val();
	if("error"==state){
		alert("操作失败");
	}else if("success"==state){
		alert("操作成功");
	}
}
function cancle(){
	window.location.href='index.do';
}
</script>
</html>