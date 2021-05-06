<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Обновить проект</title>
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
    </ul>
    <hr/>
</c:forEach>

<h2>Обновление проекта</h2>

<form method="post" action="">
    <label>Введите id проекта, где нужно поменять значения ниже<input type="number" name="id"></label><br>
    <label>Название проекта <input type="text" name="name"></label><br>
    <label>Заказчик <input type="text" name="customer"></label><br>
    <label>Продолжительность проекта <input type="number" name="duration"></label><br>
    <label>Методология программирования <input type="text" name="methodology"></label><br>
    <label><input type="submit" value="Обновить" name="Ok"></label><br>
</form>
</body>
</html>
