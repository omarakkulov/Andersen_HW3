<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добавить пользователя</title>
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

<h2>Создание нового работника</h2>

<form method="post" action="">
    <label>Id работника, где нужно поменять значения ниже <input type="text" name="first_name"></label><br>
    <label>Имя <input type="text" name="first_name"></label><br>
    <label>Фамилия <input type="text" name="last_name"></label><br>
    <label>Email <input type="text" name="email"></label><br>
    <label>Мобильный номер <input type="text" name="phone"></label><br>
    <label>Дата рождения <input type="text" name="date_of_birth"></label><br>
    <label>Опыт <input type="number" name="experience"></label><br>
    <label>Дата начала работы <input type="text" name="date_of_employment"></label><br>
    <label>Уровень программирования <input type="text" name="skill_level"></label><br>
    <label>Уровень английского <input type="text" name="eng_level"></label><br>
    <label>Skype <input type="text" name="skype"></label><br>
    <label>В какой команде состоит (id)<input type="number" name="team_id"></label><br>
    <label>В каком проекте состоит (id)<input type="number" name="project_id"></label><br>
    <label><input type="submit" value="Добавить" name="Ok"></label><br>
</form>
</body>
</html>
