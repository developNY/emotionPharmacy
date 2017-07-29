<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<body>
<c:forEach var="photo" items="${photolist}">
    <img src="${photo.imageUrl}">
</c:forEach>
</body>
</html>