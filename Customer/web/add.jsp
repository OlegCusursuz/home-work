<%-- 
    Document   : add
    Created on : May 7, 2019, 12:13:14 PM
    Author     : kusur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <form name="add" method="get" action="success.jsp">
            Employee Name: <input type="text" name="name"><br>
            Employee Surname: <input type="text" name="surname"><br>
            Employee Position: <select name="position">
                <option>Programmer</option>
                <option>Accountant</option>
                <option>HR Manager</option>
                <option>Cleaner</option>
            </select><br>
             Employee Birthday: <input type="text" name="ldBirthday" value="Year-Month-Day"/><br>
              Adres: <input type="text" name="adres"/><br>
            <input type="submit" value="submit">
        </form>
    </body>
</html>
