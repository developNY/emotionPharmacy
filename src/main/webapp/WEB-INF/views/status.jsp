<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery.min.js"></script>
    <style>
        .Rectangle-3 {
            background-color: #ffffff;
            box-shadow: 0 2px 4px 0 rgba(0, 0, 0, 0.21);
        }
        .layer {
            font-family: AppleSDGothicNeoI;
            font-size: 12px;
            text-align: center;
            color: #2046f2;
        }

        .top{
            height: 44%;
        }

        .test{
            background: url('prescription_background-01.png');
            background-size:100% 100%;
            width:550px;
            height:650px;
            background-repeat: no-repeat;
        }
        .b{
            background: url('finalLogo.png');
            background-size:100% 100%;

            height:40px;
            background-repeat: no-repeat;
        }
        .icon{
            margin-top: 30px;
            background: url('emotion-06.png');
            background-size:100% 100%;
            width: 80px;
            height:80px;
            background-repeat: no-repeat;
        }
        .icon{
            margin-top: 20%;
            margin-left:43%;
        }
        .xxxxx{
            text-align: center;
        }
        .xxxxx1{
            text-align: center;
        }

    </style>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-xs-12 Rectangle-3">
            <div class="row">
                <div class="col-xs-4 col-xs-offset-4 col-xs-4 b">

                </div>
            </div>
        </div>
    </div>
    <div class="row" style="width:550px; height:650px;">
        <div class="test">
            <div class="row">
                <div class="xxxx">
                </div>
                <div class="icon" id="icon">
                   <!-- <c:choose>
                        <c:when test="${n eq 0}">
                            <img src="prescription_button_food.png" >
                        </c:when>
                        <c:when test="${n eq 1}">
                            <img src="prescription_button_music.png" >
                        </c:when>
                        <c:when test="${n eq 2}">
                            <img src="prescription_button_image.png" >
                        </c:when>
                    </c:choose> -->
                </div>
                <div class="xxxxx">
                    당신의 기분은 지금 </br> <strong>${emotionText}</strong>
                </div>
                <div>
                    <c:choose>
                        <c:when test="${n == 0}">
                            <img src="prescription_button_food.png" width="100%" height="25%">
                        </c:when>
                        <c:when test="${n == 1}">
                            <img src="prescription_button_music.png" width="100%" height="25%">
                        </c:when>
                        <c:when test="${n == 2}">
                            <img src="prescription_button_image.png" width="100%" height="25%">
                        </c:when>
                    </c:choose>
                </div>
                <div class="xxxxx1">
                    처방을 드려요
                </div>
            </div>
            <div class="row">
                <div class="col-xs-offset-4">

                </div>
            </div>
        </div>
    </div>

</div>
<script>

</script>
</body>
</html>

