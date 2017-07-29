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
	
</head>
<body>
	<form name="picupload" id="picupload" method="post" action="save" enctype="multipart/form-data">
	<img width="300" height="300" alt="displaypic" id="displaypic" onclick="document.all.pic.click();"></br>
	<input type="file" style="display:none;" id="pic" name="multipartFile" accept="file_extension|audio/*|viedo/*|image/*|media_type"/></br></br></br></br>
	<input type="submit" value="사진 분석"> 
	<input type="button" value="사진 테스트" id="pictest"> 
	<!--<iframe style="display:none;" width="560" src="https://www.youtube.com/embed/KISgCXPdrFQ?autoplay=1" height="200" frameborder="0" allowfullscreen></iframe>-->
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
		$("#pic").change(function(){
			readURL(this);
		});
		//사진 분석 이동
		/*$("#test").change(function(){
			var a = $("input[name=a]").val();
			//사진 분석 사진업로드
			$.ajax({
				url : "/save",
				enctype : "multipart/form-data",
				data : a,
				success : function(data){  //받아온 data(json)
					console.log(data);

				},
				error : function(){
					alert("에러발생!");
				}
			});*/
			
			//$("#mv").html('<iframe width="560" src="https://www.youtube.com/embed/KISgCXPdrFQ?autoplay=1" height="400" frameborder="0" allowfullscreen></iframe>');
			
			/*$.ajax({
				url : "test.html",
				//enctype : "multipart/form-data",
				//data : picname,
				//dataType : 'JSON',
				success : function(data){  //받아온 data(json)
					//$("#mv").load();
					alert("dddd");
				},
				error : function(){
					alert("에러발생!");
				}
			});*/
			//$("#video").src += "https://www.youtube.com/embed/KISgCXPdrFQ?autoplay=1";
			//$("#video").(display:"inline-block");
			//$("#video").show();
		//});
		
		/* $("#picupload").submit(function(e){
			var picname = $("#pic").val();
			console.log(picname);
			$.ajax({
				url : //업로드경로 '',
				data : ,
				success : function(){
				}
			});
			$("#video").src += "https://www.youtube.com/embed/KISgCXPdrFQ?autoplay=1";
			$("#video").(display:"inline-block");
			$("#video").show();
		}); */
	});
	</script>
</body>
</html>
