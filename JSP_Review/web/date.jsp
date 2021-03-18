<%-- 
    Document   : date
    Created on : Mar 15, 2021, 1:49:30 PM
    Author     : Neranji Sulakshika
--%>

<%@page import="java.util.Date" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            Date d = new Date();
        %>
        <h1>
            <% out.println(d.toString());%>
        </h1>
    </body>
</html>
