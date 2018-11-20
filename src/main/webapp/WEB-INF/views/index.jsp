<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Home</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/lux/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container">

	<br>
	<h1>Log in!</h1>

	<p class="message">${ message }</p>
	<form action="/login" method="post">
		<p>
			<label for="email">Email:</label>
			<input id="email" name="email" type="email" required>
		</p>
		<p>
			<label for="password">Password:</label>
			<input id="password" name="password" type="password" required>
		</p>
		<p>
			<button type="submit">Login</button>
		</p>
		</form>
		<p>
			<a href="/userentry">New User</a>
		</p>
	
</div>
</body>
</html>