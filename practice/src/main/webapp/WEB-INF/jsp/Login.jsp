<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee</title>
</head>
<body>

	<div id="welcome">
		<form:form action="/welcome" 
			modelAttribute="login">
			<p>
				<label>Enter Employee Id</label>
				<form:input path="username" />
			</p>
			<p>
				<label>Enter Name</label>
				<form:input path="password" />
			</p>
			<input type="SUBMIT" value="Submit" />
		</form:form>
	</div>
</body>
</html>