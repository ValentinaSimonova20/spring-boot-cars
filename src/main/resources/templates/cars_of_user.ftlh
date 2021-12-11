<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Машины</title>
</head>
<body>
<h1>Машины текущего пользователя</h1>
<table>
    <tr>
        <th>ID</th>
        <th>Model</th>
        <th>Color</th>
    </tr>
    <#list cars as car>
        <tr>
            <td>${car.id}</td>
            <td>${car.model}</td>
            <td>${car.color}</td>
        </tr>
    </#list>
</table>
<h1>Свободные машины</h1>
<table>
    <tr>
        <th>ID</th>
        <th>Model</th>
        <th>Color</th>
        <th>Действие</th>
    </tr>
    <#list unusedCars as car>
        <tr>
            <td>${car.id}</td>
            <td>${car.model}</td>
            <td>${car.color}</td>
            <td>
                <form method="post" action="/users/${userId}/cars">
                    <input name="carId" type="hidden" value="${car.id}">
                    <input type="submit" value="Добавить">
                </form>
            </td>
        </tr>
    </#list>
</table>
</body>
</html>