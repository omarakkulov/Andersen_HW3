<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Редактировать фидбэк</title>
</head>
<body>
<h2>Все фидбэки</h2>
<c:forEach var="feedback" items="${requestScope.feedbacks}">
    <ul>
        <li>Id фидбэка: <c:out value="${feedback.id}"/></li>
        <li>Описание фидбэка: <c:out value="${feedback.description}"/></li>
        <li>Дата фидбэка: <c:out value="${feedback.date}"/></li>
        <li>Id работника: <c:out value="${feedback.employee_id}"/></li>
    </ul>
    <hr/>
</c:forEach>

<h2>Редактирование фидбэка</h2>

<form method="post" action="">
    <label>Редактировать фидбэк с этим id <input type="number" name="id"></label><br>
    <label>Описание фидбэка <input type="text" name="description"></label><br>
    <label>Дата фидбэка <input type="text" name="date"></label><br>
    <label><input type="submit" value="Редактировать" name="Ok"></label><br>
</form>
</body>
</html>
