<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>BOOKS</title>
</head>
<body>

<h2>Books</h2>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>author_id</th>
        <th>genre_id</th>
        <th>year</th>
        <th>countOfBooks</th>
    </tr>
    <c:forEach var="books" items="${booksList}">
        <tr>
            <td>${books.id}</td>
            <td>${books.name}</td>
            <td>${books.author_id}</td>
            <td>${books.genre_id}</td>
            <td>${books.year}</td>
            <td>${books.countOfBooks}</td>
            <td>
                <a href="/edit/${books.id}">edit</a>
                <a href="/delete/${books.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

