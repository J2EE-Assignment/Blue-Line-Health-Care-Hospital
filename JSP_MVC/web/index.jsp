<%-- 
    Document   : index
    Created on : Mar 15, 2021, 2:21:36 PM
    Author     : Neranji Sulakshika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="ControllerServlet" method="POST">
            Name:<input type="text" name="name" /><br>
            Password:<input type="password" name="password" /><br>
            <input type="submit" value="login" />
        </form>
    </body>
</html>
