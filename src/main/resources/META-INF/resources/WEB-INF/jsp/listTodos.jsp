
<%@include file="common/header.jspf" %>
<%@ include file = "common/navigation.jspf" %>

<div class="container">
<div>Welcome to ToDo</div>
<div>Login user details: ${name}</div>
<div>Your Todos are</div>

<table class="table">
	<thead>
		<tr>
			<th>Description</th>
			<th>Target date</th>
			<th>isCompleted</th>
			<th></th>
			<th></th>
		</tr>
	</thead>
	
	<tbody>
		<c:forEach items="${todos}" var="todo">
	<tr>
		<td>${todo.description}</td>
		<td>${todo.finalDate}</td>
		<td>${todo.completition}</td>
		
	<td><a href="update-todo?id=${todo.id}" class="btn btn-success">UPDATE</a></td>
	<td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">DELETE</a></td>
</c:forEach>
	</tbody>
</table>
	
	<a href="add-todo" class="btn btn-success">Add ToDo</a>
	
</div>


<%@ include file = "common/footer.jspf" %>