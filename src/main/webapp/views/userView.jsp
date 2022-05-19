<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<font color='green'>${msg}</font>
	<form:form action="user" method="POST" modelAttribute="user">
		Name : <form:input path="uname"/> <br/>
		Email : <form:input path="email"/> <br/>
		Phno : <form:input path="phno"/> <br/>
		<input type="submit" value="Submit"/>
	</form:form>

</body>
</html>
