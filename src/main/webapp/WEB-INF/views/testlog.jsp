<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test Log</title>
</head>
<body>

<form:form action="/login" method="post" modelAttribute="loginform">
	<p>Formulaire</p>
	<form:input path="pseudo"/>
	<form:password path="pass"/>
	<input type="submit" value="Valider">
</form:form>

</body>
</html>