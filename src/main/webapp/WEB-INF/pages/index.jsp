<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
    <h2>index page</h2>
    ${myKay}
    <form action="saveUser" method="post">
        <input type="text" name="username">
        <input type="submit" value="go!">
    </form>
</body>
</html>
