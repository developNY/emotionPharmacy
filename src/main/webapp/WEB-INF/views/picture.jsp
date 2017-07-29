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
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

	<style>
		.layer {
			font-family: .AppleSDGothicNeoI;
			font-size: 12px;
			text-align: center;
			color: #2046f2;
		}
		.Rectangle-3 {
			background-color: #ffffff;
			box-shadow: 0 2px 4px 0 rgba(0, 0, 0, 0.21);
		}
		.Combined-Shape {
			margin-left: 17.3%;
			margin-right: 17.3%;
			width: inherit;
			height: 86.7px;
			border: solid 1px #979797;
		}
		.Rectangle {
			width: inherit;
			height: 271.5px;
			border: solid 1px #979797;
		}
		.content{
			margin-left: 17.3%;
			margin-right: 17.3%;
			margin-top: 22.7;
		}
		.top_content{
			margin-top: 99.1px;
			margin-left:17.3%;
			margin-right:17.3%;
		}
		.bottom_content{
			margin-top: 39.1px;
			margin-left: 17.3%;
			margin-right: 17.3%;
		}
		.btn {
			border-radius: 83px;
			background-color: #2046f2;
			width: 100%;
		}
	</style>
</head>
<body>
<div class="container">
	<form name="picupload" id="picupload" method="post" action="save" enctype="multipart/form-data">
		<div class="container">
			<div class ="row">
				<div class="col-xs-12 Rectangle-3">
					<div class="row">
						<div class="col-xs-4 col-xs-offset-4 col-xs-">
							<h1 class="layer">감정약꾹</h1>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="Combined-Shape top_content">
				<input type="button">
				</div>
			</div>
			<div class="row">
				<div class="content Rectangle">
					<img style="width:100%; height:inherit;" id="displaypic" onclick="document.all.pic.click();"></br>

					<input type="file" style="display:none;" id="pic" name="multipartFile" accept="file_extension|audio/*|viedo/*|image/*|media_type"/></br></br></br></br>
				</div>
			</div>

			<div class="row">
				<div class="bottom_content">
					<div class="btn">
						<input type="submit" value="감정 분석">
					</div>
				</div>
			</div>
		</div>
	</form>
	<div id="mv">
	</div>
	<script>
	//사진 업로드 및 미리보기
	function readURL(input) {
		if (input.files && input.files[0]) {
			var reader = new FileReader();
	 
			reader.onload = function(e) {
				$("#displaypic").attr("src", e.target.result);
			};
			reader.readAsDataURL(input.files[0]);
		}
	}
	$(function(){

		$("#picupload").submit(function(){
			var pv = $("#pic").val();
			if(pv==""){
				alert("사진을 등록해 주세요^^");				
				return false;
			}
		});
		
		$("#pic").change(function(){
			readURL(this);
		});
	});
	</script>

</body>
</html>
