<!doctype html>
<#import "spring.ftl" as spring/>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Пользователи</title>
</head>
<body>
<h1>Добавление пользователя</h1>
<form method="post" action="/users">
    <label> <@spring.message 'users.form.input.firstName'/>:
        <input name="firstName" placeholder="<@spring.message 'users.form.input.firstName'/>">
    </label>
    <label><@spring.message 'users.form.input.lastName'/>
        <input name="lastName" placeholder="<@spring.message 'users.form.input.lastName'/>">
    </label>
    <input type="submit" value="<@spring.message 'users.form.input.submit'/>">
</form>
<table>
    <tr>
        <th>ID</th>
        <th><@spring.message 'users.table.header.firstName'/></th>
        <th><@spring.message 'users.table.header.lastName'/></th>
        <th><@spring.message 'users.table.header.action'/></th>
    </tr>
    <#list users as user>
        <tr>
            <td>${user.id}</td>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
            <td>
                <form method="post" action="/users/${user.id}/delete">
                    <input type="submit" value="Удалить">
                </form>
                <a href="/users/${user.id}/">Перейти</a>
            </td>
        </tr>
    </#list>
</table>
</body>
</html>