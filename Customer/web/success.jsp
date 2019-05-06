<%-- 
    Document   : success
    Created on : May 6, 2019, 8:45:09 PM
    Author     : kusur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="com.mit.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="obj" class="com.mit.CustomerBean"/>
        <jsp:setProperty property="*" name="obj"/>
        <%
            int status = CustomerDAO.insertCustomer(obj);
            if (status > 0) {
                out.println("Inserted successfully..");
            } else {
                out.println("Insertion Fail..");
            }
        %>

    </body>
</html>
