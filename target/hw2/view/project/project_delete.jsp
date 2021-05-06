<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добавить проект</title>
</head>
<body>
<h2>Все проекты</h2>
<c:forEach var="project" items="${requestScope.projects}">
    <ul>
        <li>Id команды: <c:out value="${project.id}"/></li>
        <li>Название проекта: <c:out value="${project.name}"/></li>
        <li>Заказчик: <c:out value="${project.customer}"/></li>
        <li>Продолжительность проекта: <c:out value="${project.duration}"/></li>
        <li>Методология программирования: <c:out value="${project.methodology}"/></li>
        <li>Номер команды, работающей над проектом: <c:out value="${project.team_id}"/></li>
    </ul>
    <hr/>
</c:forEach>

<h2>Создание нового проекта</h2>

<form method="post" action="">
    <label>Номер проекта, который необходимо удалить <input type="number" name="id"></label><br>
    <label><input type="submit" value="Удалить" name="Ok"></label><br>
</form>
</body>
</html>
