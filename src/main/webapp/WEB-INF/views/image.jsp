<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>

        /* Remove the navbar's default margin-bottom and rounded borders */


        /* Add a gray background color and some padding to the footer */

        .footer {
            width: 45.3px;
            height: 44.2px;
            transform: rotate(-345deg);
        }

        .oo {
            width: 136px;
            height: 66px;
            font-family: .AppleSDGothicNeoI;
            font-size: 16px;
            font-weight: 300;
            line-height: 1.38;
            text-align: center;
            color: #a1a1a1; }

        .-copy .text-style-1 {
            font-weight: 600;  }

        .carousel-inner img {
            width: 100%; /* Set width to 100% */
            margin: auto;
            min-height:200px;
        }

        /* Hide the carousel text when the screen is less than 600 pixels wide */
        @media (max-width: 600px) {
            .carousel-caption {
                display: none;
            }
        }
    </style>
</head>
<body>

<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
    </ol>

    <div class="container text-center">
        <img src="logo.png" style="width:100%">
        </br>
        <div class="row">
            <div class="col-sm-4">
                <img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image">
                </br>
            </div>
            <div class="col-sm-4">
                <img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image">
            </div>
            </br>
            <div class="col-sm-4">
                <img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image">
            </div>
            <div class="oo">
                <center><p>기분이 나아지셨나요?
                    또 놀러오세요
                    저희 감정약꾹에</p></center>
            </div>
        </div>
    </div><br>

    <footer class="container-fluid text-center">
        <img src="prescription_stamp.png">
    </footer>

</body>
</html>