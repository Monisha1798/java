<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
first Name:${tempStudent.firstName }
<br><br>
last Name:${tempStudent.lastName }
<br><br>
Country: ${tempStudent.country}

<br><br>

Favorite Language: ${tempStudent.favLang}
<br><br>
Operating Systems:
<c:forEach items="${tempStudent.operatingSystems}" var="current">
<c:out value="${current}"/>
</c:forEach>

</body>
</html>