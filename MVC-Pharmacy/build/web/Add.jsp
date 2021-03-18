<%-- 
    Document   : Add
    Created on : Mar 15, 2021, 3:25:32 PM
    Author     : nera
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
            Drug ID:<input type="text" name="id" /><br>
            Drug Name:<input type="text" name="name" /><br>
            Quantity:<input type="text" name="qty" /><br>            
            <input type="submit" name="add" value="ADD" />
        </form>
    </body>
</html>
