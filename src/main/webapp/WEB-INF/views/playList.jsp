<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<style>
    .Rectangle-3 {
        background-color: #ffffff;
        box-shadow: 0 2px 4px 0 rgba(0, 0, 0, 0.21);
    }
    .layer {
        font-family: .AppleSDGothicNeoI;
        font-size: 12px;
        text-align: center;
        color: #2046f2;
    }
    .youtube{
        height:32.4%;
        width: 100%;
    }
    .list{
        height:37%;
        width:100%;
    }
    .trs{
        width:88%;
        height:20%;
    }
</style>
<body>
<div class="container">
    <div class="row">
        <div class="col-xs-12 Rectangle-3">
            <div class="row">
                <div class="col-xs-4 col-xs-offset-4 col-xs-">
                    <h1 class="layer">감정약꾹</h1>
                </div>
            </div>
        </div>
    </div>
    
    <div id="presc">

    	<c:forEach items="${playlist}" var="item" varStatus="it">
    	<c:if test="${it.index eq 0}">
		    <iframe id="ytb" width="600" src="${item.youtubeUrl}?autoplay=1" height="400" frameborder="0" allowfullscreen></iframe>
    	
	</br>
	<p>sdasd</p>
	<table cellpadding="0" border="1" cellpadding="0">
		<colgroup>
			<col width="50px">
			<col width="350px">
		</colgroup>
		</c:if>
		<tr>
			<td><a href="${item.youtubeUrl}"><img src="${item.imageUrl}"></a></td>
			<td style="background-color: #333333; color: white;"><a href="${item.youtubeUrl}">${item.title} ^^ ${item.artist}</a></td>
		</tr>
		</c:forEach>
	</table>
	</div>
</div>
</body>

</html>