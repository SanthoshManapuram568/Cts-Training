<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="logic" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="100%">
<thead>
<th>NAME</th>
<th>EMAIL</th>
</thead>
<tbody>
<!-- use jstl for looping -->
<logic:forEach var ="student" items="$(students)">
<tr>

<td> $(student.name)</td>
<td> $(student.email)</td>
</tr>


</logic:forEach>
</tbody>
</table>
</body>
</html>