<%--
  Created by IntelliJ IDEA.
  User: olga
  Date: 06.06.2016
  Time: 12:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  <head>
    <title>Книги</title>
  </head>
  <body>
  <ul>
    <c:forEach items="${bookList}" var="book">
      <li>_ID:${book.id}, _Name: ${book.name}</li>
    </c:forEach>

  </ul>
  </body>
</html>
