<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Обновить пользователя</title>
</head>
<body>
<h2>Все работники</h2>
<c:forEach var="employee" items="${requestScope.employees}">
    <ul>
        <li>Id работника: <c:out value="${employee.id}"/></li>
        <li>Имя: <c:out value="${employee.first_name}"/></li>
        <li>Фамилия: <c:out value="${employee.last_name}"/></li>
        <li>Email: <c:out value="${employee.email}"/></li>
        <li>Мобильный номер: <c:out value="${employee.phone}"/></li>
        <li>Дата рождения: <c:out value="${employee.date_of_birth}"/></li>
        <li>Опыт: <c:out value="${employee.experience}"/></li>
        <li>Дата начала работы: <c:out value="${employee.date_of_employment}"/></li>
        <li>Уровень программирования: <c:out value="${employee.skill_level}"/></li>
        <li>Уровень английского: <c:out value="${employee.eng_level}"/></li>
        <li>Skype: <c:out value="${employee.skype}"/></li>
        <li>В какой команде состоит (id): <c:out value="${employee.team_id}"/></li>
        <li>В каком проекте состоит (id): <c:out value="${employee.project_id}"/></li>
    </ul>
    <hr/>
</c:forEach>

<h2>Удалить работника по id</h2>

<form method="post" action="">
    <label>Id работника<input type="text" name="id"></label><br>
    <label><input type="submit" value="Удалить" name="Ok"></label><br>
</form>
</body>
</html>
