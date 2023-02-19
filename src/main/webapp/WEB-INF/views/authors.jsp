<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>AUTHORS</title>
</head>
<body>

<h2>Authors</h2>
<table>
    <tr>
        <th>id</th>
        <th>firstName</th>
        <th>lastName</th>
        <th>middleName</th>
        <th>birthDate</th>
    </tr>
    <c:forEach var="authors" items="${authorsList}">
        <tr>
            <td>${authors.id}</td>
            <td>${authors.firstName}</td>
            <td>${authors.lastName}</td>
            <td>${authors.middleName}</td>
            <td>${authors.birthDate}</td>
            <td>
                <a href="/edit/${authors.id}">edit</a>
                <a href="/delete/${authors.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
