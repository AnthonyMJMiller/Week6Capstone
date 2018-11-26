<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adding Task...</title>
</head>
<body>

<h1>Add a task</h1>
		<form action= "addtaskone">
	ID: ${userid} <input type ="hidden" name = "userid" value ="${userid}">
	Description: <input type = "text" name = "taskname"> <br>
	DueDate: <input type = "text" name = "duedate" > <br>
	Completed: <input type = "text" name = "complete" value = "complete"> <br>
	<input type = "submit" class ="btn btn-primary" value ="Add Task">
	 </form>

</body>
</html>