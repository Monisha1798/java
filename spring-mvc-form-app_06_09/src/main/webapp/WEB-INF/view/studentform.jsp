<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="processForm" modelAttribute = "student">
first Name<form:input path = "firstName"/><br/>
last Name<form:input path = "lastName"/><br/>

Country:
		
		<form:select path="country">
		
			<form:options items="${student.countryOptions}" />
			
		</form:select>
				
		<br><br>

		Favorite Language:
		
		Java <form:radiobutton path="favLang" value="Java" />
		C# <form:radiobutton path="favLang" value="C#" />
		PHP <form:radiobutton path="favLang" value="PHP" />
		Ruby <form:radiobutton path="favLang" value="Ruby" />
		<br><br>
		Operating System:
		Linux<form:checkbox path="operatingSystems" value="Linux"/>
		Mac OS<form:checkbox path="operatingSystems" value="Mac OS"/>
		MS Windows<form:checkbox path="operatingSystems" value="MS Windows"/>
		<br><br>
		<input type="submit" value="Submit" />
	
	</form:form>
</body>
</html>