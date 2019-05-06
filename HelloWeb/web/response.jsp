<%@page import="org.mypackage.hello.Num2"%>
<%@page import="org.mypackage.hello.Num1"%>
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
        <jsp:useBean id="add"  class="org.mypackage.hello.Main" />
        <%int m = add.add(5);
            out.print("cube of 5 is " + m);
        %>
    </body>
</html>
