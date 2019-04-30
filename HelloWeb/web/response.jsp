<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : response
    Created on : Apr 26, 2019, 3:28:49 PM
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
        <jsp:useBean id="mybean" scope="session" class="org.mypackage.hello.NameHandler" />
        <jsp:useBean id="mysurname" scope="page" class="org.mypackage.hello.SurnameHandler" />
        <jsp:setProperty name="mybean" property="name" />
        <jsp:setProperty name="mysurname" property="surname" />
        <h1>Hello,<jsp:getProperty name="mybean" property="name" /> <jsp:getProperty name="mysurname" property="surname" /> !</h1>
    </body>
</html>
