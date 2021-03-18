<%-- 
    Document   : index
    Created on : Mar 15, 2021, 1:22:21 PM
    Author     : Neranji Sulakshika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="error.jsp" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
            .big{
                font-family: Arial,Verdana,sans-serif;
                font-size: 2em;
                font-weight: bold;
            }
        </style>
    </head>
    
    <body>
        <h1>Hello World!</h1>
        <%out.println("This is JSP page");%>
        <p align="center">
            <font color="red" size="7">
                <%= "Java Server Pages" %>
            </font>
        </p>
        <p align=""center>
            <font color="green" size="15" face="Arial">
                <%= "Welcome to JSP coding" %>
            </font>
        </p>
        <%! int num1; %>
        <%! int num2; %>
        <%! int ans; %>
        <% 
                num1=45;
                num2=Integer.parseInt("32");
                ans = num1 + num2;
                out.println("The result is = " + ans);
        %>
        <p class="big"> Current Date & Time is :-
            <%@include file="date.jsp" %>            
        </p>
        
        <form method="post">
            <table border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td>Enter a number: </td>
                    <td><input type="text" name="txtNum" />
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td><input type="submit" name="B1" value="Divide by zero" />
                </tr>
            </table>
        </form>
        <%
        if(request.getParameter("txtNum") != null)
        {
            if(!request.getParameter("txtNum").equals(" "))
            {
                int div = Integer.parseInt(request.getParameter("txtNum")) / 0;
                out.println("Answer is: " + div);
            }
        }
        else
        {
            out.println("<html><font color=red>Please enter a number!</font></html>");
        }
        %>
    </body>
</html>