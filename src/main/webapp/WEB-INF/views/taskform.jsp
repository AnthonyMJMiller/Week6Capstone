<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/lux/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
	<form action="/addTask" method="post">
		<p>
			<label for="description">Description:</label>
			<input id="description" name="description">
		</p>
		<p>
			<label for="dueDate">Due Date:</label>
			<input id="dueDate" name="dueDate">
		</p>
		<p>
			<label for="isComplete">Complete:</label>
			<select id="isComplete" name="isComplete">
  			<option value="1">True</option>
  			<option value="0">False</option>
			</select>
			
		</p>
		<p>
			<button type="submit">Add Task</button>
		</p>
		</form>
		
		<p>
		<a href="/tasklist">Cancel</a>
		</p>
	</div>
</body>
</html>