<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Редактирование</title>
</head>
<body>
<h2>Все команды</h2>
<c:forEach var="team" items="${requestScope.teams}">
    <ul>
        <li>Id команды: <c:out value="${team.id}"/></li>
        <li>Название команды: <c:out value="${team.name}"/></li>
    </ul>
    <hr/>
</c:forEach>

<h2>Создание новой команды</h2>

<form method="post" action="">
    <label>Введите id команды, чье название нужно поменять<input type="number" name="id"></label><br>
    <label>Введите новое имя команды <input type="text" name="name"></label><br>
    <label><input type="submit" value="Редактировать" name="Ok"></label><br>
</form>
</body>
</html>
