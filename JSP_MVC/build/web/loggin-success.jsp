<%-- 
    Document   : loggin-success
    Created on : Mar 15, 2021, 2:21:20 PM
    Author     : Neranji Sulakshika
--%>

<%@page import="model.LoginBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<p>You are successfully logged in!</p>
<%
    LoginBean bean = (LoginBean)request.getAttribute("bean");
    out.print("Welcome, " + bean.getName());
%>