<%-- 
    Document   : agecalculator
    Created on : May 30, 2021, 4:03:02 PM
    Author     : 694952
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
        <table>
            <tr>
                <td>
                    Enter your age:
                </td>
                <td>
                    <input type="text" name="age">
                </td>
            </tr>
        </table>
            <p>${message}</p>
        <input type="submit" value="Age next birthday">
        </form>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
