<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Current Tasks</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/lux/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<p class="message">${ message }</p>
<table class="table">
			<thead>
				<tr>
					<th>Id</th>
					<th>Description</th>
					<th>Due Date</th>
					<th>Completed</th>
					<th>Delete</th>
					<th>Finish Task</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${ items }">
					<tr>
						<td>${item.idtasks }</td>
						<td>${ item.description }</td>
						<td>${ item.dueDate }</td>
						<td><input type="checkbox" value="true" ${ item.completestatus ? 'checked' : '' }></td>
						<td> <a href="/delete?taskid${item.idtasks }">Delete</a></td>
						<td> <a href="/edittask?taskid${item.idtasks }">Finish Task</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<p>
		<a href="/addtask"> Add Task</a>
		</p>
		<p>
		<a href="/logout"> Logout</a>
		</p>
</body>
</html>