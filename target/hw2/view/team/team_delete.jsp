<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete team</title>
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


<h2>Удаление команды</h2>

<form method="post" action="">
    <label>Введите id команды, которую нужно удалить <input type="number" name="team_id"></label>
    <label><input type="submit" value="Удалить" name="delete"></label>
</form>
</body>
</html>
