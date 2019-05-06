<%-- 
    Document   : emplpoyeeShow
    Created on : May 3, 2019, 3:07:14 PM
    Author     : kusur
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="e" scope="page" class="employeeService.Employee" />
        <jsp:setProperty name="e" property="*" />
        
        <table border="1">
            <thead>
                <tr>
                    <th></th>
                    <th> <jsp:getProperty name="e" property="name" /></th>
                    <th> <jsp:getProperty name="e" property="surname" /></th>
                    <th><jsp:getProperty name="e" property="position" /></th>
                    <th><jsp:getProperty name="e" property="year" />-
                        <jsp:getProperty name="e" property="month" />-
                        <jsp:getProperty name="e" property="day" /></th>
                    <th> <jsp:getProperty name="e" property="adres" /></th>
                </tr>
            </thead>
            <tbody>
            </tbody>
        </table>

    </body>
</html>
