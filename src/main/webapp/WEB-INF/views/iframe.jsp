<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>약꾹</title>
	
	<script src="https://code.jquery.com/jquery.min.js"></script>
	<style>
	div {
		-webkit-animation-name: example;
		-webkit-animation-duration: 4s;
		animation-name: example;
		animation-duration: 4s;
	}
	@-webkit-keyframes example {
		from {margin-top: 0%}
		to {margin-top: 100%}
	}
	@keyframes example {
		from {margin-top: 0%}
		to {margin-top: 100%}
	}

	</style>
</head>
<body>
	<input type="button" name="emotion" id="emotion">
<div id="presc">
<iframe id="ytb" width="600" src="https://www.youtube.com/embed/KISgCXPdrFQ" height="400" frameborder="0" allowfullscreen></iframe>
</br>
<p>sdasd</p>
	<table cellpadding="0" border="1" cellpadding="0">
		<colgroup>
			<col width="50px">
			<col width="350px">
		</colgroup>
		<tr>
			<td>썸네일 혹은 앨범사진</td>
			<td style="background-color: #333333; color: white;">제목과 내용</td>
		</tr>
		<tr>
			<td>썸네일 혹은 앨범사진</td>
			<td style="background-color: #333333; color: white;">제목과 내용</td>
		</tr>
		<tr>
			<td>썸네일 혹은 앨범사진</td>
			<td style="background-color: #333333; color: white;">제목과 내용</td>
		</tr>
		<tr>
			<td>썸네일 혹은 앨범사진</td>
			<td style="background-color: #333333; color: white;">제목과 내용</td>
		</tr>
		<tr>
			<td>썸네일 혹은 앨범사진</td>
			<td style="background-color: #333333; color: white;">제목과 내용</td>
		</tr>
	</table>
	</div>
	<script>
		$(function(){
			$("#emotion").click(function(){
				$("#presc").attr(display:"inline-block");
			});
		})
	</script>
</body>
</html>
