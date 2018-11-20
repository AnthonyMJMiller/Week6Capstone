<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Registration</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/lux/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
	<form action="/adduser" method="post">
		<p>
			<input id="id" name="id" type="hidden">
		</p>
		<p>
			<label for="email">Email:</label>
			<input id="email" name="email" pattern="\w{5,30}@\w{5,10}[.]\w{2,4}" type="text" required>
		</p>
		<p>
			<label for="password">Password:</label>
			<input id="password" name="password" type="password" required>
		</p>
		<p>
			<label for="name">Full Name:</label>
			<input id="name" name="name" type="text" pattern="[A-Za-z]{2,}\s[A-Za-z]{2,}" required>
		</p>
		<p>
			<button type="submit">Login</button>
		</p>
		</form>
	</div>
</body>
</html>