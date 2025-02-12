<%@include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<div class="container">
<h1>Add your ToDo</h1>
	<form:form method="post" modelAttribute="todo">

	<fieldset class="mb-3">
	<form:label path="description">Description</form:label>
	<form:input type="text" path="description" required="required"/>
	<form:errors path="description" cssClass="text-warning"/>
	
</fieldset>

	<fieldset class="mb-3">
	<form:label path="finalDate">Target Date</form:label>
	<form:input type="text" path="finalDate" required="required"/>
	<form:errors path="finalDate" cssClass="text-warning"/>
	
</fieldset>
	<form:input type="hidden" path="id"/>
	<form:input type="hidden" path="completition"/>

	<input type="submit" class="btn btn-success">

	</form:form>
</div>
	<%@ include file = "common/footer.jspf" %>


<script type="text/javascript">
	
	$('#finalDate').datepicker({
	  		format: 'yyyy-mm-dd'
	});
</script>

