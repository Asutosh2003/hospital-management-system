<%-- 
    Document   : login
    Created on : 13 Nov, 2024, 5:08:37 PM
    Author     : asuto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ page import="java.sql.*, java.io.*,static java.lang.System.out" %>
        <%
          
        String email=request.getParameter("email");
        String password=request.getParameter("password");
          try{
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","");
          PreparedStatement ps = con.prepareStatement("select * from hospital where email=? and password=?");
          ps.setString(1,email);
          ps.setString(2,password);
          ResultSet rs=ps.executeQuery();
          if(rs.next()){
               HttpSession session1=request.getSession();
                String name = rs.getString("name");
                session1.setAttribute("name",name);
                String catagory = rs.getString("catagory");
                if(catagory.equals("admin")){
                    response.sendRedirect("../dashboard/adminDashboard.jsp");
                }
                else if(catagory.equals("doctor")){
                    response.sendRedirect("../dashboard/dashboard.jsp");
                }
                else if(catagory.equals("user")){
                    response.sendRedirect("../dashboard/dashboard_1.jsp");
                }
             
             
          }
          else{
              out.println("Unsuccessful");
          }
          }
          catch(Exception e){
              out.println(e);
          }
        %>
    </body>
</html>
