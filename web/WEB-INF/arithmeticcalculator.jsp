<%-- 
    Document   : arithmeticcalculator
    Created on : May 30, 2021, 4:58:33 PM
    Author     : 694952
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
         <form  method="post" action="arithmetic" >
        <table>
            <tr>
                <td>
                    First:
                </td>
                <td>
                    <input type="text" name="first">
                </td>
            </tr>
            <tr>
                <td>
                    Second:
                </td>
                <td>
                    <input type="text" name="second">
                </td>
            </tr>
        </table>
            <p>Result: ${message}</p>
        <input type="submit" value="+" name="plus">
        <input type="submit" value="-" name="minus">
        <input type="submit" value="*" name="multiply">
        <input type="submit" value="%" name="remainder">
        </form>
        <a href="age">Age Calculator</a>
    </body>
</html>
