<%-- 
    Document   : error
    Created on : Mar 15, 2021, 1:23:00 PM
    Author     : Neranji Sulakshika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor=""blue>
        <font size="5" color="white">Your page generated an error:"<br/>Exception:<br/></font>
        
        <%= exception.toString() %>
    </body>
</html>
