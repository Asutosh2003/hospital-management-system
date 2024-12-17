<%-- 
    Document   : regn
    Created on : 13 Nov, 2024, 11:11:47 AM
    Author     : asuto
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, java.io.*,static java.lang.System.out" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        

        <%
          String name=request.getParameter("name");
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        String catagory =request.getParameter("catagory");
          
          try{
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","");
          PreparedStatement ps = con.prepareStatement("INSERT INTO hospital (name, email, password, catagory) VALUES (?, ?, ?, ?)");
          ps.setString(1, name);
          ps.setString(2,email);
          ps.setString(3,password);
          ps.setString(4, catagory);
          int x=ps.executeUpdate();
          if(x>0){
              out.println("Registration Successful");
          }
          else{
              out.println("Unsuccessful");
          }
          }
          catch(Exception e){
              out.println(e);
          }
          out.close();
        %>
    </body>
</html>
