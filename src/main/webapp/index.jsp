<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP - Hello World</title>
    </head>
    <body>
    <h1>
        <%= "Hello World!" %>
    </h1>
    <br/>
    <a href="hello">Hello Servlet</a>
    <br>
    <br> If you want to use "Calculator" you must add into URL operation`s name and values of number1 and number2
    <br> Example: calc?operation=add&number1=100&number2=100
    <br>
    <a href="calc">Calculator</a>
    </body>
</html>