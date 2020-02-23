<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>WELLCOME TO SHIPMENT TYPE REGISTER PAGE</h3>
	<form:form action="save" method="POST" modelAttribute="shipmentType">
		<pre>
	shipment mode : <form:select path="shipMode">
<form:option value="">--SELECT--</form:option>
	<form:option value="Air">air</form:option>
<form:option value="Trunk">trunk</form:option>
<form:option value="Ship">ship</form:option>
<form:option value="Train">train</form:option>
	
	
	</form:select>
shipment code:
<form:input path="shipCode" />
Enable shipment:
<form:select path="enbShip">
<form:option value="">---select---</form:option>
<form:option value="YES">yes</form:option>
<form:option value="no">no</form:option>
</form:select>
ShipmentGrade:
<form:radiobutton path="shipGrade" value="A" />A
<form:radiobutton path="shipGrade" value="B" />B
<form:radiobutton path="shipGrade" value="C" />c
Description:
<form:textarea path="shipDesc" />
<input type="submit" value="create" />



	</pre>

	</form:form>
	${message}
</body>
</html>