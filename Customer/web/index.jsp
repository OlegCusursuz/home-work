<%-- 
    Document   : index
    Created on : May 7, 2019, 12:13:33 PM
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
        <form name="add" method="get" action="add.jsp">
            Add Employee: <input type="submit" value="Add" /><br>
        </form>
        
        <form name="edit" action="edit.jsp">
            Edit Employee: <input type="submit" value="Edit" /><br>
        </form>
        
        <form name="delete" action="delete.jsp">
            Delete Employee: <input type="submit" value="Delete" /><br>
        </form>
        
    </body>
</html>
