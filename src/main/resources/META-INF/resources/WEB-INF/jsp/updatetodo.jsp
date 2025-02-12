<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

	<head>
	<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
	<title>Update ToDo page</title>
	</head>

<body>
	
	<div class="container">
		<h1>Welcome to Update ToDo page</h1>
	
		
		<form method="post">
		
			Edit your description: <input type="text" path="description">
			<input type="submit" class="btn btn-success">
			
		</form>
	</div>
	
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>

</html>